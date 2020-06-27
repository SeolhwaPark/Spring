package com.jslhrd.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.domain.GuestVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class GuestServiceTest {
	
	@Setter(onMethod_=@Autowired)
	private GuestService service;
	
	/*
	 * @Test public void testService() { log.info(service); }
	 */	
	@Test
	public void getList() {
		service.guestList().forEach(list->log.info(list));
	}
	
	
	
}
