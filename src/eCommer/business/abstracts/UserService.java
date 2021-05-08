package eCommer.business.abstracts;

import eCommer.entities.concretes.User;

public interface UserService {
	void login(User user);
	void register(User user);
	void otherLogin(User user);
	void otherRegister(User user);
}
