package com.jslhrd.mappertest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jslhrd.domain.GuestVO;
import com.jslhrd.mapper.GuestMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class GuestMapperTest {
	@Setter(onMethod_ = @Autowired)
	private GuestMapper mapper;

	/*
	 @Test public void testguestCount() { log.info("guestCount():" +
	 mapper.guestCount()); }
	 */

	/*
	 @Test public void testlist(){ mapper.guestList().forEach(guest->log.info(guest));}
	 */
	
	/*
	 @Test public void guestSelect(){ log.info("guestSelect():" +
	 mapper.guestSelect(21)); }
	 */
	
	/*
	 @Test public void guestHits(){ mapper.guestHits(21); }
	 */
	
	/*
	 @Test public void guestWrite() { GuestVO vo = new GuestVO();
	 vo.setName("오미자"); vo.setSubject("오미자 제목"); vo.setContents("오미자 내용");
	 log.info("guestWrite():"+ mapper.guestWrite(vo)); }
	 */  
	
	/*
	 @Test public void guestModify() { GuestVO vo = new GuestVO(); vo.setIdx(42);
	 vo.setName("오미자"); vo.setSubject("오미자 제목"); vo.setContents("오미자 내용");
	 log.info("guestModify():"+ mapper.guestModify(vo)); }
	 */  
	
	/*
	 @Test public void guestDelete() { log.info("guestDelete():"+
	 mapper.guestDelete(21)); }
	 */  
	  
}
