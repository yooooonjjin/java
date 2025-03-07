package study06;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		/*if(true) {
			System.out.println("a");
		*/
		
		/*for(;;) {
			System.out.println("b");
		}*/
		
		/*while(true) {
			System.out.println("b");
		}*/

		int a = 1;
		while( a<=10 ) {
			System.out.print( a + " " );
			a++;
		}
		
		System.out.println("\n");
		
		//for( int b=1; b<=10; b++) {
		//	System.out.print( b + " " );
		//}
		
		//10 ~ 1까지
		int b = 10;
		while ( b>=1 ) {
			System.out.print( b + " " );
			b--;
		}
		
		System.out.println("\n");
		
		//10 ~ 100 (10씩 증가)
		int d = 10;
		while (d<=100) {
			System.out.print( d + " " );
			d+=10;
		}
		
		System.out.println("\n");
		
		//1 2 3 4 5 6 7 8 9 10 출력 후 10단위마다 종료하시겠습니까?라고 물어보기 0을 입력하면 종료, 0을 입력하지 않으면 계속 숫자가 찍히도록		
		Scanner scn = new Scanner(System.in);
		int cnt = 1;
		//조건없이 무조건 허용하겠다 (무한루프)
		while(true) {
			System.out.print(cnt + " " );
			if( cnt%10 == 0 ) {
				System.out.println("계속 실행 'Y', 종료 'N' 입력하세요." );
				String str = scn.next();
				if( !str.equals("Y")) {
					System.out.println("종료됐습니다.");
					break;
				}
			}
			cnt++;
		}
		
		
		
		
		
		
		
		
	}

}
