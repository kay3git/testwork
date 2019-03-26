package com.internousdev.ecsite.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

//public class UserCreateAction extends ActionSupport{
public class UserCreateAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String execute(){
		if(((LoginDTO)session.get("loginUser")).getAdminFlg().equals("1")){
			return SUCCESS;
		}
		return ERROR;
	}

	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
}
