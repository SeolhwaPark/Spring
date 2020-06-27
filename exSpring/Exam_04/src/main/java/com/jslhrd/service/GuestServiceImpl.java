package com.jslhrd.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jslhrd.domain.GuestVO;
import com.jslhrd.mapper.GuestMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor

public class GuestServiceImpl implements GuestService {
	private static final Logger log = LoggerFactory.getLogger(GuestService.class);
	
	@Setter(onMethod_=@Autowired)
	private GuestMapper mapper;
	
	 @Override
	public List<GuestVO> guestList() {
		// TODO Auto-generated method stub
		return mapper.guestList();
	}
	
	
}
