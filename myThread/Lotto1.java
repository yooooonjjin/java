package myThread;

import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {

		Random rn = new Random();
		
		String lotto1 = ",";
		
		int i = 0;
		while( true ) {
			int num = rn.nextInt(45)+1;
			String str = "," + num + ",";
			
			if( lotto1.indexOf(str) == -1 )  {
				lotto1 += num+",";
				i++;
			}
			if( i == 6 ) break;
		}
		
		lotto1 = lotto1.replace(","," ");	// , 를 공백으로 변경
		lotto1 = lotto1.trim();				// 앞,뒤 공백 제거
		System.out.print( lotto1 );
		
		//int z = (int)Math.ceil(Math.random()*45);	
	}
}
