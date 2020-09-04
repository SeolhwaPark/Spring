package com.blog.domain;

import lombok.Data;

@Data
public class BlogVO {
	int idx, readcnt, c_idx,c_parent;
	String userid, email1, email2, pass1, pass2, name, phone, subject, contents, regdate, filename, c_contents, c_date;
	
}
