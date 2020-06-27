package com.jslhrd.domain;

import lombok.Data;

@Data
public class BoardVO {
	private int idx;
	private String pass;
	private String name;
	private String email;
	private String regdate;
	private String subject;
	private String contents;
	private int readcnt;
	private String ip;
	private int comments;
	
	
	/*
  idx number NOT NULL ,				--  고유번호, 자동증가
  pass varchar2(20) NOT NULL ,			--  비밀번호
  name varchar2(20) NOT NULL ,			--  작성자 이름
  email varchar2(50) ,				--  작성자 이메일
  regdate date default sysdate,			--  작성일자
  subject varchar2(100) NOT NULL,		--  제목
  contents varchar2(2000) NOT NULL,		--  내용
  readcnt number default 0,			--  조회수
  ip varchar2(20) null,				--  작성자 ip주소
  comments number(3) null,
	 */
}
