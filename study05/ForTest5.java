package study05;

public class ForTest5 {

	public static void main(String[] args) {
		
		//문제 1 : -5 ~ 5 출력
		for( int i=-5; i<=5; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\n\n");

		//문제 2 : 101 102 103 104 105 106 107 108 109 3개씩 줄바꿈
		//		for( int i=101; i<=109; i++) {
		//			System.out.print( i + " " );
		//			if( (i-100)%3 == 0 ){
		//				System.out.println();
		//			} 
		//		}

		int cnt = 0;
		for( int i=101; i<=230; i++) {
			cnt++;
			System.out.print( i + " " );
			if( cnt%3 == 0 ){
				System.out.println();
			} 
		}
		
		System.out.print("\n\n");

		//문제 3
		for ( int i=2; i<=4; i++) {
			System.out.println("<font size ='" + i +"'>java</font>");
		}

		System.out.print("\n");

		//문제 4
		//0 ~ 5 (새벽), 6 ~11 (오전), 12 ~ 16 (오후), 17 ~ 23 (저녁)
//		for( int i=0; i<=23; i++) {
//			if (i>=0 && i<=5) {
//				System.out.print( "새벽 " );
//			} else if (i>=6 && i<=11) {
//				System.out.print( "오전 " );
//			} else if (i>=12 && i<=16) {
//				System.out.print( "오후 " );
//			} else {
//				System.out.print( "저녁 " );
//			}
//			System.out.println( i + "시" );
//		}
		
		//이렇게도 가능
		for( int i=0; i<=23; i++) {
			String msg = "";
			if (i>=0 && i<=5) msg = "새벽 ";
			else if (i>=6 && i<=11) msg = "오전 ";
			else if (i>=12 && i<=16) msg = "오후 ";
			else msg = "저녁 ";
			System.out.println( msg + i + "시" );
		}
		
		System.out.print("\n\n");
		
		for( int i=0; i<=23; i++) {
			String msg = "";
			if (i>=0 && i<=5) {
				msg = "새벽 ";
			} else if (i>=6 && i<=11) {
				msg = "오전 ";
			} else if (i>=12 && i<=16) {
				msg = "오후 ";
			} else {
				msg = "저녁 ";
			}
			System.out.println( msg + i + "시" );
		}
		
		
		
		
		
		
	}

}
