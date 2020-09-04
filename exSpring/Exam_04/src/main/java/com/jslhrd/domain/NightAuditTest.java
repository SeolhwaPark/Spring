package com.jslhrd.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
//Line 25 @RestController : view가 필요없고 API지원만 필요한 data(json, xml등)에 
//return이 주목적인 REST방식의 데이터 처리를 위해서 기능
@Configuration
//Line 26 @Configuration : 
//현재 패키지 이하에서 @Component가 들어있는 class를 Bean으로 생성 할 때 Single Tone으로 한번만 생성.
//@Bean을 해당 클래스의 메소드에 적용하면 @Autowired로 빈을 부를 수 있다.

@ComponentScan({ "com.is.bookingcall.maessages.nightaudit", "com.wings" })
//Line 27 @ComponentScan({"com.is.bookingcall.maessages.nightaudit", "com.wings"}) : 
//	com.is.bookingcall.maessages.nightaudit, com.wings에서 @Component와 @Configuration이 붙은 
//	class를 스캔해서 Bean으로 등록.스프링 XML설정의 <context:component-scan>을 대신해서 자바에 설정.

@PropertySource("classpath:bookingtests/application.properties")
//Line 28 @PropertySource("classpath:bookingtests/application.properties") :
//application.properties가 위치하는 bookingtests에 application.properties 파일을 하나 생성하여 app에
//관련된 정보를 넣어주어 객체로 사용. 검색된 컴포넌트 및 빈 클래스를 스프링 애플리케이션 컨텍스트에 등록
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
//Line 29 @EnableAutoConfiguration
//(exclude= {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, 
//HibernateJpaAutoConfiguration.class}) :
//어플리케이션에 추가된 설정들을 자동으로 추가해주는 어노테이션, 괄호안에 있는 클래스파일을 제외하고 설정을 추가한다

@RequiredArgsConstructor
public class NightAuditTest {
//	Line 33 public class NightAuditTest : 
//	NightAuditTest라는 클래스를 선언
	public static void main(String[] args) {
		SpringApplication.run(NightAuditTest.class);
	}

	private final CommDao commDao;

	// 데이터전송 확인용
	@PostMapping("/nightAuditTest")

	@ApiOperation(value="testBookingResult",httpMethod="POST",notes="testBookingResult")
	// Line 43 @ApiOperation( :
	// testBookingResult인 파일을 POST방식으로 전송하는 Rest API파일을 설정.

	@ApiImplicitParams({@ApiImlicitParam(name="VENDOR_ID",value="Vendor 구분 번호",required=true,dataType="string",paramType="header",defaultValue="")@ApiImlicitParam(name="API-KEY",value="API Key",required=true,dataType="string",paramType="header",defaultValue="")})

	public Object testBookingResult(@Valid NightAuditTestVO nightAuditTestVO) { 
		//@Valid : 클라이언트의 입력 데이터가 dto 클래스로 캡슐화되어 넘어올 때, 유효성의 검증이 필요한 어노테이션
		MessageController messageController = new MessageController(
//Line 52 MessageController messageController = new MessageController( : 
				//새로운 MessageController를 생성한다.
				()-> ControllerHelper.getParameter(
			nightAuditTestVO, commDao, new NightAuditSyncTestCommand(), null)
				(exception, command)-> {exception.printStackTrace();},
					(command)->{}, "1.0.0.0");
	//Line 53 ControllerHelper.getParameter( : 
	//	ControllerHelper에 nightAuditTestVO, commDao, new NightAuditSyncTestCommand(), null이라는 매개변수를 받는다.
	//	command가 실행되면 예외처리로 오류메세지로 "1.0.0.0"가 출력된다
			
		return messageController.execute();
		
	}
}

/*
	
	
	
	

	

	
	
	
	
	
*/