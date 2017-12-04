package com.ctgu.qmx.student.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctgu.qmx.student.entity.StuInfo;
import com.ctgu.qmx.student.factory.ServiceFactory;


public class SubmitInfo extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //将post方式传递过来的值进行UTF-8编码，防止中文乱码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String stu_name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String number = req.getParameter("number");
        String phone = req.getParameter("phone");
        String academy = req.getParameter("academy");
        String major = req.getParameter("major");
        String classes = req.getParameter("classes");
        //获取时间
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stu_time = sf.format(new Date()).toString();
        StuInfo stuInfo = null;
        try {
            stuInfo = new StuInfo();
            stuInfo.setName(stu_name);
            stuInfo.setSex(sex);
            stuInfo.setNumber(number);
            stuInfo.setPhone(phone);
            stuInfo.setAcademy(academy);
            stuInfo.setMajor(major);
            stuInfo.setClasses(classes);
            stuInfo.setTime(stu_time);
            if(ServiceFactory.createStuInfoServiceInstance().doInsert(stuInfo)){
                req.getRequestDispatcher("index.html").forward(req, resp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
