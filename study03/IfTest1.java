package study03;

public class IfTest1 {

	public static void main(String[] args) {
		
		int eng = 80; //60점 이상 합격
		System.out.println(eng >= 60); //true
		System.out.println(eng < 60 ); //false
		
		System.out.println();
		
		//if문
		if( eng >= 60 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println();
		
		//삼항연산자
		System.out.println( ( eng >= 60 )?"합격":"불합격" );
		
		System.out.println();
		
		//if문
		if ( eng == 100 ) {
			System.out.println("만점");
		} else {
			System.out.println("만점 아님");
		}
		
		System.out.println();
		
		int number = 35;
		int result = number%5;
		
		if ( result == 0 ) {
			System.out.println("5의 배수");
		} else {
			System.out.println("5의 배수가 아님");
		}
			
		System.out.println();
		
		//성별 ( 1 : 남성, 2 : 여성, 이외 : 잘못된 번호 )
		int gender = 2;
		
		if ( gender == 1 ) {
			System.out.println("남성");
		} else if ( gender == 2 ) {
			System.out.println("여성");
		} else {
			System.out.println("잘못된 번호");
		}
		
		
		
		
		
		
		
	}

}
