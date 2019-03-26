package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	public Map<String,Object> session;
	private LoginDAO loginDAO=new LoginDAO();
	private LoginDTO loginDTO=new LoginDTO();
	/*private BuyItemDAO buyItemDAO=new BuyItemDAO();*/
	private String errorMsg;
	private String adminFlg;


	public String execute(){
		String result=ERROR;
		loginDTO=loginDAO.getLoginUserInfo(loginUserId, loginPassword);
        session.put("loginUser", loginDTO);
        /*session.put("admin_flg", loginDTO.getAdminFlg());*/

        if(((LoginDTO)session.get("loginUser")).getLoginFlg()){

          	session.put("login_user_id", loginDTO.getLoginId());
			session.put("user_name", loginDTO.getUserName());
			result=SUCCESS;
	        if((((LoginDTO)session.get("loginUser")).getAdminFlg() != null)){
	        	session.put("admin_flg", loginDTO.getAdminFlg());
	            result="admin";
	        }

		}else{
			setErrorMsg("ログインに失敗しました。");
		}

        System.out.println(((LoginDTO)session.get("loginUser")).getAdminFlg());
        return result;
    }
	public void setErrorMsg(String errorMsg){
		this.errorMsg=errorMsg;
	}
	public String getErrorMsg(){
		return errorMsg;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId=loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword=loginPassword;
	}
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public String getAdminFlg(){
		return adminFlg;
	}
	public void setAdminFlg(String adminFlg){
		this.adminFlg=adminFlg;
	}

}
