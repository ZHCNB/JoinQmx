package com.ctgu.qmx.student.factory;

import com.ctgu.qmx.student.service.IStuInfoService;

public class ServiceFactory {
	public static IStuInfoService createStuInfoServiceInstance(){
		return new IStuInfoService();
	}
}
