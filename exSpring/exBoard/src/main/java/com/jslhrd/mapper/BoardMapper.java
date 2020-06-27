package com.jslhrd.mapper;

import java.util.List;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.domain.PageVO;

public interface BoardMapper {
	
	//전체게시물 카운트
	public int boardcount();
	
	//검색조건 게시물 카운트
	public int boardsearchcount(PageVO vo);

	//목록
	public List<BoardVO> boardlist(PageVO vo);
	
	//조건에 맞는 목록검색
	public List<BoardVO> boardsearchlist(PageVO vo);
	
	//뷰 
	public BoardVO boardselect(int idx);
	
	//등록
	public int boardwrite(BoardVO vo);
	
	//조회수
	public void boardhits(int idx);
	
	//수정
	public int boardmodify(BoardVO vo);
	
	//삭제
	public int boarddelete(BoardVO vo);
	
}
