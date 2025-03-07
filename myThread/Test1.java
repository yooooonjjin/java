package myThread;

import calendar.Test2;

public class Test1 extends Test2 {

	String a = "aa-1";
	String b = "bb-1";

	public static void main(String[] args) {
		
		for( int i=0; i<10; i++ ) {
			System.out.println( i + "초 경과 " );
			try {
				Thread.sleep(1000);
			} catch( Exception e) {}
		}
		
	}

}
