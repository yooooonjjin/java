package study03;

import calendar.Test4;

public class Test1004 {

	public static void main(String[] args) {
		
		String d1 = "2024-01-25";
		String d2 = "2025-07-07";

		long t1 = Test4.myDateUnixtime(d1);
		long t2 = Test4.myDateUnixtime(d2);
		
		long min = t2 - t1;
		//long min = t1 - t2;
		
		int result = (int)(min/(60*60*24));
		result = Math.abs(result);
		
		System.out.println( result );
		
	}

}
