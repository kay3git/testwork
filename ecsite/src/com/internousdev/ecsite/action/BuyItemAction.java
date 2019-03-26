package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;



public class BuyItemAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private int count;

	private int id;

	private BuyItemDAO buyItemDAO=new BuyItemDAO();







	public String execute(){
		String result=SUCCESS;
	    BuyItemDTO buyItemDTO=buyItemDAO.getBuyItemInfo(id);
		session.put("id", buyItemDTO.getId());
		session.put("buyItem_name", buyItemDTO.getItemName());
		session.put("buyItem_price", buyItemDTO.getItemPrice());
		session.put("count", getCount());
		/*int intCount=Integer.parseInt(session.get("count").toString());*/
		int intPrice=Integer.parseInt(session.get("buyItem_price").toString());
		session.put("total_price",count*intPrice);
		System.out.println(session);


	    return result;

}




	public void setId(int id){
		this.id=id;
	}
	public void setCount(int count){
		this.count=count;
	}
	public int getCount(){
		return count;
	}
	/*public void setPay(String pay){
		this.pay=pay;
	}*/
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
