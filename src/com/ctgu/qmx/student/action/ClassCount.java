package com.ctgu.qmx.student.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ctgu.qmx.student.factory.ServiceFactory;

public class ClassCount extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name1 = "软件组";
        String name2 = "硬件组";
        String name3 = "Web组";

        int num1, num2, num3;
        try {
            num1 = ServiceFactory.createStuInfoServiceInstance().classCount(name1);
            num2 = ServiceFactory.createStuInfoServiceInstance().classCount(name2);
            num3 = ServiceFactory.createStuInfoServiceInstance().classCount(name3);
            
            resp.getWriter().print(String.valueOf(num1) + ',' + String.valueOf(num2) + ',' + String.valueOf(num3));;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
