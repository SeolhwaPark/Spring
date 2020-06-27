package com.jslhrd.mapper;

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
public class GuestMapperTest {
	@Setter(onMethod_=@Autowired)
	private GuestMapper mapper;
	
	//세션,쿠키처리 - 서비스계층  // db연동 mapper(영속계층)와  컨트롤러(프리젠테이션계층)를 연결하는게 서비스,비지니스계층... 오토와이어,인젝트 = 주입하는애 
	/*
	 * @Test public void testGuestCount() { log.info("guestCount():" +
	 * mapper.guestCount()); }
	 */
	
	@Test 
	public void testGuestList() {
		mapper.guestList().forEach(guest->log.info(guest));
		
	}

	/*
	 * @Test public void testGuestWrite() { GuestVO vo = new GuestVO();
	 * vo.setName("홍길동"); vo.setSubject("제목테스트입니다"); vo.setContents("내용테스트입니다");
	 * mapper.guestWrite(vo); log.info(vo);
	 * 
	 * }
	 */
	
	/*
	 * @Test public void testGuestWriteKey() { GuestVO vo = new GuestVO();
	 * vo.setName("홍길동"); vo.setSubject("제목테스트입니다"); vo.setContents("내용테스트입니다");
	 * mapper.guestWriteKey(vo); log.info(vo);
	 * 
	 * }
	 */	
	
	/*
	 * @Test public void testGuestSelect() { GuestVO vo = mapper.guestSelect(61);
	 * //log.info(mapper.guestSelect(61)); log.info(vo); }
	 */
	
	/*
	 * @Test public void testGuestModify() { GuestVO vo = new GuestVO();
	 * vo.setIdx(61); vo.setName("java"); vo.setSubject("제목을 수정합니다");
	 * vo.setContents("내용을 수정합니다");
	 * 
	 * int row = mapper.guestModify(vo); log.info("Update count: "+ row); }
	 */	
	
	
	@Test 
	public void testGuestDelete() {
		log.info("delete count :" + mapper.guestDelete(61));
	}
	
	
	
	
	
	
	
	
}
