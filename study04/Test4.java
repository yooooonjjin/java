package study04;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String name = "홍길동";
		System.out.println("성별 입력 (M or F) : ");
		String gender =  scn.next();
		//String gender = "M";
		
		String address = "구리시";

		String msg = "";
		
		if ( gender.equals("M") ) {	// >=, <=, !=, > :: 숫자적용
			msg = "남성";
		} else if ( gender.equals("F") ) {
			msg = "여성";
		} else {
			msg = "설정 안됨";
		}
		System.out.println( "회원님의 이름은 " + name + "이고 주소는 " + address + "이며 성별은 " + msg + "입니다.");
		
		System.out.println();
		
		
		
		
		

	}

}
