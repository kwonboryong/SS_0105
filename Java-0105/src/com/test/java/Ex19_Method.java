package com.test.java;

	public class Ex19_Method {
		public static void main(String[] args) {
		
		/*
		재귀 메서드 (Recursive Method)
		- 재귀 구조를 가진 메서드
		- 메서드 구현부에서 자기 자신을 호출하는 메서드
		- 어려움 -> 머리로 상상하기 힘듦
		- 파일 디렉토리 구조 or 트리 구조에 많이 사용
		
		팩토리얼 
		4! = 4 * 3 * 2 * 1
		
		
		*/
		
		// m1();
			
		// 요구사항: 팩토리얼 메서드를 구현하시오 
		int n = 4;
		int result = factorial(n);
		
		System.out.printf("%d! = %d\n", n, result);
		
		m2();
		m3(n);
		
	} // main
	

		private static void m3(int n) {
			// TODO Auto-generated method stub
		}

		private static void m2() {
			// TODO Auto-generated method stub
		}

		
		public static int factorial(int n) {
			return (n==1) ? 1 : n * factorial(n-1);
		}
		
		
		public static void m1() {
			System.out.println("메서드1");
			m1(); // 재귀 호출 (스스로를 호출)
	
	}
	
}
