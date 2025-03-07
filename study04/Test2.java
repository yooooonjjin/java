package study04;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		//다중 조건식
		
		//실습 1
		
		//사용자 직접 입력
		//Scanner scn = new Scanner(System.in);
		
		//System.out.println("이름 입력 : ");
		//String name = scn.next(); //String은 next
		
		//System.out.println("연차 입력 : ");
		//int year = scn.nextInt(); //int는 nextInt

		int year = 12;
		String name = "홍길동";
		
		String level = "";
		
		//홍길동님의 연차는 12년으로 고급입니다.
		
		if ( year >= 16 ) {
			level = "특급";
		} else if ( year >= 11 ) {
			level = "고급";
		} else if ( year >= 6 ) {
			level = "중급";
		} else if ( year >= 3 ) {
			level = "초급";
		} else {
			level = "신입";
		}
		
		//else if는 위에서부터 충족하는 조건이 있으면 바로 종결해버림
		//연차 10년을 입력해도 이미 위에서 3년 이상이라는 조건을 충족했으므로 초급이라고 뜸
		/*
		if ( year < 3 ) {
			level = "신입";
		} else if ( year >= 3 ) {
			level = "초급";
		} else if ( year >= 6 ) {
			level = "중급";
		} else if ( year >= 11 ) {
			level = "고급";
		} else {
			level = "특급";
		}
		 */
		
		
		System.out.println( name + "의 연차는 " + year + "년으로 " + level + "입니다." );
		
		
		
		System.out.println();
		
		//실습 2
		String name2 = "홍길동";
		String gender = "M";
		String address = "구리시";

		String msg = "";
		
		if ( gender == "M" ) {
			msg = "남성";
		} else if ( gender == "F" ) {
			msg = "여성";
		} else {
			msg = "설정 안됨";
		}
		System.out.println( "회원님의 이름은 " + name2 + "이고 주소는 " + address + "이며 성별은 " + msg + "입니다.");
		
		System.out.println();
		
		
		
		
		
	}

}
