package eCommer.dataAccess.abstracts;

import java.util.List;

import eCommer.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getUser(User user);
	List<User> getAllUser();
}
