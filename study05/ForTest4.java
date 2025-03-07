package study05;

public class ForTest4 {

	public static void main(String[] args) {
		
		
		for( int i=10; i>=1; i-- ) {
			System.out.print(i+" ");
		}

		System.out.print("\n\n"); // \n = 줄바꿈 (개행)
		
		// 2씩 증가 또눈 3씩 증가
		// 2씩 증가 - 1 3 5 7 9
		for( int i=1; i<=9; i+=2 ) {
			System.out.print(i+" ");
		}

		System.out.print("\n\n");
		
		// 3씩 증가 - 1 3 5 7 9
		for( int i=1; i<=9; i+=3 ) {
			System.out.print(i+" ");
		}

	}

}
