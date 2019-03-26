package com.internousdev.ecMidium.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecMidium.dao.BuyItemDAO;
import com.internousdev.ecMidium.dao.LoginDAO;
import com.internousdev.ecMidium.dto.BuyItemDTO;
import com.internousdev.ecMidium.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	private String loginUserId;
	private String loginPassword;
	public Map<String, Object>session;
	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

				session.put("login_id", loginDTO.getLoginUserId());
				session.put("id", buyItemDTO.getId());
				session.put("buyItem_name", buyItemDTO.getItemName());
				session.put("buyItem_price", buyItemDTO.getItemPrice());

				System.out.println(session.put("login_id", loginDTO.getLoginUserId()));
				System.out.println(session.put("login_pass", loginDTO.getLoginPassword()));
				return result;

		}
		return result;
	}
	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}
