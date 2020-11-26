package com.seeyon.apps.ext.nsc_da.manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.seeyon.apps.ext.nsc_da.dao.nsc_daDao;
import com.seeyon.ctp.common.AppContext;


public class nsc_daManagerImpl implements nsc_daManager{
	private static final Log log = LogFactory.getLog(nsc_daManagerImpl.class);

	private nsc_daDao demoDao;

	private String authip;

	@Override
	public void selectPerson() {
		System.out.println(authip);
		getnsc_daDao().selectPerson();
	}

	public nsc_daDao getnsc_daDao() {
		if (demoDao == null) {
			demoDao = (nsc_daDao) AppContext.getBean("nsc_daDaoDemo");
		}
	return demoDao;
	}

	public void setAuthip(String authip) {
		this.authip = authip;
	}

}