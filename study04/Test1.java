package study04;

public class Test1 {

	public static void main(String[] args) {
		
		//5강 제어구조 if문
		
		//실습 1
		int age= 23;
		
		//01
		if ( age < 20 ) {
			System.out.println("15세는 미성년자이므로 담배 판매 불가능");
		} else {
			System.out.println("23세는 성인이므로 담배 판매 가능");
		}
		
		System.out.println();
		
		//02
		if ( age >= 20 ) {
			System.out.println("23세는 성인이므로 담배 판매 가능");
		} else {
			System.out.println("15세는 미성년자이므로 담배 판매 불가능");
		}
		
		System.out.println();
		
		//03
		//System.out.println 하나만 사용, 변수의 적극 활용
		String msg1 = "";
		String msg2 = "";
		
		if ( age >= 20 ) {
			msg1 = "성인";
			msg2 = "가능";
		} else {
			msg1 = "미성년자";
			msg2 = "불가능";
		}
		
		System.out.println( age + "세는 " + msg1 + "이므로 담배 판매 " + msg2 );
		
		System.out.println();
		
		
		//04 삼항연산
		String message = ( age >= 20 ) ?
			   "23세는 성인이므로 담배 판매 가능":"15세는 미성년자이므로 담배 판매 불가능";
		
		System.out.println( message );

		
		System.out.println();
		
		
		//실습 2
		int year1 = 1999; //출생년도
		int year2 = 2025; //올해년도
		int result = year2 - year1;
		
		if ( ( year2 - year1 ) >= 20 ) {
		//if ( result >= 20 ) {
			System.out.println( result + "세는 성인이므로 담배 판매 가능" );
		} else {
			System.out.println( result + "세는 미성년자 이므로 담배를 판매할 수 없습니다." );
		}

		System.out.println();
		
		
		//실습 3
		int money = 1000;
		int price = 1500;
		String goods = "빼빼로";
		
		int result3 = money-price; //-500원
		
		if ( result3 >= 0 ) {
			System.out.println( goods +"를 사고 " + result3 + "원이 남았습니다.");
		} else {
			result3 = result3 * -1; //양수로 전환
			System.out.println( result3 + "원이 모자라서 " + goods + "를 사지 못했습니다.");
		}

		
		
		
		
		
		
		
		
	}

}
