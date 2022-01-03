package adam.SpringJpaPratice.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ConfigurationProperties("oracle")
public class OracleConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean(name="adamDataSource")
	DataSource adamDataSource() {
		String url = environment.getProperty("spring.datasource.url");
		String username = environment.getProperty("spring.datasource.username");
		String password = environment.getProperty("spring.datasource.password");

		int initSize = Integer.parseInt(environment.getProperty("spring.datasource.dbcp2.initial-size"));
		int minIdle = Integer.parseInt(environment.getProperty("spring.datasource.dbcp2.min-idle"));
		int maxIdle = Integer.parseInt(environment.getProperty("spring.datasource.dbcp2.max-idle"));
		int totalIdle = Integer.parseInt(environment.getProperty("spring.datasource.dbcp2.max-total"));
		String validationQuery = environment.getProperty("spring.datasource.dbcp2.validation-query");
		
		BasicDataSource dbcp2 = new BasicDataSource();
		dbcp2.setUrl(url);
		dbcp2.setUsername(username);
		dbcp2.setPassword(password);
		dbcp2.setInitialSize(initSize);
		dbcp2.setMinIdle(minIdle);
		dbcp2.setMaxIdle(maxIdle);
		dbcp2.setMaxTotal(totalIdle);
		dbcp2.setValidationQuery(validationQuery);

		return dbcp2;
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate jdbcTemplate(@Qualifier("adamDataSource") DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public PlatformTransactionManager paPlatformTransactionManager(@Qualifier("adamDataSource") DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
}
