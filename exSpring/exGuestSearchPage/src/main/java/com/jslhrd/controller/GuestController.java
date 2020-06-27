package com.jslhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jslhrd.domain.GuestVO;
import com.jslhrd.domain.PageVO;
import com.jslhrd.service.GuestService;
import com.jslhrd.util.PgIndex;
import com.jslhrd.util.SqlMark;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("Guest")
@AllArgsConstructor
public class GuestController {
	private static final Logger log =
			LoggerFactory.getLogger(GuestController.class);
	
	private GuestService service;
	
	@GetMapping("guest_list")
	public void guestList(@RequestParam("page") int page, PageVO vo, Model model) {
		log.info("guestList()......");
		String url="guest_list";
		
		int nowpage=1;// 시작페이지
		int maxlist=10; // 페이지당 자료수
		int totpage=1; //총페이지
		int totcount = 0;
		
		if(vo.getKey() == null) {
			totcount = service.guestCount();//전체 카운트
		}else {
			totcount = service.guestSearchCount(vo);//전체 카운트
		}
		
		// 총페이지수 계산
		if(totcount % maxlist ==0) {
			totpage=totcount/maxlist;
		}else {
			totpage=totcount/maxlist+1;
		}
		if(totpage==0) {
			totpage=1;
		}
		
		if(page !=0 ) {
			nowpage=page;
		}
		
		if(nowpage>totpage) {//현재 페이지가 총페이지보다 크면 마지막페이지를 현재페이지로
			nowpage=totpage;
		}
		int startpage = (nowpage-1)*maxlist+1;//현재 페이지시작번호
		int endpage = nowpage*maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);
		
		//PageVO vo = new PageVO();
		vo.setStartpage(startpage);
		vo.setEndpage(endpage);
		
		if(vo.getKey() == null) {
			model.addAttribute("list", service.guestList(vo));
		}else {
			model.addAttribute("list", service.guestListSearch(vo));
		}
		
		model.addAttribute("page", nowpage);
		model.addAttribute("totpage", totpage);
		model.addAttribute("totcount", totcount);		
		model.addAttribute("listcount", listcount);
		
		if(vo.getKey() == null) {
			model.addAttribute("listPage", PgIndex.pageList(nowpage, totpage, url, ""));
		}else {
			model.addAttribute("listPage", PgIndex.pageListHan(nowpage, totpage, url,vo.getSearch(),vo.getKey()));
		}
	}
	
	@PostMapping("guest_list")
	public void guestListSearch(@RequestParam("page") int page, PageVO vo, Model model) {
		log.info("guestListSearch()......");
		String url="guest_list";
		
		int nowpage=1;// 시작페이지
		int maxlist=10; // 페이지당 자료수
		int totpage=1; //총페이지
		int totcount = service.guestSearchCount(vo);//전체 카운트
		// 총페이지수 계산
		if(totcount % maxlist ==0) {
			totpage=totcount/maxlist;
		}else {
			totpage=totcount/maxlist+1;
		}
		if(totpage==0) {
			totpage=1;
		}
		
		if(page !=0 ) {
			nowpage=page;
		}
		
		if(nowpage>totpage) {//현재 페이지가 총페이지보다 크면 마지막페이지를 현재페이지로
			nowpage=totpage;
		}
		int startpage = (nowpage-1)*maxlist+1;//현재 페이지시작번호
		int endpage = nowpage*maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);
		
		//PageVO vo = new PageVO();
		vo.setStartpage(startpage);
		vo.setEndpage(endpage);
		
		model.addAttribute("list", service.guestListSearch(vo));
		model.addAttribute("page", nowpage);
		model.addAttribute("totcount", totcount);		
		model.addAttribute("totpage", totpage);
		model.addAttribute("listcount", listcount);
		
		//model.addAttribute("listPage", PgIndex.pageList(nowpage, totpage, url, ""));
		model.addAttribute("listPage", PgIndex.pageListHan(nowpage, totpage, url,vo.getSearch(),vo.getKey()));
	}
	// 글 등록폼
	@GetMapping("guest_write")
	public void guestWrite() {
		log.info("guestWrite()......");
	}
/*	
	//등록 처리
	@PostMapping("guest_write")
	public String guestWritePro(GuestVO vo) {
		log.info("guestWritePro()........");
		int row = service.guestWrite(vo);
		return "redirect:/Guest/guest_list";
	}
*/
	// 등록 메시지 처리
	@PostMapping("guest_write")
	public String guestWritePro(GuestVO vo, RedirectAttributes rttr) {
		log.info("guestWritePro()........");
		int row = service.guestWrite(vo);
		rttr.addFlashAttribute("row", row);
		
		return "redirect:/Guest/guest_write_pro";
	}
/*	
	@GetMapping("guest_write_pro")
	public void guestWriteProJSP() {
		log.info("guestWritePro()........");
	}
*/	
	//View 처리
	@GetMapping("guest_view")
	public void guestView(@RequestParam("idx") int idx, Model model) {
		log.info("guestView().......");
		//service.guestHits(idx);// 조회수 증가
		GuestVO vo = service.guestSelect(idx);
		vo.setContents(SqlMark.lineBreak(vo.getContents()));
		model.addAttribute("guest", vo);
	}
/*	
	// 쿠키를 이용한 조회수 처리
	@GetMapping("guestHits")
	public String guestReadCnt(@RequestParam("idx") int idx, 
								HttpServletRequest request, HttpServletResponse response) {
		boolean bool=false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		for(int i=0; i<cookies.length; i++) {
			info = cookies[i];
			if(info.getName().equals("guestCookie"+idx)) {
				bool = true;
				break;
			}
		}
		String str = ""+System.currentTimeMillis();
		if(!bool) {
			info=new Cookie("guestCookie"+idx, str);
			response.addCookie(info);
			service.guestHits(idx);
		}
		return "redirect:guest_view?idx="+idx;
	}
*/
	@GetMapping("guestHits")
	public String guestReadCnt(@RequestParam("idx") int idx, 
								HttpServletRequest request, HttpServletResponse response) {
		service.guestHits(idx, request, response);
		return "redirect:guest_view?idx="+idx;
	}
	
}