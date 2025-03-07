package study05;

public class ForTest2 {

	public static void main(String[] args) {

		//세로로 1 ~ 5까지 출력
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}

		System.out.println();
		
		//가로로 1 ~ 100까지 출력
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//예제 2
		//가로로 11 ~ 20까지 출력
		for(int b=11; b<=20; b++) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		//예제 3
		//1 ~ 100까지의 숫자 중 홀수만
		for(int i=1; i<=100; i++) {
			int result = i%2;
			if ( result == 1 ) { //1 : 홀수, 0 : 짝수
				System.out.print( i + " " );
			}
		}
		

		
		System.out.println();
		System.out.println();
		
		
		//예제 5
		//1990년 ~ 2025년
		for(int i=1990; i<=2025; i++) {
			int age = 2025 - i;
			System.out.print( i + "년("+age+"세) " );
		}

		System.out.println();
		System.out.println();
		
		//예제 6
		//구구단 3단 출력 ( 3x1=3 ~ 3x9=27 )
		int dan = 3;
		for(int i=1; i<=9; i++) {
			System.out.println( dan + "x" + i + "=" + (dan*i) );
		}
		
		System.out.println();
		System.out.println();
		
		//예제 4
		dan = 2;
		for(int i=1; i<=5; i++) {
			if ( i%2 == 1 ) { //1 : 홀수, 0 : 짝수
				System.out.println( dan + "x" + i + "=" + (dan*i) );
			}
		}


		
		
	}

}
