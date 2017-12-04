package com.ctgu.qmx.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.tribes.transport.RxTaskPool;

import com.ctgu.qmx.admin.dao.impl.IBaseUserDao;
import com.ctgu.qmx.admin.entity.Users;


public class IUserDaoImpl implements IBaseUserDao{
	
	private Connection  conn;
	private PreparedStatement pstmt;
	
	public IUserDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean doInsert(Users vo) throws Exception {
	// TODO Auto-generated method stub
	return false;
	}

	@Override
	public boolean doDelete(String id) throws Exception {
	// TODO Auto-generated method stub
	return false;
	}

	@Override
	public boolean doUpdate(Users vo) throws Exception {
	// TODO Auto-generated method stub
	return false;
	}

	@Override
	public Users findById(String id) throws Exception {
		String sql = "select * from users where user_name = ?";
		Users users = null;
		try {
			this.pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				users = new Users();
				users.setId(rs.getInt("id"));
				users.setUser_name(rs.getString("user_name"));
				users.setPassword(rs.getString("password"));
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<Users> findAll() throws Exception {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public List<Users> findAllPaging(String column, String keyWord, int currentPage, int pageSize)
	                throws Exception {
	// TODO Auto-generated method stub
	return null;
	}

	@Override
	public int getAllCount() throws Exception {
	// TODO Auto-generated method stub
	return 0;
	}
	
}
