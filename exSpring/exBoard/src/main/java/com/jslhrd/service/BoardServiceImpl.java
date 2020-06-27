package com.jslhrd.service;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.domain.PageVO;
import com.jslhrd.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;
	
	@Override
	public int boardcount() {
		return mapper.boardcount();
	}
	
	@Override
	public int boardsearchcount(PageVO vo) {
		return mapper.boardsearchcount(vo);
	}
	
	@Override
	public List<BoardVO> boardlist(PageVO vo) {
		return mapper.boardlist(vo);
	}
	
	@Override
	public List<BoardVO> boardsearchlist(PageVO vo) {
		return mapper.boardsearchlist(vo);
	}
	
	@Override
	public BoardVO boardselect(int idx) {
		return mapper.boardselect(idx);
	}

	@Override
	public int boardwrite(BoardVO vo) {
		return mapper.boardwrite(vo);
	}

	@Override
	public void boardhits(int idx, HttpServletRequest request, HttpServletResponse response) {
		boolean bool = false;
		Cookie info = null;
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			info = cookies[i];
			if (info.getName().equals("guestCookie" + idx)) {
				bool = true;
				break;
			}
		}
		String str = "" + System.currentTimeMillis();
		if (!bool) {
			info = new Cookie("guestCookie" + idx, str);
			response.addCookie(info);
			mapper.boardhits(idx);
		}

	}
	
	@Override
	public int boardmodify(BoardVO vo) {
		return mapper.boardmodify(vo);
	}
	
	@Override
	public int boarddelete(BoardVO vo) {
		return mapper.boarddelete(vo);
	}
}
