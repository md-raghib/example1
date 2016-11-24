package service;

import com.csc.bean.User;

import dao.LoginDAO;


public class LoginService {
	
	public User log(User user)
	{
		LoginDAO.connect();
		 LoginDAO.loginUser(user);
		 System.out.println(user);
		 return user;
		
		
	}
	
	
	
	
}
