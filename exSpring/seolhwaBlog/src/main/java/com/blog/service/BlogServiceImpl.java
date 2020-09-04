package com.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.domain.BlogVO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BlogServiceImpl implements BlogService {
	
	@Override
		public List<BlogVO> blogList() {
			return null;
		}
}
