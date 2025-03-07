package myThread;

import java.util.ArrayList;
import java.util.List;

public class Lotto5 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		int i = 0;
		String str = "";
		while(true) {
			int chk = 0;
			int num = (int)(Math.random()*45) + 1;
			for( int nm : list ) {
				if( nm == num ) {
					chk = 1;
					str += num + " ";
				}
			}
			if ( chk == 0 ) {
				list.add(num);
				i++;
			}
			if(i == 6) break;
		}
		//for( int j=0; j<list.size(); j++ ) {
		//	System.out.print( list.get(j) + " " );
		//}
		//System.out.println();
		
		// 확장 For문 : 배열 형식의 데이터만 가능
		// for( 데이터 타입 및 변수명 : 배열변수 )
		for( int n : list ) {
			System.out.print( n + " " );
		}
		System.out.println();
		System.out.println( str );
		
	}

}
