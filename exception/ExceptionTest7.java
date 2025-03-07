package exception;

import java.util.Scanner;

public class ExceptionTest7 {

	public static void main(String[] args) {
		
		// 풀어보기 4
		Scanner scn = new Scanner(System.in);
		System.out.println("연산 시작");
		
		System.out.print( "숫자 1 : " );
		int number1;
		try {
			number1 = scn.nextInt();
		} catch(Exception e) {
			number1 = 0;
		}
		
		scn = new Scanner(System.in);
		System.out.print( "숫자 2 : " );
		int number2;
		try {
			number2 = scn.nextInt();
		} catch(Exception e) {
			number2 = 0;
		}
		
		scn = new Scanner(System.in);
		System.out.print( "연산 기호" );
		String mark = scn.next();
		
		//mark에 의해 연산 처리
		int result = 0;
		String message = "";
		switch(mark) {
			case "+" : result = number1 + number2;
			break;
			case "-" : result = number1 - number2;
			break;
			case "*" : result = number1 * number2;
			break;
			case "/" : result = number1 / number2;
			break;
			default : message = "잘못된 연산기호입니다.";
		}
		
		int sum = number1 + number2;
		System.out.println( "결과 : " +
							(message.equals("")? ""+result: message) );
		System.out.println( "연산 종료" );

	
		
	
	
	
	}

}
