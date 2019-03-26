package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserListDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserListDAO {
	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	public ArrayList<UserListDTO> getUserList()throws
	SQLException{
		ArrayList<UserListDTO> userListDTO=new ArrayList<UserListDTO>();
		String sql="SELECT * FROM login_user_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);


			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				UserListDTO dto=new UserListDTO();
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPassword(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsert_date(rs.getString("insert_date"));
				userListDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return userListDTO;
	}

	public int UserListHistoryDelete()throws
	SQLException{
		String sql="DELETE FROM login_user_transaction";

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
