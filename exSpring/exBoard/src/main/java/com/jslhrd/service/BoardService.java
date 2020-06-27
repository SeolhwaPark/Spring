package com.jslhrd.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.domain.PageVO;

public interface BoardService {
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
	public void boardhits(int idx, HttpServletRequest request, HttpServletResponse response);

//수정
	//수정
	public int boardmodify(BoardVO vo);
	
	//삭제
	public int boarddelete(BoardVO vo);

}
