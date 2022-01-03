package adam.SpringJpaPratice.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages= {"adam.SpringJpaPratice.repository.jpa"},
repositoryImplementationPostfix="Impl",
		entityManagerFactoryRef="entityManagerFactory", transactionManagerRef="platformTransactionManager")
@EnableTransactionManagement
public class JpaConfig {
	
	@Autowired
	@Qualifier("adamDataSource")
	private DataSource dataSources;
	
	@Autowired
	private Environment env;
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(dataSources).properties(getJpaProperties()).persistenceUnit("persistenceUnit").packages("adam.SpringJpaPratice.pojo").build();
	}
	
	private Map<String, String> getJpaProperties() {
		Map<String, String> jpaProeprties = new HashMap<>(); 
		jpaProeprties.put("spring.jpa.database-platform", env.getProperty("spring.jpa.database-platform"));
		jpaProeprties.put("spring.jpa.show-sql", env.getProperty("spring.jpa.show-sql"));
		jpaProeprties.put("spring.jpa.hibernate.naming.physical-straegy", env.getProperty("spring.jpa.hibernate.naming.physical-straegy"));
		jpaProeprties.put("spring.jpa.hibernate.naming.implicit-straegy", env.getProperty("spring.jpa.hibernate.naming.implicit-straegy"));
		return jpaProeprties;
	}

	@Bean
	PlatformTransactionManager platformTransactionManager(EntityManagerFactoryBuilder builder) {
		return new JpaTransactionManager(entityManagerFactory(builder).getObject());
	}
}
