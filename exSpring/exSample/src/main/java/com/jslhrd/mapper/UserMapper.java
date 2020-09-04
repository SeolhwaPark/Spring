package com.jslhrd.mapper;

import com.jslhrd.domain.UserVO;

public interface UserMapper {
	//정보불러오기
	public UserVO userSelect(UserVO vo);
	
	//아이디찾기
	public String userIdSearch(UserVO vo);
	
	//회원가입(등록)
	public int userInsert(UserVO vo);
	
	//수정
	public void userModify(UserVO vo);
		
	//회원탈퇴(삭제)
	public void userDelete(UserVO vo);
	
}
