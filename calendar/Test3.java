package calendar;

import java.util.Calendar;

/**
 * 풀어보기 2
 */

public class Test3 {

	public static void main(String[] args) {

		String date1 = "2025-02-24";
		String date2 = "2025-02-26";
	
		Calendar cal1 = Calendar.getInstance();
		String[] arr1 = date1.split("-");
		int y1= Integer.parseInt(arr1[0]);
		int m1= Integer.parseInt(arr1[1]);
		int d1= Integer.parseInt(arr1[2]);
		
		cal1.set(y1, (m1-1), d1);
		long unix1 = cal1.getTimeInMillis()/1000;
		
		
		Calendar cal2 = Calendar.getInstance();
		String[] arr2 = date2.split("-");
		int y2= Integer.parseInt(arr2[0]);
		int m2= Integer.parseInt(arr2[1]);
		int d2= Integer.parseInt(arr2[2]);
		
		cal2.set(y2, (m2-1), d2);
		long unix2 = cal2.getTimeInMillis()/1000;
		
		long min = unix2 -unix1;

		//60초*60초*24 = 하루
		int result = (int) min/(60*60*24);
		
		System.out.println( result );
		
		//2025-02-24와 2025-02-26은 2일 차이입니다.
		
	}

}
