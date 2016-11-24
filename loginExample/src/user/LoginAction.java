package user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.csc.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import service.LoginService;
  
  
@SuppressWarnings({ "serial", "rawtypes" })
public class LoginAction extends ActionSupport implements ServletRequestAware,ModelDriven{  
 
	
	User user=new User();
	HttpSession session;
	
public Object getModel() {
		
		return user;
	}

  
  
  
public String execute(){
	LoginService ls=new LoginService();
	User au=ls.log(user);
	System.out.println("in action"+user.getFirstName());
	System.out.println("in action"+user.getEmail());
	au.setFirstName(user.getFirstName());
	au.setEmail(user.getEmail());
	System.out.println("au="+au.getEmail());
	session.setAttribute("name",au.getFirstName());
	return SUCCESS;
  
}

public User getUser() {
	return user;
}




public void setUser(User user) {
	this.user = user;
}




public void setServletRequest(HttpServletRequest request) {
	this.session=request.getSession();
	
}  

 

  
}  
