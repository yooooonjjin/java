package study06;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		
		//1 2 3 4 5 6 7 8 9 10 출력 후 10단위마다 종료하시겠습니까?라고 물어보기 0을 입력하면 종료, 0을 입력하지 않으면 계속 숫자가 찍히도록		
		Scanner scn = new Scanner(System.in);
		int number = 0;
		//조건없이 무조건 허용하겠다 (무한루프)
		while(true) {
			if( number != 0 && number%10 == 0 ) {
				System.out.println("계속 실행 ('Y'), 종료 ('N')" );
				String str = scn.next();
				if ( str.equals("N") ) {
					System.out.println("종료하겠습니다.");
					break;
				} else if ( !str.equals("Y")) {
					continue;
				}
			}
			number++;
			System.out.println(number);
		}

				
				
	}

}
