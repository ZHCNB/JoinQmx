package com.ctgu.qmx.admin.factory;

import com.ctgu.qmx.admin.service.IUserService;

public class ServiceFactory {
	public static IUserService createUserServiceInstance(){
		return new IUserService();
	}
}
