package com.jslhrd.service;

import java.util.List;

import com.jslhrd.domain.MemberVO;

public interface MemberService {
	//목록
	public List<MemberVO> memList();
	
	//등록
	public int memInsert(MemberVO vo);
	
	//id검색해서 존재하면 비번 리턴(id,pass의 유무)
	public String userIdSearch(MemberVO vo);
	
	//로그인(id,pass) 세션정보 확인
	public MemberVO userLogin(MemberVO vo);
	
	//로그인 성공시 마지막 로그인한 날짜 업데이트
	public void lastTimeUpdate(MemberVO vo);
	
	//수정
	public int memModify(MemberVO vo);
	
	
	
	
	
}
