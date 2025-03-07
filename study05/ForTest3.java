package study05;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		
		//예제 7
		//사용자가 단을 직접 입력
		Scanner scn = new Scanner(System.in);
		//System.out.println("구구단 숫자를 입력하세요. : ");
		int dan = 3;
		//int dan = scn.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println( dan + "x" + i + "=" + (dan*i) );
		}
		
		System.out.println();
		
		//예제 8
		//System.out.println("별 출력 개수를 입력하세요. : ");
		int nn = 7;
		//int nn = scn.nextInt();
		for(int i=1; i<=nn; i++) {
			System.out.print( "*" );
		}
		
		System.out.println();
		System.out.println();
		
		//달력 형식 ( 1 ~ 31 ) 한 줄에 7개씩
		for( int d=1; d<=31; d++ ) {
			if( d < 10 ) {
				System.out.print( "0" ); //숫자 정렬 맞추기
			}
			System.out.print( d + " " );
			//if(d == 7 || d == 14 || d == 21 || d == 28 ){
			if( d%7 == 0 ){
				System.out.println();
			} 
			
		}
		

		
		
	}

}
