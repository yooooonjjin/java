package study12;

public class SampleSum {

	public static void main(String[] args) {

		//추상화 : 메소드 목록(명세) 처리
		sum();					//30
		sum(40,50);				//40+50 =90
		sum(100,300,500);		//100+300+500 = 900
		sum(100,300,500,300);	//100+300+500+300 = 1200

	}

	/*
	 * 매개변수의 개수 및 종류의 차이를 두고
	 * 같은 이름의 메소드를 만드는 방법을 다형성(오버로딩)이라고 한다. 
	 */

	public static void sum() {
		System.out.println( 10+20 );
	}
	
	//합계 처리 - 이름이 같아야 함	
	
	//1. 두개의 숫자만 합계 처리
	public static void sum(int a, int b) {					//매개변수
		System.out.println( a+b );
	}
	public static void sum(String a, int b) {				//형성 가능
		System.out.println( a+b );
	}
	/*
	public static void sum(int c, int d) {					//사용불가
		System.out.println( c+d );
	}
	*/

	
	//2. 세개의 숫자만 합계 처리
	public static void sum(int a, int b, int c) {
		System.out.println( a+b+c ); //연산
	}
	public static void sum(String a, int b, int c) {		//형성 가능
		System.out.println( a+b+c ); //연결
	}
	/*
	public static void sum(int a, int b, int c) {			//사용뷸가
		System.out.println( a+b+c );
	}
	*/
	
	
	//3. 배열의 내용을 합계 처리 
	public static void sum(int a, int b, int c, int d) {	//
		System.out.println( a+b+c+d );
	}
	
	
	
	
}
