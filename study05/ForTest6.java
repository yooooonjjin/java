package study05;

public class ForTest6 {

	public static void main(String[] args) {
		
		//2중 for문
		for( int a=1; a<=3; a++ ) {
			for(int b=1; b<=5; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		//출력 2 (*)
		for ( int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("\n\n");
		
		//출력 3 (*)
		for ( int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
