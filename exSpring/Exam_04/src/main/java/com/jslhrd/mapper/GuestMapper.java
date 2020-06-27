package com.jslhrd.mapper;

import java.util.List;

import com.jslhrd.domain.GuestVO;

public interface GuestMapper {
	/*
	 * @Select("select count(*) from tbl_guest") //xml에 만들기 않고 직접 sql을 사용할 수 있 음
	 * public int guestCount();
	 */
	
	public int guestCount();
	
	//전체게시물 검색(list)
	public List<GuestVO> guestList();
	
	//등록
	public int guestWrite(GuestVO vo);
	public int guestWriteKey(GuestVO vo);
	
	//특정게시물검색 (view)
	public GuestVO guestSelect(int idx);
	
	//수정
	public int guestModify(GuestVO vo);
	
	//삭제
	public int guestDelete(int idx); //2개이상의 매개변수가 필요하면 걍 vo 넣어야함,스프링에선 그게 잘 됌
	
}
