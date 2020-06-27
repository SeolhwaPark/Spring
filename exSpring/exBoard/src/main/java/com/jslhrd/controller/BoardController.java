package com.jslhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jslhrd.domain.BoardVO;
import com.jslhrd.domain.PageVO;
import com.jslhrd.service.BoardService;
import com.jslhrd.util.PageIndex;
import com.jslhrd.util.SqlMark;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("Board")
@AllArgsConstructor
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	private BoardService service;
	
	//목록
	@GetMapping("board_list")
	public void boardList(@RequestParam("page") int page, PageVO vo,Model model) {
		log.info("board_list()....");
		
		String url="board_list";
		
		int nowpage=1;// 시작페이지
		int maxlist=10; // 페이지당 자료수
		int totpage=1; //총페이지
		int totcount = 0;
		
		if(vo.getKey() == null) {
			totcount = service.boardcount();//전체 카운트
		}else {
			totcount = service.boardsearchcount(vo);//전체 카운트
		}
		
		// 총페이지수 계산
		if(totcount % maxlist ==0) {
			totpage=totcount/maxlist;
		}else {
			totpage=totcount/maxlist+1;
		}
		if(totpage==0) {
			totpage=1;
		}
		
		if(page !=0 ) {
			nowpage=page;
		}
		
		if(nowpage>totpage) {//현재 페이지가 총페이지보다 크면 마지막페이지를 현재페이지로
			nowpage=totpage;
		}
		int startpage = (nowpage-1)*maxlist+1;//현재 페이지시작번호
		int endpage = nowpage*maxlist;
		int listcount = totcount-((nowpage-1)*maxlist);
		
		//PageVO vo = new PageVO();
		vo.setStartpage(startpage);
		vo.setEndpage(endpage);
		
		if(vo.getKey() == null) {
			model.addAttribute("list", service.boardlist(vo));
		}else {
			model.addAttribute("list", service.boardsearchlist(vo));
		}
		
		model.addAttribute("page", nowpage);
		model.addAttribute("totpage", totpage);
		model.addAttribute("totcount", totcount);		
		model.addAttribute("listcount", listcount);
		
		if(vo.getKey() == null) {
			model.addAttribute("listPage", PageIndex.pageList(nowpage, totpage, url, ""));
		}else {
			model.addAttribute("listPage", PageIndex.pageListHan(nowpage, totpage, url,vo.getSearch(),vo.getKey()));
		}
	}
	
	@PostMapping("board_list")
	public void boardListSearch(@RequestParam("page") int page, PageVO vo, Model model) {
		
		
		log.info("boardListSearch()....");
		String url = "board_list";
		
		int nowpage = 1; // 시작페이지
		int maxlist = 10; // 페이지당 최대 자료수
		int totpage = 1; // 총 페이지 개수
		
		int totcount = service.boardsearchcount(vo);// 검색조건에맞는 게시물 갯수
	
		// 총페이지수 계산
		if (totcount % maxlist == 0) {
			totpage = totcount / maxlist;
		} else {
			totpage = totcount / maxlist + 1;
		}
		if (totpage == 0) {
			totpage = 1;
		}
		if (page != 0) {
			nowpage = page;
		}
		if (nowpage > totpage) { // 현재페이지가 총페이지보다크면 마지막페이지를 현제페이지로
			nowpage = totpage;
		}
		int startpage = (nowpage - 1) * maxlist + 1;// 현재 페이지 시작번호
		int endpage = nowpage * maxlist;
		int listcount = totcount - ((nowpage - 1) * maxlist);

		// PageVO vo = new PageVO();
		vo.setStartpage(startpage);
		vo.setEndpage(endpage);
		
		model.addAttribute("page", nowpage);
		model.addAttribute("totpage", totpage);
		model.addAttribute("listcount", listcount);
		model.addAttribute("list", service.boardsearchlist(vo));
		model.addAttribute("totcount", totcount);
		// model.addAttribute("listpage", PageIndex.pageList(nowpage, totpage, url,
		// ""));
		
		model.addAttribute("listpage", PageIndex.pageListHan(nowpage, totpage, url, vo.getSearch(), vo.getKey()));
		
	}
	
	//뷰
	@GetMapping("board_view")
	public void boardselect(@RequestParam("idx") int idx, Model model) {
		log.info("board_select()....");
		BoardVO vo = service.boardselect(idx);
		vo.setContents(SqlMark.lineBreak(vo.getContents()));
		model.addAttribute("board",vo);
	}
	
	//등록폼 
	@GetMapping("board_write")
	public void boardWrite() {
		log.info("boardWrite()....");
	}
	
	//등록메시지 처리
	@PostMapping("board_write")
	public String boardWritePro(BoardVO vo,RedirectAttributes rttr) {
		log.info("guestWritePro()....");
		int row = service.boardwrite(vo);
		rttr.addFlashAttribute("row",row);
		return "redirect:/Board/board_write_pro";
	}
	
	@GetMapping("board_write_pro")
	public void boardWriteProJSP() {
		log.info("boardWritePro()....");
	}
	
	@GetMapping("board_hits")
	public String boardHitsCNT(@RequestParam("idx") int idx,@RequestParam("page") int page, 
			HttpServletRequest request, HttpServletResponse response) {
		service.boardhits(idx, request, response);
		return "redirect:board_view?idx="+idx+ "&page=" + page;
	}
	
	
	@GetMapping("board_modify")
	public void boardmodify(@RequestParam("idx") int idx,@RequestParam("page") int page, Model model) {

		BoardVO vo = service.boardselect(idx);
		model.addAttribute("board", vo);
		model.addAttribute("page", page);
		log.info("board_modify().....");
	}

	@PostMapping("board_modify")
	public String boardmodifyPro(@RequestParam("page") int page,BoardVO vo, RedirectAttributes rttr) {

		log.info("boardModifyPro().....");
		int row = service.boardmodify(vo);
		rttr.addFlashAttribute("row", row);
		return "redirect:board_modify_pro?page="+page+"&idx="+vo.getIdx();
	}

	@GetMapping("board_modify_pro")
	public void boardModifyProJSP(BoardVO vo,@RequestParam("page") int page, Model model) {
		
		model.addAttribute("idx", vo.getIdx());
		model.addAttribute("page", page);
		log.info("boardModifyProJSP()....");
	}

	@GetMapping("board_delete")
	public void boardDelete(@RequestParam("idx") int idx, @RequestParam("page") int page, Model model) {

		model.addAttribute("page", page);
		model.addAttribute("idx", idx);
		log.info("board_delete().....");
	}

	@PostMapping("board_delete")
	public String boardDeletePro(BoardVO vo, @RequestParam("page") int page, RedirectAttributes rttr) {

		log.info("boardDeletePro()....");
		int row = service.boarddelete(vo);
		rttr.addFlashAttribute("row", row);     
		
		return "redirect:/Board/board_delete_pro?page="+page;

	}

	@GetMapping("board_delete_pro")
	public void boardDeleteProJSP(@RequestParam("page") int page,Model model) {
		model.addAttribute("page",page);
		log.info("boarddeleteProJSP()....");
	}
	
}
