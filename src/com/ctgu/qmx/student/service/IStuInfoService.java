package com.ctgu.qmx.student.service;

import java.util.ArrayList;
import java.util.List;

import com.ctgu.qmx.dbc.DBConnection;
import com.ctgu.qmx.student.entity.StuInfo;
import com.ctgu.qmx.student.factory.DaoFactory;

public class IStuInfoService {
	DBConnection dbc;
	
	public IStuInfoService(){
		dbc = new DBConnection();
	}
	/**
	 * 插入学生信息业务逻辑
	 * 
	 * @param stuInfo 包含学生信息的对象
	 * @return flag 若插入成功， 则返回true
	 * @throws Exception 出现异常，交由调用处处理
	 * 
	 * @author ZHC
	 */
	public boolean doInsert(StuInfo stuInfo) throws Exception{
		boolean flag = false;
		if (DaoFactory.createStuInfoDaoInstance(dbc.getConnection()).doInsert(stuInfo)) {
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 查找所有学生信息
	 * 
	 * @return stuInfos 返回所有对象集和
	 * @throws Exception
	 * 
	 * @author ZHC
	 */
	public List<StuInfo> findAll() throws Exception {
		List<StuInfo> stuInfos = new ArrayList<StuInfo>();
		stuInfos = DaoFactory.createStuInfoDaoInstance(dbc.getConnection()).findAll();
		return stuInfos;
	}
	
	/**
	 * @return 数据库中总记录数
	 * @throws Exception
	 * 
	 * @author ZHC
	 */
	public int getAllCount() throws Exception{
		return DaoFactory.createStuInfoDaoInstance(dbc.getConnection()).getAllCount();
	}
	
	/**
	 * 验证学号是否存在
	 * @param num 学生学号
	 * @return 若存在，则返回学生信息，反之返回空
	 * @throws Exception
	 */
	public StuInfo findById(String num) throws Exception{
	    return DaoFactory.createStuInfoDaoInstance(dbc.getConnection()).findById(num);
	}
	
	/**
	 * 根据学号删除
	 * 
	 * @param num 学号
	 * @return 删除成功则返回true 反之返回空
	 * @throws Exception
	 */
	public boolean doDelete(String num) throws Exception {
        return DaoFactory.createStuInfoDaoInstance(dbc.getConnection()).doDelete(num);
    }
	
	/**
	 * 根据组别查找数量
	 * 
	 * @param classId
	 * @return
	 * @throws Exception
	 */
	public int classCount(String classId) throws Exception{
	    return DaoFactory.createStuInfoDaoInstance(dbc.getConnection()).classCount(classId);
	}
}
