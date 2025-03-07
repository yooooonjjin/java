package study04;

public class Test6 {

	public static void main(String[] args) {
		
		//풀어보기 1
		byte t1 = 20; //시 0 ~ 23
		byte t2 = 52; //분 0 ~ 59
		byte t3 = 12; //초 0 ~ 59

		String msg1 = "";
		//boolean result = false;

		if (  (t1 >= 0 && t1 <= 23) &&
			  (t2 >= 0 && t2 <= 59) &&
			  (t3 >= 0 && t3 <= 59) )
		{
			msg1 = "올바른";	
		} else {
			msg1 = "잘못된";	
		}
		System.out.println( t1 + "시 " + t2 + "분 " + t3 + "초는 " + msg1 + "시간입니다." );
		
		System.out.println();
		
		
		
		//풀어보기 2        출석     지각      결석
		t1 = 23; //시      6 ~ 8 | 9      | 10 ~ 14
		t2 = 30; //분     X     | 0 ~30  |
		t3 = 30; //초     X     | X      |

		String str = "무효";
		
		if ( t1 >= 6 && t1 <= 8 ) {
			str = "출석";
		} else if ( t1 == 9 ) {
			
			if ( t2 >= 0 && t2 <= 30) {
				str = "출석";
			} else {
				str = "지각";
			}
		} else if ( t1 > 9 && t1 < 14 ) {
			str = "지각";
		} else if ( t1 >= 14 && t1 <= 18 ) {
			str = "결석";
		}
		System.out.println( t1 + "시 " + t2 + "분 " + t3 + "초는 " + str + "입니다." );
		
		System.out.println();
		
		
		
		//풀어보기 3
		//짝수이고 10의 배수가 아닙니다.
		int number = 3;

		String msg3 = "";
		String msg4 = "";

		if ( number%2 == 0  ) {
			msg3 = "짝수";
		} else {
			msg3 = "홀수";
		}

		if ( number%10 == 0 ) {
			msg4 = "맞습니다.";
		} else {
			msg4 = "아닙니다.";
		}
		System.out.println( number + "는 " + msg3 + "이고 10의 배수가 " + msg4 );


	}

}
