package exception;

import java.util.Scanner;

public class ExceptionTest6 {

	public static void main(String[] args) {

		int number1 = (int)(Math.random()*100) + 1;
		
		//Scanner scn = new Scanner(System.in);

		Scanner scn = null;
		int i = 0;
		while(i<20) {
			try {
				/**
				 * nextInt() 메소드의 오류발생 시 scn의 메모리 경로가 파손 됨
				 * 그래서 scn = new Scanner를 다시 실행하여 다시 획득함
				 */
				scn = new Scanner(System.in);
				System.out.println( "(1 ~ 100사이) 번호 : " );
				int number2 = scn.nextInt();	//오류 발생시에 프로그램 자동 종료
				if( number2 < number1 ) {
					System.out.println( number2 + "(는)은 시스템 값보다 작다." );
				} else if( number2 > number1 ) {
					System.out.println( number2 + "(는)은 시스템 값보다 크다." );
				} else {
					System.out.println( "정답입니다." );
					break;
				}
			} catch (Exception e) {
				System.out.println( "숫자(정수)만 가능합니다." );
			}
			i++;
		}
	}

}
