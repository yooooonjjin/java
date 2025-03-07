package study06;

import java.util.Scanner;

public class MiniTest1 {

	public static void main(String[] args) {
		
		
		//1번 
		/*
		 * 상단에 있는 메뉴 window -> Preferences -> General -> Workspace를 클릭하면
		 * 작업공간의 경로를 확인할 수 있습니다. (C:\eclipse-workspace7)
		*/
		
		//2번 번호별 설명 내용을 보고 작성하시오.
		String nickname = "뻐꾸기";
		int point = 1000;
		
		//(1) point 300증가
		point += 300;
		//(2) point 20차감
		point -= 20;
		//(3) 출력
		System.out.println( "현재 " + nickname + "님의 보유 포인트는 " + point +"P 입니다." );
		
		
		System.out.println();
		
		
		//3번 조건문을 사용하는 문제
		int yy = 1998;
		int mm = 8;
		int dd = 21;

		//1 ~ 9 앞에 0 붙이기
		String zero = (mm < 10)?"0":""; //삼항연산
		//mm이 10보다 작으면 앞에 0이 붙고, 아니면 안붙도록 함
		String birthday =  yy + "/" + zero + mm + "/" + dd; //10, 11, 12
		int age = 2025-yy;
		//int age = 2025-(yy-1);
		String str = "";
		
		if(mm >= 3 && mm <= 5) {
			str = "봄";
		} else if(mm >= 6 && mm <= 8) {
			str = "여름";
		} else if(mm >= 9 && mm <= 11) {
			str = "가을";
		} else if(mm == 12 && mm >= 1) {
			str = "겨울";
		} else {
			str = "잘못 입력된 계절";
		}	

		System.out.println( "회원님의 생일은 " + birthday + "로 올해 " + age + "세이고 " + str + "에 태어났습니다." );
		//System.out.println( "회원님의 생일은 " + yy + "/" + mm + "/" + dd + "로 올해 " + age + "세이고 " + result + "에 태어났습니다." );
		
		
		System.out.println();
		
		
		//4번 반복문 사용 : 0 ~ 23시까지 출력 (가로 출력)
		//if문 활용
		for(int i=0; i<=23; i++) {
			if(i < 10) {
				System.out.print( "0" );
			}
			System.out.print( i + "시 ");
		}
		
		System.out.println();
		
		//삼항연산 활용
		for( int i=0; i<=23; i++ ) {
			String zero4 = (i<10)?"0":"";
			System.out.print( zero4 + i + "시 ");
		}
		System.out.println("\n");
		
		
		//5번 반복문을 사용하는 문제
		for(int i=10; i<=50; i+=10) {
			System.out.print( i + "대");
			//50대 이하에만 쉼표를 찍겠다
			if( i < 50 ) {
				System.out.print( ", ");
			}
		}
	
		
		System.out.println("\n");
		
		
		//6번 반복문을 사용하는 문제
		for(int i=1; i<=9; i++) {
			if ( i%3 == 0) {
				System.out.print(i + " ");
				for(int j=1; j<=i; j++) {
					if ( j%3 == 0) {}
					System.out.print("*");
				}
				System.out.println();
			}

		}
		
		//강사님 풀이
		for( int i=3; i<=9; i+=3 ) { //3, 6, 9
			System.out.print(i + " " );
			
			for( int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//7번 (숫자) ~ (숫자)까지 중 (숫자)의 배수는 몇개있을까?
		Scanner scn = new Scanner(System.in);
		System.out.print("끝 번호 입력 : ");
		int end = scn.nextInt();
		System.out.print("알아볼 배수 값 입력 : ");
		int num = scn.nextInt();
		
		//강사님 풀이
		int cnt = 0;
		for( int i=1; i<=end; i++ ) {
			//3의 배수만
			int ret = i%num;
			if( ret == 0 ) {
				cnt++;
			}
		}
		System.out.println("1부터 " + end + "까지의 " + num + "의 배수는 " + cnt + "개 있습니다.");
	}

}
