package com.seeyon.apps.ext.nsc_da.dao;

import java.util.List;
import com.seeyon.ctp.util.DBAgent;

public class nsc_daDaoImpl implements nsc_daDao{

	@Override
	public List<Object> selectPerson() {
		String sql="from org_member";
		return DBAgent.find(sql);
	}
}