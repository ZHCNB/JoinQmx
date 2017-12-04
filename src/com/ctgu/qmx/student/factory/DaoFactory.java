package com.ctgu.qmx.student.factory;

import java.sql.Connection;

import com.ctgu.qmx.student.dao.IStuInfoDaoImpl;
import com.ctgu.qmx.student.dao.impl.IBaseStuInfoDao;

public class DaoFactory {
	public static IBaseStuInfoDao createStuInfoDaoInstance(Connection conn){
		return new IStuInfoDaoImpl(conn);
	}
}