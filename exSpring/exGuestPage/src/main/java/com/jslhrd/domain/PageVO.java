package com.jslhrd.domain;

import lombok.Data;

@Data
public class PageVO {
	private int startpage;
	private int endpage;
	//10으로 나눳을때 떨어지는게 페이지수. 안나눠떨어지면 +1
}
