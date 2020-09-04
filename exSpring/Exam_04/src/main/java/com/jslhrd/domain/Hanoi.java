package com.jslhrd.domain;
/*
하노이 은 원반 규칙에 따라 나무 막대에서 다른 나무 막대로 옮기는 문제를 해결하는 과정을
이야기 한다.
규칙
➢ 한 번에 한 개의 원판만 옮길 수 있습니다.
➢ 크기가 큰 원판은 크기가 작읍 원판 위쪽에 놓을 수 없습니다.
A,B,C 의 기둥이 있고, 원판의 개수가 N 개 일 때, 하노이 탑을 코드로 구현하라.
(언어 무관, 만약 코드가 어렵다면 의사코드로 작성해도 무방하다. )
 */
public class Hanoi {
	
	public static int cnt = 0;
	
	public static void move(char a, char b, char c, int n) {
		if(n == 0) {
			return;
		}else {
			move(a,c,b,n-1);
			System.out.println(a + "->" + b + "->" + c);
			cnt++;
			move(b,a,c,n-1);
		}
	}
	public static void main(String[] args) {
		move('a','b','c',3);
		System.out.println(cnt++);
	}
}
