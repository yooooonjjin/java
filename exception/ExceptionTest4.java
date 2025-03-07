package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		// charAt() : StringIndexOutOfBoundsException
 		String str = "java";
		int index = 2;
		
		try {
			System.out.println( "문자열 " + str + "의 " + index + "번은 \"" + str.charAt(index) + "\" 입니다." );
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println( "문자열 " + str + "의 " + index + "번은 없는 번호입니다." );
		}
		// (역슬레쉬) \ 는 뒤에 있는 의미있는 특수 문자를 의미를 지워버리는 역할을 함
		//System.out.println( "문자열의 0번은 \"j\" 입니다." );
	
		System.out.println();
		
		// 풀어보기 2	
		try {
			Scanner scn = new Scanner(System.in);
			int number1 = 10;
			System.out.println("번호 입력 : ");
			int number2 = scn.nextInt();
			
			System.out.println( number1 + "을 " + number2 + "로 나눈 나머지는 " +  (number1%number2) + "입니다." );
		} catch(InputMismatchException e) {
			System.out.println( "문자열이 입력 되었습니다.");
		} catch(ArithmeticException e) {
			//System.out.println( number1 + "을 " + number2 + "로 나눌 수 없습니다." );
			System.out.println( "10을 0으로 나눌 수 없습니다.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

} 