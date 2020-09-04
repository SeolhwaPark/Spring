package com.jslhrd.domain;

import java.util.HashMap;











public class NightAuditSyncTestCommand implements Command {
//	Line 15 public class NightAuditSyncTestCommand implements Command :
//	NightAuditSyncTestCommand class는 Command인터페이스를 구현하는 클래스
	private CommDao commDao;
	private HashMap<String, Object> paramterMap;
	private Object result;
	private UserStatus status;
	
	@Override
	public void setProvider(WINGSCommonProvider commonProvider) {
		//Line 23 public void setProvider(WINGSCommonProvider commonProvider)  :
		//WINGSCommonProvider의 인스턴스를 불러오는 setProvider를 생성
		
		this.paramterMap = LoggicHelper.getParameter(commonProvider);
		//Line 24 this.paramterMap = LoggicHelper.getParameter(commonProvider); :
		//parameterMap에 commonProvider의 값이 들어있는 LoggicHelper에서 불러온 값을 넣는다
		
		this.commDao = LoggicHelper.getDao(commonProvider);
		//Line 25 this.commDao = LoggicHelper.getDao(commonProvider); :
		//commDao에 LoggicHelper의 getDao에 있는 commonProvider의 값을 넣는다
		
		result = commDao;
	}
	
	@Override
	public void execute() throws Exception{
		CRUD<HashMap<String,Object>, Object> executor;
		
		executor = new AuditTest(commDao);
		//Line 32 executor = new AuditTest(commDao); : 
//		commDao의 값을 매개변수로 AuditTest클래스를 생성하여 executor에 대입한다
		
		this.result = executor.execute(this.paramterMap);
		//
		if(this.result != null) {
			UserStatus status = new Success();
			status.setCode(ResultType.SUCCESS_2000.value());
			status.setMessage("데이터 전송 완료!!");
			this.status = status;
		//	Line 36 if(this.result != null)  
//			[만약 this.result 의 값이 null 이 아닐경우, if 문 안에서의 동작에 대해서 설명하라.] :
//				result의 값이 null이 아닌 경우 status가 성공적으로 동작하여 ResultType의 SUCCESS_2000의 값을 받환하고 
//				"데이터 전송 완료!!"라는 문자열을 UserStatus의 attribute인 Message에 대입시킨다.
//			
		}
	}
} 
/*

	
	
	
	
	
	


*/