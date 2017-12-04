package com.ctgu.qmx.student.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctgu.qmx.student.entity.StuInfo;
import com.ctgu.qmx.student.factory.ServiceFactory;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
public class AllInfoServlet extends HttpServlet {

	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		JsonObject object = new JsonObject(); //json数据
		
		String page = req.getParameter("page");
		String rows = req.getParameter("rows");
		
		int totalRecord = 0; //总记录数
		int totalPage = 0; //总页数
		try {
			totalRecord = ServiceFactory.createStuInfoServiceInstance().getAllCount();
			totalPage = totalRecord % Integer.parseInt(rows) == 0 ? totalRecord   
					/ Integer.parseInt(rows) : totalRecord / Integer.parseInt(rows)   
					+ 1; // 计算总页数
			
		} catch (Exception e1) {
			e1.printStackTrace();
		} 
		
		object.addProperty("total", String.valueOf(totalPage));
		object.addProperty("page",  page);
		object.addProperty("records", String.valueOf(totalRecord));
	
		List<StuInfo> stuInfos = null;
		List<StuInfo> WestuInfos = null;
		JsonArray array = new JsonArray();
		try {
			stuInfos = ServiceFactory.createStuInfoServiceInstance().findAll();
			int beginNo, endNo;
			beginNo = Integer.parseInt(rows) * (Integer.parseInt(page) - 1) + 1;
			endNo = beginNo + Integer.parseInt(rows) - 1;
			if(endNo >= totalRecord){
				endNo = totalRecord;
			}
			int i = 1;
			for(StuInfo stuInfo : stuInfos){
				if(i >= beginNo && i <= endNo){
				JsonObject sObject = new JsonObject();
				sObject.addProperty("id", beginNo);
				sObject.addProperty("Time", stuInfo.getTime());
				sObject.addProperty("Name", stuInfo.getName());
				sObject.addProperty("Sex", stuInfo.getSex());
				sObject.addProperty("Num", stuInfo.getNumber());
				sObject.addProperty("Tel", stuInfo.getPhone());
				sObject.addProperty("Ady", stuInfo.getAcademy());
				sObject.addProperty("Mjr", stuInfo.getMajor());
				sObject.addProperty("Cla", stuInfo.getClasses());
				array.add(sObject);
				i++;
				beginNo++;
				}
				else{
					i++;
				}
			}
			object.add("rows", array);
			resp.setCharacterEncoding("UTF-8");
			resp.getWriter().print(object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
