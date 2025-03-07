package Exam;

public class LoopTest {

	public static void main(String[] args) {
		
		// i <= 31 // i < 32 // 같은 의미지만 ~거나 같다 보다는 ~다를 더 많이 사용
		for( int i = 1; i < 32; i++ ) {
			if( i%7 == 0 ) {
				System.out.print( i + " " );
			}	
		}
		
		System.out.println();
		
		int j = 1;
		while( j <= 31 ) {
			//j++;
			if( j%7 == 0 ) {
				System.out.print( j + " " );
			}
			j++; // 아래에 써도 됨
		}

	}

}
