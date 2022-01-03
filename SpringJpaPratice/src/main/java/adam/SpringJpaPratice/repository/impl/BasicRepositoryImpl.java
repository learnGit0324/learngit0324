package adam.SpringJpaPratice.repository.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Repository;

import adam.SpringJpaPratice.pojo.User;
import adam.SpringJpaPratice.repository.BasicRepository;
import oracle.jdbc.driver.OracleConnection;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

@Repository
public class BasicRepositoryImpl implements BasicRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void saveUser(List<User> users) {
		Object[][] userObjs = new Object[users.size()][4];
		for (int i = 0; i < users.size(); i++) {
			Object[] userObj = new Object[4];
			userObj[0] = users.get(i).getId();
			userObj[1] = users.get(i).getName();
			userObj[2] = users.get(i).getAge();
			userObj[3] = users.get(i).getAddress();
			userObjs[i] = userObj;
		}
		List<SqlParameter> params = Arrays.asList(new SqlParameter(Types.ARRAY));
		
		jdbcTemplate.call(new CallableStatementCreator() {
			@SuppressWarnings("deprecation")
			@Override
			public CallableStatement createCallableStatement(Connection con) throws SQLException {
				OracleConnection oracleConnection = con.unwrap(OracleConnection.class);
				ArrayDescriptor arrayDescriptor = ArrayDescriptor.createDescriptor("USER_ARRAY", oracleConnection);
				ARRAY array = new ARRAY(arrayDescriptor, oracleConnection, userObjs);
				CallableStatement cs = con.prepareCall("{CALL UserOperation(?)}");
				cs.setObject(1, array);
				return cs;
			}
		}, params);
	}

}
