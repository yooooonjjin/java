package myThread;

import java.util.Random;

public class Lotto3 {

	public static void main(String[] args) {
		
		// 랜덤 클래스 형성
		Random rn = new Random();
		// 배열 변수 생성
		int[] lotto = new int[6];	// {null,null,null,null,null,null}
		
		String ss = "";
		
		// 배열 번호
		int i = 0;	// 배열 번호는 (무조건) 0번부터...
		// 반복문 (무한루프)
		while( true ) {
			int num = rn.nextInt(45)+1;
			// 중복체크
			int cnt = 0;
			for( int a=0; a<lotto.length; a++ ) {
				if( lotto[a] == num ) {
					cnt = 1;
					ss += num + ",";	//중복된 값이 있을때 누적되도록
				}
			}
			if( cnt == 0 ) {
				lotto[i] = num;
				i++;	// 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 (들어가지 않음)
			}
			if( i == 6 ) break;	
		}
		for( int j=0; j<6; j++ ) {
			System.out.print( lotto[j] + " " );
		}
		System.out.println( "\n" + ss );
	}
}
