package study11;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int number = scn.nextInt();
		System.out.println( "입력 숫자 : " + number );
		
		System.out.println( Math.max(95, 80) ); //95
		
	}

}
