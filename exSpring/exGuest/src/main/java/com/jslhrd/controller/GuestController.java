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
import com.jslhrd.service.GuestService;

import lombok.AllArgsConstructor;//기본적으로 필요한 생성자를 만들겟다고 선언..

@Controller
@RequestMapping("Guest") //로컬호스트 이름
@AllArgsConstructor
public class GuestController {
	private static final Logger log = LoggerFactory.getLogger(GuestController.class);
	
	private GuestService service;
	
	@GetMapping("guest_list")
	public void guest_list(Model model) {
		log.info("guest_list....");
		model.addAttribute("list",service.guestList());
	}
	
	//등록폼
	@GetMapping("guest_write")
	public void guest_write() {
		log.info("guest_write....");
	}
	
	/*
	//등록폼
	@PostMapping("guest_write") //딴대로 넘겨줘야함
	public String guestWritePro(GuestVO vo) {
		log.info("guestWritePro()....");
		int row = service.guestWrite(vo);
		return "redirect:/Guest/guest_list";
	}
	*/
	
	//등록 메시지 처리
	@PostMapping("guest_write")
	public String guest_write(GuestVO vo,RedirectAttributes rttr) {
		log.info("guest_write....");
		int row = service.guestWrite(vo);
		rttr.addFlashAttribute("row",row);
		return "redirect:/Guest/guest_write_pro";
	}
	
	 @GetMapping("guest_write_pro") 
	 public void guestWriteProJSP() {
	 log.info("guestWritePro()...."); }
	 
/*
	//view처리 (가장 쉬운 조회수올리기도 포함)
	@GetMapping("guest_view")
	public void guestView(@RequestParam("idx") int idx, Model model) { //물음표로 넘어오는값 받아올때 리퀘스트파람 씀
		log.info("guestView()......");
		service.guestHits(idx); //조회수가 자동증가됨
		GuestVO vo = service.guestSelect(idx);//idx에 맞는 정보 찾아오깅
		model.addAttribute("guest",vo);
	}
*/	
	
	//view처리 
	@GetMapping("guest_view")
	public void guestView(@RequestParam("idx") int idx, Model model) { //물음표로 넘어오는값 받아올때 리퀘스트파람 씀
		log.info("guestView()......");
		//service.guestHits(idx); //조회수가 자동증가됨
		GuestVO vo = service.guestSelect(idx);//idx에 맞는 정보 찾아오깅
		model.addAttribute("guest",vo);
	}
	
	/*
	//조회수 쿠키를 이용한 처리
	@GetMapping("guestHits")
	public String guestReadCnt(@RequestParam("idx") int idx, HttpServletRequest request,
			HttpServletResponse response) {
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		for(int i=0; i<cookies.length; i++ ) {
			info = cookies[i];
			if(info.getName().equals("guestCookie"+ idx)) {
				bool = true;
				break;
			}
		}
		String str = "" + System.currentTimeMillis();
		if(!bool) {
			info =  new Cookie("guestCookie" + idx,str);
			response.addCookie(info);
			service.guestHits(idx);
		}
		return "redirect:guest_view?idx="+idx;//리다이렉트. idx값을 꼭 넘겨야함
	}
	*/
	
	//
	@GetMapping("guestHits")
	public String guestReadCnt(@RequestParam("idx") int idx, HttpServletRequest request,
			HttpServletResponse response) {
		service.guestHits(idx,request,response);//쿠키생성역할
		return "redirect:guest_view?idx="+idx;
	}
	
	//수정 폼
	@GetMapping("guest_modify")
	public void guest_modify(@RequestParam("idx") int idx, Model model) {
		log.info("guest_modify....");
		GuestVO vo = service.guestSelect(idx);
		model.addAttribute("guest",vo);
	}
	
	//수정처리 메세지
	@PostMapping("guest_modify")
	public String guest_modify_pro(GuestVO vo,RedirectAttributes rttr) {
		log.info("guest_modify....");
		int row = service.guestModify(vo);
		rttr.addFlashAttribute("row",row);
		return "redirect:/Guest/guest_modify_pro";
	}
	
	@GetMapping("guest_modify_pro")
	public void guestModifyProJSP() {
		 log.info("guestModifyPro()...."); 
	}
	
	//삭제
	@GetMapping("guest_delete")
	public String guest_delete(@RequestParam("idx") int idx) {
		service.guestDelete(idx);
		return "redirect:/Guest/guest_list";
	}
	
	
}
