package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.domain.BlogVO;


public interface BlogService {
	public List<BlogVO> blogList();
	
}
