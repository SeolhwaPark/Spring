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

import com.jslhrd.domain.MemberVO;
import com.jslhrd.domain.PageVO;
import com.jslhrd.service.MemberService;
import com.jslhrd.util.PgIndex;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/Member")

public class MemberController {
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);

	private MemberService service;

	@GetMapping("userinfo_list")
	public void memList(Model model) {
		log.info("memList()....");
		model.addAttribute("list", service.memList());
	}

	@GetMapping("userinfo_list")
	public void memListSearch(@RequestParam("page") int page, PageVO vo, Model model) {
		String url = "guest_list";

		int nowpage = 1;// 시작페이지
		int maxlist = 10; // 페이지당 자료수
		int totpage = 1; // 총페이지
		int totcount = service.memSearchCount(vo);// 전체 카운트
		// 총페이지수 계산
		if (totcount % maxlist == 0) {
			totpage = totcount / maxlist;
		} else {
			totpage = totcount / maxlist + 1;
		}
		if (totpage == 0) {
			totpage = 1;
		}

		if (page != 0) {
			nowpage = page;
		}

		if (nowpage > totpage) {// 현재 페이지가 총페이지보다 크면 마지막페이지를 현재페이지로
			nowpage = totpage;
		}
		int startpage = (nowpage - 1) * maxlist + 1;// 현재 페이지시작번호
		int endpage = nowpage * maxlist;
		int listcount = totcount - ((nowpage - 1) * maxlist);

		// PageVO vo = new PageVO();
		vo.setStartpage(startpage);
		vo.setEndpage(endpage);

		model.addAttribute("list", service.memListSearch(vo));
		model.addAttribute("page", nowpage);
		model.addAttribute("totcount", totcount);
		model.addAttribute("totpage", totpage);
		model.addAttribute("listcount", listcount);

		model.addAttribute("listPage", PgIndex.pageListHan(nowpage, totpage, url, vo.getSearch(), vo.getKey()));
	}

	/*
	 * @GetMapping("userinfo_list") public void memSelect(@RequestParam("userid")
	 * String userid, Model model) { log.info("memSelect()....");
	 * model.addAttribute("list", service.memSelect(userid)); }
	 * 
	 */

	// 회원가입처리
	@GetMapping("userinfo_insert")
	public void memInsert() {
		log.info("memInsert()....");
	}

	@PostMapping("userinfo_insert")
	public String memInsertPro(MemberVO vo, RedirectAttributes rttr) {
		log.info("memInsertPro()....");

		if (vo.getGubun() == null) {
			vo.setGubun("0");
		}
		if (vo.getZipcode() == null) {
			vo.setZipcode("");
		}
		if (vo.getAddr1() == null) {
			vo.setAddr1("");
		}
		if (vo.getAddr2() == null) {
			vo.setAddr2("");
		}
		if (vo.getEmail() == null) {
			vo.setAddr2("");
		}
		if (vo.getJob() == null) {
			vo.setJob("");
		}
		if (vo.getIntro() == null) {
			vo.setIntro("");
		}
		if (vo.getFavorite() == null) {
			vo.setFavorite("");
		}

		int row = service.memInsert(vo);
		rttr.addFlashAttribute("row", row);
		return "redirect:/Member/userinfo_insert_pro";
	}

	@GetMapping("userinfo_insert_pro")
	public void memInsertProJsp() {
		log.info("memInsertPro()....");
	}

	// 로그인폼
	@GetMapping("userlogin_form")
	public void userLogin() {
		log.info("userLogin()....");
	}

	// 로그인처리
	@PostMapping("userlogin_form")
	public String userLoginPro(MemberVO vo, Model model, HttpServletRequest request, HttpServletResponse response) {
		log.info("userLoginPro()....");
		String passwd = service.userIdSearch(vo);

		if (passwd == null) {// 아이디가 존재하지 않을 경우
			model.addAttribute("isRow", -1);
			return "/Member/userlogin_form";// 실패하면 로그인페이지로 이동

		} else {
			if (passwd.equals(vo.getPasswd())) {
				// id,passwd가 동일하다는 검증-> 로그인가능해짐
				service.lastTimeUpdate(vo); // 동일하니까 로그인되서 접속날짜 변경됨
				request.getSession().setAttribute("user", service.userLogin(vo));
				request.getSession().setMaxInactiveInterval(1800);
				return "/Member/userlogin_ok";

			} else {// 비번이 틀려서 오류난 경우
				model.addAttribute("isRow", 0);
				return "/Member/userlogin_form";
			}
		}
	}

	// 로그아웃 처리
	@GetMapping("logout")
	public void userLogout(HttpServletRequest request) {
		log.info("userLogout()....");
		request.getSession().invalidate();
	}

	// 회원정보 수정
	@GetMapping("userinfo_modify")
	public void userModify(MemberVO vo, Model model) {
		model.addAttribute("member", vo);
		log.info("userModify()....");
	}

	// 회원정보 수정처리
	@PostMapping("userinfo_modify")
	public String userModifyPro(MemberVO vo, RedirectAttributes rttr) {
		log.info("userModifyPro()....");
		int row = service.memModify(vo);
		rttr.addFlashAttribute("row", row);
		return "redirect:/Member/userinfo_modify_pro";
	}

	@GetMapping("userinfo_modify_pro")
	public void userModifyProJSP(MemberVO vo, Model model) {
		model.addAttribute("userid", vo.getUserid());
		log.info("userModifyProJSP()....");
	}

}
