package study03;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {

		//Scanner 기능 : Console 화면에 입력 상태를 제공해주는 클래스 (파일)
		Scanner scn = new Scanner(System.in); //사용 선언
		System.out.print("영어점수 : ");
		int eng = scn.nextInt(); //입력상태제공
		
		if( eng >= 60 ) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		System.out.println();
		
		System.out.print("5의 배수릉 입력 : ");
		int number = scn.nextInt(); //입력상태제공
		int result = number%5;
		
		if ( result == 0 ) {
			System.out.println("5의 배수");
		} else {
			System.out.println("5의 배수가 아님");
		}
			
		
		
		
		
		
	}

}
