package com.hao.action;

import com.hao.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	
	public String login() {
		
		/*if(user.getUsername()==null
				|| "".equals(user.getUsername())){
			this.addFieldError("username", "username can not be empty");
			return INPUT;
		}*/
		
		System.out.println("login");
		System.out.println(user.getUsername());
		System.out.println(user.getBookList().get(0));
		
		
		
		return SUCCESS;
	}
	@Override
	public User getModel() {
		return user;
	}
	@Override
	public void validate() {
		if(user.getUsername()==null
				|| "".equals(user.getUsername())){
			this.addFieldError("username", "username can not be empty");
		}
	}
	
	
}
