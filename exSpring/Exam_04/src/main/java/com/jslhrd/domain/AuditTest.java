package com.jslhrd.domain;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@Configuration
@ComponentScan({"com.is.bookingcall.messages.audit","com.wings"})
@PropertySource("classpath:bookingtests/application.properties")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,
	DataSourceTransactionManagerAutoConfiguration.class,
	HibernateJpaAutoConfiguration.class})
@RequiredArgsConstructor
public class AuditTest {

	public static void main(String[] args) {
		SpringApplication.run(AuditTest.class);
	}
	
	private final CommDao commDao;
	
	//데이터전송 확인용
	@PostMapping("/AuditTest")
	@ApiOperation(
			value="testBookResult",
			httpMethod="POST",
			notes="testBookResult")
	@ApiImplicitParams({
		@ApiImplicitParams(name="WENDOR_ID",value="Wendor 구분번호", required = true,
			dataType="string",paramType = "header", defaultValue="" )
		@ApiImplicitParams(name="API-KEY", value="API key", required = true, dataType = "string"
			, paramType = "header" , defaultValue="")})
	
	public Object testBookResult(@Valid AuditTestVO auditTestVO) {
		
		MessageController messageController = new MessageController(
			() -> ControllerHelper.getParameter(
				auditTestVO, commDao, new AuditSyncTestCommand(), null)
				(exception, command)-> {exception.printStackTrace();}
				(command)->) {}, "1.0.0.0");
		
		return messageController.execute();
	}

}
