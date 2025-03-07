package study03;

/**
 * [4강] 변수의 종류 알아보기
 */
public class Test2 {

	public static void main(String[] args) {
		
		//용량에 따른 정수 타입
		byte a1 = 90;
		short a2 = 90;
		int a3 = 90;
		long a4 = 90;

		//byte aa1 = 128; //error, (-128 ~ 127)
		short aa2 = 128;
		int aa3 = 128;
		long aa4 = 128; 
		
		//short b1 = 32768; //error, (-32,768 ~ 32,767)
		int b2 = 32768;
		long b3 = 32768; //(기본 int)

		//int bb2 = 2200000000; //error, (-21억 ~ 21억)
		long bb3 = 2200000000L; //맨 끝에 L을 꼭 써줘야 함
		//( 기본 int ) int 수치를 넘으면 맨 뒤에 L을 꼭 써줘야 오류가 안생김
		System.out.println( "long : " + bb3 );
		
		
		//점수 (0 ~ 100)
		byte eng = 100;

		System.out.println();
		
		//실수형 (소수점 포함)
		float f1 = 1.1234f; // 반드시 맨 뒤에 f를 꼭 써줘야 함
		System.out.println( "float : " + f1 );
		
		float f2 = 1.1234567f;
		System.out.println( "float : " + f2 );
		
		float f3 = 1.123456789f; //소수점 아래 7자리까지만 표현
		System.out.println( "float : " + f3 );
		
		double d1 = 1.123456789;
		System.out.println( "double : " + d1 );
		
		double d2 = 1.123456789123456789;
		System.out.println( "double : " + d2 );
		
		System.out.println();
		
		//문자형 (char) : 단 1개의 문자만 담을 수 있음
		char c1 = 'a';
		//char c2 = 'ab'; //error
		//char c3 = "a" //error
		char c4 = 'K';
		char c5 = '가';
		//char c6 = '가나'; //error
		System.out.println( c1 + "," + c4 + "," + c5 );
		System.out.println( (int)c1 + "," + (int)c4 + "," + (int)c5 ); //유니코드 값
		
		char u1 = 97; 
		System.out.println( u1 ); //a
		u1++; //1 증가, 98
		System.out.println( u1 ); //b
	
		System.out.println();
		
		//※
		System.out.println( "※" );
		char c11 = '※';
		System.out.println( c11 );
		System.out.println( (int)c11 );
		
		char c12 = 8251;
		System.out.println ( "당구장 : " + c12 );
		
		System.out.println();
		
		String s1 = "a";
		//String s2 = 'a'; //error
		System.out.println( s1 );
		//s1++; //error
	
	}

}
