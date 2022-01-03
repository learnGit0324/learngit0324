package adam.SpringJpaPratice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import adam.SpringJpaPratice.pojo.User;
import adam.SpringJpaPratice.pojo.UserDO;
import adam.SpringJpaPratice.repository.BasicRepository;
import adam.SpringJpaPratice.repository.jpa.UserRepository;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
@TestPropertySource(locations="classpath:application.properties")
public class AppTest {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	public JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	BasicRepository basicRepository;
	
	@Test
	public void test_validation_query() {
		jdbcTemplate.execute("insert into Student values (1, 'Lei', 13, 'Hangzhou')");
		
	}
	
	@Test
	public void test_call_sp_to_insert() {
		List<User> users = new ArrayList<>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("Jack");
		user1.setAge(14);
		user1.setAddress("Hangzhou");
		User user2 = new User();
		user2.setId(2);
		user2.setName("Lee");
		user2.setAge(15);
		user2.setAddress("Shanghai");
		users.add(user1);
		users.add(user2);
		basicRepository.saveUser(users);
	}
	
	@Test
	public void test_jpa_query_by_id() {
		List<UserDO> list = userRepository.findAllById(1);
		System.out.println(list.size());
	}
}
