package com.jslhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.domain.MemberVO;
import com.jslhrd.domain.PageVO;
import com.jslhrd.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
public class MemberSeviceImpl implements MemberService {
	//주입요청
	@Setter(onMethod_=@Autowired)
	private MemberMapper mapper;
	
	
	@Override
	public int memCount() {
		return mapper.memCount();
	}
	
	@Override
	public int memSearchCount(PageVO vo) {
		return mapper.memSearchCount(vo);
	}
	
	@Override
	public List<MemberVO> memList() {
		return mapper.memList();
	}
	
	@Override
	public List<MemberVO> memListSearch(PageVO vo) {
		return mapper.memListSearch(vo);
	}
	
	@Override
	public MemberVO memSelect(String userid) {
		return mapper.memSelect(userid);
	}
	
	@Override
	public int memInsert(MemberVO vo) {
		return mapper.memInsert(vo);
	}
	
	@Override
	public String userIdSearch(MemberVO vo) {
		return mapper.userIdSearch(vo);
	}
	
	@Override
	public MemberVO userLogin(MemberVO vo) {
		return mapper.userLogin(vo);
	}
	
	@Override
	public void lastTimeUpdate(MemberVO vo) {
		mapper.lastTimeUpdate(vo);
	}
	
	@Override
	public int memModify(MemberVO vo) {
		return mapper.memModify(vo);
	}
}
