package eCommer.core;

import eCommer.entities.concretes.User;
import eCommer.registerWithGoogle.GoogleRegister;

public class GoogleServiceManager implements OtherLoginService{

	@Override
	public void otherLogin(User user) {
		GoogleRegister google=new GoogleRegister();
		google.register();
	
		System.out.println("giri� yapt�n�z " + user.getFirstName());
	}

}
