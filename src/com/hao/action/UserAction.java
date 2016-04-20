package com.hao.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String add() {

		System.out.println("add");
		return SUCCESS;
	}
	
	public String update() {
		
		System.out.println("update");
		return SUCCESS;
	}

	
}
