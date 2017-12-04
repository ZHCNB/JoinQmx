package com.ctgu.qmx.student.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctgu.qmx.student.factory.ServiceFactory;

public class DeleteUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num = req.getParameter("num");
        PrintWriter pw = resp.getWriter();
        try {
            if (ServiceFactory.createStuInfoServiceInstance().doDelete(num)) {
                pw.println("true");
            }else {
                pw.println("false");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
