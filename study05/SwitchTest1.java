package study05;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		
		//switch문
		
		//예제 1
		int number =7;
		
		switch( number ) {
			case 1 : System.out.println("1입니다.");
			break;
			case 2 : System.out.println("2입니다.");
			break;
			case 3 : System.out.println("3입니다.");
			break;
			default : System.out.println("몰라요.");
		}
		
		if( number == 1 ) {
			System.out.println("1입니다.");
		} else if( number == 2 ) {
			System.out.println("2입니다.");
		} else if( number == 3 ) {
			System.out.println("3입니다.");
		} else {
			System.out.println("몰라요.");
		}
		
		System.out.println();
		
		//예제 2
		char gender = 'F';
		switch( gender ) {
			
			case 'M' : System.out.println("남성");		
			break;
			case 'F' : System.out.println("여성");		
			break;
			default : System.out.println("모름");
		}

		System.out.println();
		
		//예제 3
		
		//사용자가 직접 mark 값을 입력
		//Scanner scn = new Scanner(System.in);

		int a = 10;
		int b = 20;
		//System.out.println("연산 기호를 입력하세요. : ");
		//String mark = scn.next();
		String mark = "*";
		
		switch( mark ) {
			case "+" : System.out.println( a + b );
			break;
			case "-" : System.out.println( a - b );
			break;
			case "*" : System.out.println( a * b );
			break;
			case "/" : System.out.println( a / b );
			break;
			default : System.out.println("오류");
		}
		
		if( mark.equals("+") ) {
			System.out.println( a + b );
		} else if( mark.equals("-") ) {
			System.out.println( a - b );
		} else if ( mark.equals("*") ) {
			System.out.println( a * b );
		} else if ( mark.equals("/") ) {
			System.out.println( a / b );
		} else {
			System.out.println("오류");
		}
		
		// switch( number > 2 조건식이 올 수 없음 ) {}
		
		System.out.println();
		
		//예제 4
		String name = "홍길동";
		int pay = 100;
		int level = 1; //등급
		switch(level) {
			case 1 : pay += 30;
			break; //switch문의 종료
			case 2 : pay += 20;
			break; //switch문의 종료
			case 3 : pay += 10;
			break; //switch문의 종료
		}
		
		System.out.println( name + "님의 최종 급여는 " + pay + "만원 입니다.");

		System.out.println();
		
		//예제 5
		int age = 39;
		String msg = "";
		switch( age%10 ) {
			case 9 : msg = "올해가 아홉수네요, 조심하세요.";
			break;
			default : msg = "평범한 한해가 되겠네요.";
		}
		System.out.println(msg);
		
		System.out.println();
		
		/*
		int n1 = 10;
		int n2 = 20;
		
		boolean result = true;
		switch( result ) {
			case true : System.out.println("11");
			break;
		}
		System.out.println( n1 < n2 );
		/*
		if( true ) {
			System.out.println("11");
		}
		*/

		/*
		if( false ) {
			System.out.println("22");
		} else {
			System.out.println("33");
		}


		if( 1==1 && 2==2 ) {
			System.out.println("44");
		}


		if( 1==1 && 2==3 ) { //false
			System.out.println("55");
		}


		if( 1==1 || 2==2 ) { //true
			System.out.println("66");
		}


		if( 1==1 || 2==3 ) { //true
			System.out.println("77");
		}

		if( 1==2 || 2==3 ) { //false
			System.out.println("88");
		}
		*/
		
		
		
	}

}
