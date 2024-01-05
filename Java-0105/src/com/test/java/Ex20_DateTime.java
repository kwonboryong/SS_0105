package com.test.java;

import java.util.Calendar;
import java.util.Date;

public class Ex20_DateTime {
	public static void main(String[] args) {
		
		/*
		자바의 날짜/시간 자료형
		1. Date 클래스
		2. Calendar 클래스
		3. java.time 패키기 -> 추가 클래스
		
		
		- 시각: 때 (현재 시각: 10시 23분)
		- 시간: 기간 (수업 시간: 2시간)
		- 서로 자료형이 다름
		
		
		* 시각, 시간 => 연산
		시각 + 시각 = X
		(2024-01-05 12:30:00 + 2025-02-10 05:10:30)
		시각 - 시각 = O (결과: 시간)
		(2025-02-10 05:10:30 - 2024-01-15 12:30:00)
		- Epoch Time: 1970-01-01 00:00:00 기준으로 경과 시간을 초로 환산한 정수값
		
		시간 + 시간 = O (결과: 시간)
		시간 - 시간 = O (결과: 시간)
		
		시각 + 시간 = O (결과: 시각)
		(2024-01-05 12:30:00 + 2시간)
		시각 - 시간 = O (결과: 시각)
		
		
		*/
		 /* m1();
		 	m2();
		 	m3();
			m4(); 
		// m5();
		// m6();
			
			
			
			
			*/

		m7();
		
		
		
	}
	
	
	
	
	
	
	
	

	private static void m7() {
		// 현재 시각의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());
		
		// 전용 메서드 (현재 시각)
		System.out.println(System.currentTimeMillis());
		
		
		
		
	}









	private static void m6() {
		/* 연산3
		  시간 + 시간 = 시간
		  시간 - 시간 = 시간
		 
		 */
		
		//1.  2시간 + 1시간 = 3시간
		int h1 = 2;
		int h2 = 1;
		System.out.println(h1 + h2);
		
		
		// 2. 2시간 30분 + 10분 = 2시간 40분
		int hour = 2;
		int min = 30;
		
		min += 10; // 40분
		System.out.printf("%d시간 %d분", hour, min); // 2시간 40분
		
		
		// 3. 2시간 30분 + 40분 = 2시간 70분 => 3시간 10분
		hour = 2;
		min = 30;
		
		min += 40; // 70분
		
		// 자리올림 70분 -> 1시간 10분
		hour = hour + (min / 60); // min / 60 (정수 / 정수 = 몫) => 몫(1시간), 몫을 hour에 더함
		min = min % 60; // min % 60 => 나머지(10분)
		
		System.out.printf("%d시간 %d분", hour, min); // 2시간 40분
		
		
	}









	private static void m5() {
		// 연산2
		// 시각 - 시각 = 시간

		// 요구사항: 내가 태어나서 살아온 시간
		// 현재
		Calendar now = Calendar.getInstance();
		
		// 생일
		Calendar birthday = Calendar.getInstance(); // 현재 시간
		birthday.set(1997, 5, 20, 12, 0, 0); // 생일로 변경
		
		
		// (X) System.out.printf(now - birthday); => Epoch Time 이용
		
		// Epoch Time (= Tick)
		// :1970-01-01 00:00:00 기준으로 몇 밀리초가 경과했는지 누적값(ms, 밀리초)
		System.out.println(birthday.getTimeInMillis());
		System.out.println(now.getTimeInMillis());
		
		long gab = now.getTimeInMillis() - birthday.getTimeInMillis();
		System.out.printf("살아온 시간: %,dms\n", gab);
		System.out.printf("살아온 시간: %,d시간\n", gab / 1000 / 60 / 60); // 단위 수정: ms -> s(/1000) -> m(/60) -> h(/60)
		System.out.printf("살아온 시간: %,d일\n", gab / 1000 / 60 / 60 / 24); // 단위 수정: ms -> s(/1000) -> m(/60) -> h(/60) -> day (/24)
		
		
		// 수료일까지 얼마 남았는지 계산하기 (112일은 실제 수업 일자)
		Calendar end = Calendar.getInstance();
		end.set(2024, 5, 17);
		
		
		System.out.printf("수료일까지 남은 일: %d", (end.getTimeInMillis() - now.getTimeInMillis()) / 1000 / 60 / 60 / 24);
		
		
		// 집에 가려면 몇 시간 남았는지 계산하기
		Calendar out = Calendar.getInstance();
		out.set(Calendar.HOUR_OF_DAY, 17);
		out.set(Calendar.MINUTE, 50);
		
		System.out.printf("남은 시간: %.1f\n", (out.getTimeInMillis() - now.getTimeInMillis()) / 1000.0 / 60 / 60);
		
		
		
		
		
		
	}









	private static void m4() {
		// 연산1
		// 시각 + 시간
		// 시각 - 시간
		
		// 요구사항: 오늘 만난 커플의 100일 기념일 계산
		// 오늘(시각) - 100일(시간) = 기념일(시각)
		
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일차: %tF\n", now);
		now.add(Calendar.DATE, 99); // 오늘 날짜(now)의 Date에 99를 더함(add)
		
		System.out.printf("100일차: %tF\n", now); // now는 100일 뒤로 값이 수정되어 있음

		
		now = Calendar.getInstance(); // now 덮어쓰기 (재사용)
		
		now.add(Calendar.DATE, -7); // 날짜를 빼는 기능: 음수(-) 사용
		System.out.printf("일주일 전: %tF\n", now); 
		
		
		// 요구사항: 컵라면 3분 뒤에 먹음
		now = Calendar.getInstance(); // now 덮어쓰기 (재사용)
		
		now.add(Calendar.MINUTE, 3); 
		System.out.printf("라면 시간: %tT\n", now); 
		
		
	}


	private static void m3() {
		
		// Calendar 메서드
		// 1. int get(int): 읽기
		// 2. void set(값): 쓰기
		
		// 특정 날짜 생성하기 : 현재 시각(int get(int)) -> 원하는 날짜로 수정(void set(값))
		// 올해 크리스마스 출력하기
		// 1. 현재 시각
		Calendar christmas = Calendar.getInstance(); 
		
		
		// 2. 수정
		// christmas.set(Calendar.DATE, 25); // Date를 25로 변경 
		// christmas.set(Calendar.MONTH, 11); // Month를 12로 변경 (index가 0부터 시작!)
		christmas.set(2024, 11, 25);
		System.out.printf("%tF\n", christmas);

		christmas.set(2024, 11, 25, 18, 30, 0);
		System.out.printf("%tF %tT\n", christmas, christmas);
		
	}

	private static void m2() {

		// Calendar 클래스
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1);
		System.out.println();
		
		// 집합 데이터 => 내가 원하는 항목 추출
		// int get(int)
		
		System.out.println(c1.get(1)); // 년도
		System.out.println(c1.get(2));
		System.out.println(c1.get(3));
		System.out.println(c1.get(4));
		System.out.println(c1.get(5));
		
		int year = 1;
		System.out.println(c1.get(year)); // 년도
		
		System.out.println(Calendar.YEAR); // 상수(대문자)
		
		
		// Calendar.YEAR => 캘린더 상수
		System.out.println(c1.get(Calendar.YEAR)); // 2024년 
		System.out.println(c1.get(Calendar.MONTH)); // 0월 (월: 0 ~ 11 (0부터 시작))
		// 월: 0 ~ 11 (0부터 시작)
		System.out.println(c1.get(Calendar.DATE)); // 5일
		System.out.println(c1.get(Calendar.HOUR)); // 11시(12시간 표기법)
		// Hour: 12시간 표기법, Hour_of_day: 24시간 표기법
		System.out.println(c1.get(Calendar.HOUR_OF_DAY)); // 11시 (24시간 표기법)
		System.out.println(c1.get(Calendar.MINUTE)); // 8분
		System.out.println(c1.get(Calendar.SECOND)); // 45초
		System.out.println(c1.get(Calendar.MILLISECOND)); // 9.82 밀리초
		System.out.println(c1.get(Calendar.AM_PM)); // 0 (오전: 0, 오후: 1)
		// * 오전: 0, 오후: 1로 표시
		System.out.println(c1.get(Calendar.DAY_OF_YEAR)); // 5 (올해의 며칠인지 -> 누적)
		System.out.println(c1.get(Calendar.DAY_OF_MONTH)); // 5 (이번 달의 며칠인지)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK)); // 6 (요일, 이번 주의 며칠인지) 
		// * 자바는 일요일: 1 ~ 토요일: 7인 시스템 (언어마다 다르니 index가 0/1 중 뭘로 시작하는지 확인해야 함)
		System.out.println(c1.get(Calendar.WEEK_OF_YEAR)); // 1 (올해의 몇 주차인지)
		System.out.println(c1.get(Calendar.WEEK_OF_MONTH)); // 1 (이번 달의 몇 주차인지)
		System.out.println();
		System.out.println();
		
		
		
		// 요구사항: "오늘은 2024년 1월 5일입니다." 출력하시오 (오늘 날짜)
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
								, c1.get(Calendar.YEAR)
								, c1.get(Calendar.MONTH) + 1
								, c1.get(Calendar.DATE));
		// * Month는 0부터 시작하기 때문에 출력 시 + 1 해주기
		
		
		// "오늘은 2024년 01월 05일입니다."로 출력
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n"
								, c1.get(Calendar.YEAR)
								, c1.get(Calendar.MONTH) + 1
								, c1.get(Calendar.DATE));
		// * 자릿수를 2로 하고 앞에 0을 붙이면 => 출력되는 숫자가 2자리가 안되면 빈 공간에 0을 추가함
		
		
		
		// 요구사항: "지금은 오전 11시 36분 49초입니다." 출력하기
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다.\n"
				, c1.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
				, c1.get(Calendar.HOUR)
				, c1.get(Calendar.MINUTE)
				, c1.get(Calendar.SECOND));
		
		
		// 간단 출력 방법: printf()의 날짜/시간 형식 문자
		// 1. %tF
		System.out.printf("%tF\n", c1); // 2024-01-05 
		// 2. %tT
		System.out.printf("%tT\n", c1); // 11:32:00 
		// 3. %tA
		System.out.printf("%tA\n", c1); // 금요일
		
		
		
		
		
		
		
		
	}

	
	private static void m1() {
		
		// Date 클래스
		Date now = new Date(); // now => 컴퓨터의 시각을 가져온다.
		
		System.out.println(now); // Fri Jan 05 10:43:38 KST 2024
	}

	
	
	
	
	
	
	
	
	
}
