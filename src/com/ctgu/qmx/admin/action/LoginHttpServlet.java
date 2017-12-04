package com.ctgu.qmx.admin.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctgu.qmx.admin.factory.ServiceFactory;

public class LoginHttpServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_name = req.getParameter("user_name");
		String password = req.getParameter("password");
		
		
		try {
			if (ServiceFactory.createUserServiceInstance().checkUsers(user_name, password)) {
				req.setAttribute("user_name", user_name);
				req.getRequestDispatcher("success.jsp").forward(req, resp);
			}else{
				req.getRequestDispatcher("error.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
