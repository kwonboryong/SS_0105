package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_if {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		/*
		제어문
		- 수많은 명령어들의 집합
		- 명령어들이 실행되는 순서(제어의 흐름): 위 -> 아래
		- 제어의 흐름을 통제하는 도구
		- 조건 제어, 반복 제어, 분기 제어
		
		1. 조건문
		- 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
		(1) if
		(2) switch
		
		2. 반복문
		- 특정 코드를 원하는 횟수만큼 반복 제어
		(1) for
		(2) while
		(3) do-while
		(4) for
		
		3. 분기문
		- 코드의 흐름을 원하는 곳으로 이동
		(1) break
		(2) continue
		
		
		- 알고리즘: 코드의 흐름을 제어
		- 자료구조: 데이터를 저장하기 위한 구조
		*/
		
	    // m1();
		// m2();
		// m3();
		// m4();
		m5();
		
		
		
		
	} // main

	
	private static void m5() throws NumberFormatException, IOException {
		// 성적(0~100)을 입력 받고 합격/불합격 판단하기
		// + 유효성 검사: 올바른 값만 입력하도록 통제
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("성적: ");
		
		int score = Integer.parseInt(reader.readLine());
		
		/* 1. 합격일 때
		 * 2. 불합격일 때
		 * 3. 잘못 입력했을 때 (유효성 검사)
		 */
		
		if (score >= 60 && score <= 100) {
			System.out.println("합격");
		} else if (score >= 0 && score < 60) {
			System.out.println("불합격");
		} else {
			System.out.println("점수는 0 ~ 100점 이내로 입력하세요.");
		}
	
		
		if (score >= 0 && score <= 100) {  // 올바른 데이터인지 확인 (유효성 검사)
			
			if (score >= 60) { // 범위 내의 값 + 60점 이상인 경우 실행
     			System.out.println("합격");	
			} else {
				System.out.println("불합격");
			}
			
		} else {
			System.out.println("점수는 0 ~ 100점 이내로 입력하세요.");
		}
		
		
		
		
		
	}


	private static void m4() throws IOException {
		
		// 심리 테스트
		
		int sum = 0; // 누적 변수
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("1. 어떤 개발 툴을 선호합니까?");
		System.out.println("a. 메모장"); // +1
		System.out.println("b. 이클립스"); // +3
		System.out.println("c. 인텔리제이"); // +5
		System.out.print("선택: ");
		
		String seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum = 1;
		} else if (seq.equals("b")) {
			sum = 3;
		} else if (seq.equals("c")) {
			sum = 5;
		}
		
		
		System.out.println("2. 어떤 프로그래밍 언어를 선호합니까?");
		System.out.println("a. Java"); // +7
		System.out.println("b. C#"); // +3
		System.out.println("c. Kotlin"); // +2
		System.out.print("선택: ");
		
		seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum += 7;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 2;
		}
		
		
		System.out.println("3. 하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 4시간"); // +7
		System.out.println("b. 2시간"); // +3
		System.out.println("c. 1시간"); // +2
		System.out.print("선택: ");
		
		seq = reader.readLine();
		
		if (seq.equals("a")) {
			sum += 7;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 2;
		}
		
		
		System.out.println("설문이 완료되었습니다.");
		System.out.println("[결과]");
		
		if (sum > 10) {
			System.out.println("당신은 개발자의 자질이 있습니다.");
		} else if (sum > 6) {
			System.out.println("개발자가 되려면 조금 더 노력하세요.");
		} else {
			System.out.println("다른거 하세요.");
		}
		
		
	}


	private static void m3() throws NumberFormatException, IOException {
		// 몇 시에 기상하면 어떤 걸 타고 출근할 지
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("기상 시간(시): ");
		
		int hour = Integer.parseInt(reader.readLine());
		
		if (hour < 6) {
			System.out.println("지하철 타고 출근");
		} else if (hour >= 6 && hour < 7) {
			System.out.println("버스 타고 출근");
		} else if (hour >= 7 && hour < 8) {
			System.out.println("택시 타고 출근");
		} else {
			System.out.println("병가를 낸다.");
		}
		
		
		if (hour < 6) {
			System.out.println("지하철 타고 출근");
		} else if (hour < 7) {
			System.out.println("버스 타고 출근");
		} else if (hour < 8) {
			System.out.println("택시 타고 출근");
		} else {
			System.out.println("병가를 낸다.");
		}
		
	}



	private static void m2() throws NumberFormatException, IOException {
		// 나이 입력 후 판단
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("나이: ");
		
		int age = Integer.parseInt(reader.readLine()); // 입력 받은 문자열 -> int로 변환
		
		String result = (age >= 18) ? "성인" : "미성년자";
		System.out.println(result);
		
		if (age >= 18) {
		  System.out.println("성인");
		} else {
		  System.out.println("미성년자");
		}
		
		
	}


	private static void m1() {
		/* if문
		- 개발자가 조건을 제시한 후 조건의 결과에 따라 흐름을 제어
		- 조건식: boolean 값을 가지는 표현식
		-  if(조건식) {
		      문장;
		   }
	    -  if(조건식) {
	          문장;
	       } else {
	          문장;
	       }
		- if(조건식) {
	          문장;
	       } else if (조건식) {
	          문장;
	       } 
		- if(조건식) {
	          문장;
	       } [else if (조건식) {   -> 몇 번이든 사용 가능
	          문장;
	       }] x N
	       [else {     -> 생략 가능
	          문장;
	       }]    
		*/
		
		int num = 5;
		
		if(num > 0) { // 조건이 true일 경우에만 실행됨 (참 블럭)
			System.out.println("num은 양수입니다.");
		}
		
		if(num > 0) { // 참 블럭
			System.out.println("num은 양수입니다.");
		} else { // 거짓 블럭
			System.out.println("num은 음수입니다.");
		}
		
		if(num > 0) { 
			System.out.println("num은 양수입니다.");
		} else if (num < 0) { 
			System.out.println("num은 음수입니다.");
		} else if (num == 0) {
			System.out.println("0");
		}
		
		System.out.println("종료");
		
	}
	
}
