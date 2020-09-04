package com.jslhrd.domain;

import lombok.Data;

@Data

public class UserVO {
	private int idx;
	private String name,userid,passwd,tel,email;
	/*
	 * NAME USERID PASSWD GUBUN ZIPCODE ADDR1 ADDR2 TEL EMAIL JOB INTRO FAVORITE
	 * FIRST_TIME LAST_TIME
	 */
}
