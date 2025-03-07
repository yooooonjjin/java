package study05;

public class ForTest7 {

	public static void main(String[] args) {
		
		//무한루프 (끝없는 반복)
		int a = 0;
		for(;;) {
			a++;
			System.out.println(a);
			if( a == 100 ) {
				break; //반복문의 종료
			}
		}
		
		System.out.println("\n\n");
		
		for( int i=1; i<=100; i++) {
			if( i == 50 ) {
				break; //반복문의 종료
			}
			System.out.println(i);
		}
		
		System.out.println("\n\n");
		
		for( int i=1; i<=100; i++) {
			if( i == 50 ) {
				continue; //반복문 건너뛰기
			}
			System.out.println(i);
		}

	}

}
