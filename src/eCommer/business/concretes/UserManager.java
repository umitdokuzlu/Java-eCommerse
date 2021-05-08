package eCommer.business.concretes;

import java.util.regex.Pattern;

import eCommer.business.abstracts.UserService;
import eCommer.core.OtherLoginService;
import eCommer.dataAccess.abstracts.UserDao;
import eCommer.entities.concretes.User;

public class UserManager implements UserService {
	
	UserDao userDao; 
	OtherLoginService otherLogin;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}


	public UserManager(UserDao userDao,OtherLoginService otherLogin) {
		this.userDao = userDao;
		this.otherLogin=otherLogin;
	}

	@Override
	public void login(User user) {
		if(user.getFirstName()!=" " && user.geteMail() !=" " && isValidEmail(user)) {
			System.out.println("giriþ yaptýnýz " + user.getFirstName());
		}else {
			System.out.println("tüm alanlarý eksiksiz doldurunuz");
		}
		
	}

	@Override
	public void register(User user) {
		if(compulsory(user) && isValidEmail(user) && user.getPassword().length()>6 && user.getFirstName().length()>2 && user.getLastName().length()>2 && isExistValid() ) {
			userDao.add(user);
			System.out.println("giriþ yaptýnýz");
			System.out.println("doðrulama mesajý gönderildi");
		}else {
			System.out.println("tüm alanlarý doldurunuz");
		}
		
	}
	public boolean compulsory(User user) {
		if(user.getFirstName()==" " && user.getLastName() == " " && user.geteMail()==" " && user.getPassword() ==" ") {
			return true;
		}
		return true;
	}
	public boolean isValidEmail(User user) {
		String pattern = "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

        Pattern pat = Pattern.compile(pattern);
        if (user.geteMail() == null)
            return false;
        return pat.matcher(user.geteMail()).matches();
    }
	
	public boolean isExistValid() {
		userDao.getAllUser();
		return true;
	}

	@Override
	public void otherLogin(User user) {
		otherLogin.otherLogin(user);
		
		
	}

	@Override
	public void otherRegister(User user) {
		// TODO Auto-generated method stub
		
	}

}
