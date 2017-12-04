package com.ctgu.qmx.admin.service;


import com.ctgu.qmx.admin.entity.Users;
import com.ctgu.qmx.admin.factory.DaoFactory;
import com.ctgu.qmx.dbc.DBConnection;

public class IUserService {
	DBConnection dbc;
	
	public IUserService() {
		dbc = new DBConnection();
	}
	/**
	 * 验证用户名和密码
	 * @param user_name 用户名
	 * @param password 密码
	 * @throws Exception 出现异常，交由调用处处理
	 * @return result 如果验证通过，则返回true
	 * 
	 * @author ZHC
	 */
	public boolean checkUsers(String user_name, String password) throws Exception{
		boolean result = false;
		Users users = DaoFactory.createUsersDaoInstance(dbc.getConnection()).findById(user_name);
		if(users != null){
			if(users.getPassword().equals(password)){
				result = true;
			}
		}
		return result;
	}
}
