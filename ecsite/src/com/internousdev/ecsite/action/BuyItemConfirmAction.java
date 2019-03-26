package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String pay;
	private String error;

	public String execute()throws SQLException{
		String result=ERROR;
		String payment;
		if(pay.equals("2")){
			payment="現金払い";
			session.put("pay",payment);
		}else if(pay.equals("3")){
			payment="クレジットカード";
			session.put("pay",payment);
		}else{
			setError("支払い方法を選択してください。");
			System.out.println(error);
			return ERROR;
		}

		        result=SUCCESS;
		return result;
	}




	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public String pay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay=pay;
	}
	public void setError(String error){
		this.error=error;
	}
	public String getError(){
		return error;
	}

}
