package com.ctgu.qmx.student.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctgu.qmx.student.entity.StuInfo;
import com.ctgu.qmx.student.factory.ServiceFactory;


public class CheckLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num = req.getParameter("num");
        PrintWriter pw = resp.getWriter();
        StuInfo info = null;
        try {
            info = ServiceFactory.createStuInfoServiceInstance().findById(num);
            if (info.getName() != null) {
                pw.println("true");
            }else {
                pw.println("false");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
