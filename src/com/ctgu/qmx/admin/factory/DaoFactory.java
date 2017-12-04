package com.ctgu.qmx.admin.factory;

import java.sql.Connection;

import com.ctgu.qmx.admin.dao.IUserDaoImpl;
import com.ctgu.qmx.admin.dao.impl.IBaseUserDao;

public class DaoFactory {
	public static IBaseUserDao createUsersDaoInstance(Connection conn){
		return new IUserDaoImpl(conn);
	}
}
