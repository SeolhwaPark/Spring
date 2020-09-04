package com.jslhrd.domain;

public class TestHanoi {
	public static void main(String[] args) {
		hanoi(3,'a','b','c');
	}
	
	public static void hanoi(int i, char a, char b, char c) {
		if(i==1) {
			System.out.println(i + "를 " + a +"에서 " + c +"로 옮긻니다.");
		}else {
			hanoi(i-1,a,c,b);
			System.out.println(i + "를 " + a +"에서 " + c +"로 옮긻니다.");
			hanoi(i-1,b,a,c);
		}
	}
	
}
/*
1를 A에서 C로 옮깁니다.

2를 A에서 B로 옮깁니다.

1를 C에서 B로 옮깁니다.

3를 A에서 C로 옮깁니다.

1를 B에서 A로 옮깁니다.

2를 B에서 C로 옮깁니다.

1를 A에서 C로 옮깁니다.


*/