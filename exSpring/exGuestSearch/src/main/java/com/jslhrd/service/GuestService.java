package com.jslhrd.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.domain.GuestVO;
import com.jslhrd.domain.PageVO;

//마이바티스가 관리해줘서 어노테이션이 필요없슈

public interface GuestService {
	//전체 게시물 카운트
	public int guestCount();
	
	//게시물 전체 목록
	public List<GuestVO> guestList();

	//게시물 전체 목록 조건 검색
	public List<GuestVO> guestListSearch(PageVO vo);
	
	//특정 게시물 검색
	public GuestVO guestSelect(int idx);
	
	//특정 게시물 조회수 증가(컨트롤러에서 쿠키를 생성하는 경우)
	//public void guestHits(int idx);
	
	//특정 게시물 조회수 증가(서비스에서 쿠키를 생성하는 경우)
	public void guestHits(int idx,HttpServletRequest request, HttpServletResponse response);
	
	//게시물 등록
	public int guestWrite(GuestVO vo);
	
	//게시물 수정
	public int guestModify(GuestVO vo);
	
	//게시물 삭제
	public int guestDelete(int idx);
	
}
