package study02;

/**
 * [3강 여러 연산자들 알아보기] - 복슥
 */
public class Test9 {

	public static void main(String[] args) {

		//[산술 연산자]
		//예제 1 연산처리
		int eng = 92; //영어 92점
		int kor = 88; //국어 88점
		int math = 98; //수학 98점
		
		//합계
		int hap = eng + kor + math;
		System.out.println( "합계 : "+ (eng + kor + math) );
		System.out.println( "합계 : "+ hap );
		
		//평균
		int avg = hap / 3;
		System.out.println( "평균 : "+ avg );
		
		System.out.println();
		
		//예제 2 연산처리 - 나눈 나머지 값
		int number = 68;
		int number2 = 10;
		System.out.println( number + "을 " + number2 +"으로 나눈 나머지 값은?");
		System.out.println((number % number2) + "입니다.");
		
		System.out.println();
		
		//예제 3 연산처리 - 구구단 형식
		int number3 = 5;
		System.out.println(number3*1);
		System.out.println(number3*2);
		System.out.println(number3*3);
		
		System.out.println();
		
		//[연결 연산자]
		//예제 1 연결처리
		String name1 = "하이미디어";
		String name2 = "컴퓨터학원";
		
		// 하이미디어컴퓨터학원
		System.out.println( name1 + name2 );
		// 하이미디어 컴퓨터학원
		System.out.println( name1 + " " + name2 );
		// 학원명 : 하이미디어 컴퓨터학원
		System.out.println("학원명 : " + name1 + " " + name2 );
		
		System.out.println();
		
		//실습 1
		//사과의 가격은 500원 입니다.
		String fruit = "사과";
		int price = 500;
		System.out.println( fruit + "의 가격은 " + price + "원 입니다.");
		
		System.out.println();
		
		//실습 2
		int eng2 = 90;
		int math2 = 100;
		
		//영어 90 수학 100
		System.out.println( "영어 " + eng2 + " 수학 " + math2 );
		
		//영어(90), 수학(100)
		System.out.println("영어(" + eng2 + "), 수학(" + eng2 + ")");
		
		/* 영어 : 90
		 * 수학 : 100
		 * 합계 : 190
		 * 평균 : 95
		 */
		
		
	}

}
