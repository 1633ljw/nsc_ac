package com.seeyon.apps.ext.nsc_da;

import com.seeyon.ctp.common.AbstractSystemInitializer;
public class nsc_daPluginInitializer extends AbstractSystemInitializer{

@Override
public void initialize() {
	System.out.println("加载nsc_da插件");
}

@Override
public void destroy() {
	System.out.println("销毁nsc_da插件");
}
}