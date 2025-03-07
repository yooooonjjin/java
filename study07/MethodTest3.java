package study07;

public class MethodTest3 {

	public static void main(String[] args) {

		//count10();
		count10();
		
		System.out.println();
		
		//count20();
		count20();
		
		System.out.println();
		
		//oddNumber100();
		oddNumber100();
	}

	//1 ~ 10 출력
	public static void count10() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
	}
	
	//1 ~ 20 출력
	public static void count20() {
		for(int i=1; i<=20; i++) {
			System.out.print(i + " ");
		}
	}
	
	//1~100 홀수만 출력
	public static void oddNumber100() {
		for(int i=1; i<=100; i++) {
			if( i%2 == 1 ) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	
}
