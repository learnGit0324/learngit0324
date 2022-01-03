package adam.SpringJpaPratice.repository;

import java.util.List;

import adam.SpringJpaPratice.pojo.User;

@FunctionalInterface
public interface BasicRepository {
	public void saveUser(List<User> users);
}
