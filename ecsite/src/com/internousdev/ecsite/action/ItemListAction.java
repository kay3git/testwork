package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemListAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfo=new ArrayList<ItemInfoDTO>();
	private String deleteFlg;
	private String message;

	public String execute()throws SQLException{
		/*if(!session.containsKey("login_user_id")){
			return  ERROR;
		}*/
		if(deleteFlg == null){
			/*String item_transaction_id=session.get("item_Name").toString();*/
			itemInfo=itemListDAO.getItemListInfo();
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result=SUCCESS;
		return result;
	}
	public void delete()throws SQLException{

		int res=itemListDAO.itemListHistoryDelete();

		if(res>0){
			itemInfo=null;
			setMessage("商品リストを正しく削除しました。");
		}else if(res==0){
			setMessage("商品リストの削除に失敗しました。");
		}
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg=deleteFlg;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public  Map<String,Object> getSession(){
		return session;
	}
	public ArrayList<ItemInfoDTO> getItemInfo(){
		return itemInfo;
	}

	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message=message;
	}


}
