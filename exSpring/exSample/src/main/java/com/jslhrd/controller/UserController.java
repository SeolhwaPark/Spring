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

import com.jslhrd.domain.UserVO;
import com.jslhrd.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/User")
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	private UserService service;

	@GetMapping("user_insert")
	public void userInsert() {
		log.info("user_insert");
	}

	@PostMapping("user_insert")
	public String userInsertPro(UserVO vo, RedirectAttributes rttr) {
		if (vo.getEmail() == null) {
			vo.setEmail("");
		}
		int row = service.userInsert(vo);
		rttr.addFlashAttribute("row", row);
		return "User/user_list";
	}

	@GetMapping("user_login")
	public void userLogin() {
		log.info("user_login");
	}

	@PostMapping("user_login")
	public String userLoginPro(UserVO vo, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		vo = service.userSelect(vo);
		if (vo == null) {
			model.addAttribute("isRow", -1);
			return "/User/user_login";
		} else {
			request.getSession().setAttribute("user", vo);
			request.getSession().setMaxInactiveInterval(1800);
			return "/User/userlogin_ok";
		}
	}

	@GetMapping("user_logout")
	public String userlogout(HttpServletRequest request) {
		log.info("userLogout()....");
		request.getSession().invalidate();
		
		return "redirect:/index";
	}

}
