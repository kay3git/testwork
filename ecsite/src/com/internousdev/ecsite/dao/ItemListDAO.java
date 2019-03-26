package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
public class ItemListDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	public ArrayList<ItemInfoDTO> getItemListInfo()throws
	SQLException{
		ArrayList<ItemInfoDTO> itemListDTO=new ArrayList<ItemInfoDTO>();
		String sql="SELECT * FROM item_info_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);


			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO dto=new ItemInfoDTO();
				dto.setItemName(rs.getString("item_name"));
				dto.setItemPrice(rs.getString("item_Price"));
				dto.setItemStock(rs.getString("item_Stock"));
				dto.setInsert_date(rs.getString("insert_date"));
				itemListDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return itemListDTO;
	}

	public int itemListHistoryDelete()throws
	SQLException{
		String sql="DELETE FROM item_info_transaction";

		PreparedStatement ps;
		int result=0;
		try{
			ps=con.prepareStatement(sql);
			result=ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;

	}




}
