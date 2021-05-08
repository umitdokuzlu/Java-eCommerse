package eCommer.dataAccess.concretes;

import java.util.List;

import eCommer.dataAccess.abstracts.UserDao;
import eCommer.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("veri tabanýna eklendi : Hibernate " + user.geteMail());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(User user) {
		return null;
	}

	@Override
	public List<User> getAllUser() {
		return null;
	}

}
