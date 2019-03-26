package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteConfirmAction extends ActionSupport implements SessionAware{
	String logout;

	public Map<String ,Object> session;
	public String execute(){

		return SUCCESS;
	}


	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public void setLogout(String logout){
		this.logout=logout;
	}

}
