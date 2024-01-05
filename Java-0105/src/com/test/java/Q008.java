package com.test.java;

public class Q008 {
	public static void main(String[] args) {
		
		// 요구사항: 인삿말을 출력하는 메소드 3개를 선언하시오.
		
		hello();
		introduce();
		bye();
		
		
	}

	private static void bye() {
		System.out.println("안녕히가세요.");
		
	}

	private static void introduce() {
		System.out.println("저는 홍길동입니다.");
		
	}

	private static void hello() {
		System.out.println("안녕하세요.");
		
	}
}
