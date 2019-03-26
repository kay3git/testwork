package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();
	private BuyItemDTO buyItemDTO=new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(int id){
		String sql="SELECT id,item_name,item_price FROM item_info_transaction where id=?";


		try{
			PreparedStatement ps=con.prepareStatement(sql);

			ps.setInt(1,id);

			ResultSet rs=ps.executeQuery();



			if(rs.next()){
				buyItemDTO.setId(rs.getInt("id"));
				buyItemDTO.setItemName(rs.getString("item_name"));
				buyItemDTO.setItemPrice(rs.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buyItemDTO;
	}
	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}
}
