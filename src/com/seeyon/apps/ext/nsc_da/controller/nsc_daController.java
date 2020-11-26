package com.seeyon.apps.ext.nsc_da.controller;

import javax.servlet.http.HttpServletRequest;
import com.seeyon.ctp.common.controller.BaseController;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public class nsc_daController extends BaseController{

public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
/*JSP file path:ApacheJetspeed\webapps\seeyon\WEB-INF\jsp\apps\ext\nsc_da\nsc_da.jsp*/
	System.out.println("啦啦啦");
return new ModelAndView("apps/ext/nsc_da/index");
}
}