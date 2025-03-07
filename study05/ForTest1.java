package study05;

public class ForTest1 {

	public static void main(String[] args) {

		//for (초기값; 비교조건; 증감조건)
		for(int i=1; i<=7;  i++) { //반복요건
			System.out.println("java");
		}
		
		System.out.println();
		
		for(int i=1; i<=3; i++) {
			System.out.println("css");
		}
		
		System.out.println();
		
		for(int i=1; i<=1; i++) {
			System.out.println("html");
		}
		
		System.out.println();
		
		//비교 조건 값이 초기값보다 큰 경우 실행 안됨
		for(int i=1; i<1; i++) {
			System.out.println("aa");
		}

		System.out.println();

		for(int i=0; i<1; i++) { //1번 실행
			System.out.println("bb");
		}
		
		System.out.println();

		for(int i=11; i<=15; i++) { // 11, 12, 13, 14, 15
			System.out.println("cc");
		}	
		
		
	}

}
