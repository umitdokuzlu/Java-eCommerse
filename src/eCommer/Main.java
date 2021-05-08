package eCommer;

import eCommer.business.abstracts.UserService;
import eCommer.business.concretes.UserManager;
import eCommer.core.GoogleServiceManager;
import eCommer.dataAccess.concretes.HibernateUserDao;
import eCommer.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService user = new UserManager(new HibernateUserDao(),new GoogleServiceManager());
		UserService user2 = new UserManager(new HibernateUserDao());
		user2.register(new User(1,"ümit","dokuzlu","umut@gmail.com","1234567"));
		//user.register(new User(1,"ümit","dokuzlu","umut@gmail.com","1234567"));
		System.out.println("----------------------------------------------------");
		user.otherLogin(new User(1,"ümit","dokuzlu","umut@gmail.com","1234567"));
		//user.register(new User(2,"melih","yýldýrým","umut@gmail.com","12345677"));
		System.out.println("-----------------------------------------------------");
		UserService user3 = new UserManager(new HibernateUserDao());
		user3.login(new User(3,"melih","yýldýrým","melih@gmail.com","12345678"));

	}

}
