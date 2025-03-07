package study02;

public class Test4 {

	public static void main(String[] args) {
		
		//비교 연산자
		System.out.println( 100 == 100 ); //true (100이 100과 같다.)
		System.out.println( 100 == 80 ); //false (100이 80과 같다.)
		
		System.out.println( 100 != 100 ); //false (100이 100과 같지 않다.) "!" = not
		System.out.println( 100 != 80 ); //true (100이 80과 같지 않다.) "!" = not
		
		System.out.println( 100 > 100 ); //false (100이 100보다 크다.)
		System.out.println( 100 > 80 ); //true (100이 80보다 크다.)
		
		System.out.println( 100 < 100 ); //false (100이 100보다 작다.)
		System.out.println( 100 < 80 ); //false (100이 80보다 작다.)
		System.out.println( 50 < 80 ); //true (50이 80보다 작다.)
		
		//크거나 같다.
		System.out.println( 100 >= 100 ); //true (100이 100보다 크거나 같다.)
		System.out.println( 100 >= 80 ); //true (100이 80보다 크거나 같다.)
		System.out.println( 50 >= 80 ); //false (50이 80보다 크거나 같다.)
		
		//작거나 같다.
		System.out.println( 100 <= 100 ); //true (100이 100보다 작거나 같다.)
		System.out.println( 100 <= 80 ); //false (100이 80보다 작거나 같다.)
		System.out.println( 50 <= 80 ); //true (50이 80보다 작거나 같다.)
		
		
		System.out.println();
		
		//비교연산자의 해석은 기호를 중심으로 좌측이 기준이 되어 해석을 하게됨
		System.out.println( 100 > 80 ); //true (100이 80보다 크다.)
		System.out.println( 100 > 80 ); //true (80이 100보다 작다.) //좌측 기준으로 해석, 의미는 맞으나. '작다.'의 기호가 아님
		
		System.out.println( 100 < 80 ); //false (100이 80보다 작다.)
		

	}

}
