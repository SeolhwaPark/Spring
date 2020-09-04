package com.jslhrd.service;

import javax.servlet.http.HttpServletRequest;

import com.jslhrd.domain.UserVO;

public interface UserService {
	//로그인 처리
	public void userLogin(UserVO vo,HttpServletRequest request);
	
	//로그아웃
	public void userLogout(UserVO vo,HttpServletRequest request);
	
	//아이디찾기
	public String userIdSearch(UserVO vo);
	
	//정보불러오기
	public UserVO userSelect(UserVO vo);
	
	//회원가입(등록)
	public int userInsert(UserVO vo);
	
	//수정
	public void userModify(UserVO vo);
	
	//회원탈퇴(삭제)
	public void userDelete(UserVO vo);
	
}
