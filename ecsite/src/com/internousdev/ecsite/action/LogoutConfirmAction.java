package com.internousdev.ecsite.action;


import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutConfirmAction extends ActionSupport implements SessionAware{
	private String question;
	public Map<String ,Object> session;
	private String message;
	public String execute(){
		String result=ERROR;

		if(question.equals("はい")){
			result=SUCCESS;
			session.clear();
			setMessage("ログアウトしました。");

		}else{
			return result;
		}
		System.out.println(message);
		return result;
	}

	public void setQuestion(String question){
		this.question=question;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public void setMessage(String message){
		this.message=message;
	}
    public String getMessage(){
		return message;
	}

}
