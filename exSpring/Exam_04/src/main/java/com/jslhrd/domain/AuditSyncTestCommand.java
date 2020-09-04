package com.jslhrd.domain;

public class AuditSyncTestCommand implements Command {

	private CommDao commDao;
	private HashMap<String,Object> paramterMap;
	private Object result;
	private UserStatus status;
	
	public void setProvider() {
		this.paramterMap = LoggicHelper.getParameter(commonProvider);
		this.commDao = Loggic
	}

}
