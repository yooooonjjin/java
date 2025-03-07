package calendar;

import java.util.Calendar;

public class Test5 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		long unix1 = cal.getTimeInMillis();

		long sum = 0L;
		for(int i=0; i<100000000; i++) {
			sum += i;
		}
		
		cal = Calendar.getInstance();
		long unix2 = cal.getTimeInMillis();
		
		System.out.println( unix2 - unix1 );
		
		cal = Calendar.getInstance();
		unix1 = cal.getTimeInMillis();
		
		sum = 0L;
		int i = 0;
		while( i < 1200000000 ) {
			sum += i;
			i++;
		}

		cal = Calendar.getInstance();
		//long unix2 = cal.getTimeInMillis();
		
		System.out.println( unix2 - unix1 );
	}

}
