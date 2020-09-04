package com.jslhrd.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.jslhrd.domain.UserVO;
import com.jslhrd.mapper.UserMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService {
	private UserMapper mapper;
	//로그인처리
	@Override
	public void userLogin(UserVO vo,HttpServletRequest request) {
	 vo = mapper.userSelect(vo);
		request.getSession().setAttribute("user", vo);
	}
	
	//로그아웃처리
	@Override
	public void userLogout(UserVO vo, HttpServletRequest request) {
		request.getSession().invalidate();
	}
	
	//정보 불러오기
	@Override
	public UserVO userSelect(UserVO vo) {
		return mapper.userSelect(vo);
	}
	
	//아이디찾기
	@Override
	public String userIdSearch(UserVO vo) {
		return mapper.userIdSearch(vo);
	}
	
	//등록
	@Override
	public int userInsert(UserVO vo) {
		return mapper.userInsert(vo);
	}
	
	//수정
	@Override
	public void userModify(UserVO vo) {
		mapper.userModify(vo);	
	}
	
	//삭제
	@Override
	public void userDelete(UserVO vo) {
		mapper.userDelete(vo);
	}
	
}
