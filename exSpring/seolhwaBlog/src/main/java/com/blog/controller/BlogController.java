package com.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.service.BlogService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/Blog")
@AllArgsConstructor
@Log4j
public class BlogController {
	private static final Logger log = LoggerFactory.getLogger(BlogController.class);
	
	private BlogService service;
	
	@GetMapping("login")
	public void login() {
		log.info("login()....");
	}
	
	@GetMapping("logout")
	public void logout() {
		log.info("logout()....");
	}
	
	//회원가입페이지
	@GetMapping("member")
	public void member() {
		log.info("member()....");
	}
	
	//회원 등록
	@PostMapping("member_insert")
	public String member_insert() {
		log.info("member_insert");
		
		return null;
	}
	
	//회원 정보 수정
	@GetMapping("mypage")
	public void mypage() {
		log.info("mypage()....");
	}
	
	//탈퇴
	
	
	@GetMapping("self")
	public void self() {
		log.info("member()....");
	}
	@GetMapping("diary")
	public void diary() {
		log.info("diary()....");
	}
	@GetMapping("diary_view")
	public void diary_view() {
		log.info("diary_view()....");
	}
	@GetMapping("diary_write")
	public void diary_write() {
		log.info("diary_write()....");
	}
	@GetMapping("diary_modify")
	public void diary_modify() {
		log.info("diary_modify()....");
	}
	@GetMapping("diary_delete")
	public void diary_delete() {
		log.info("diary_delete()....");
	}
	
	@GetMapping("photos")
	public void photos() {
		log.info("photos()....");
	}
	
	@GetMapping("favoritesongs")
	public void favoritesongs() {
		log.info("favoritesongs()....");
	}
	
	@GetMapping("javastudy")
	public void javastudy() {
		log.info("member()....");
	}
	
	@GetMapping("scriptstudy")
	public void scriptstudy() {
		log.info("member()....");
	}
	
	@GetMapping("sqlstudy")
	public void sqlstudy() {
		log.info("member()....");
	}
	
	@GetMapping("springstudy")
	public void springstudy() {
		log.info("member()....");
	}
	
}
