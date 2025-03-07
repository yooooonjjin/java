package calendar;

import java.util.Calendar;

public class UnixTest1 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2025, 11, 25);	//2025-12-25 0:0:0
		
		
		// 1000/1000 -> 1 (초단위 설정)
		//System.out.println( cal.getTimeInMillis()/1000 );
		
		long unixTime = cal.getTimeInMillis();
		int time = (int)(unixTime/1000);

		System.out.println( unixTime );
		System.out.println( time );
		//예) abc.jpg --> 1766630782518L.jpg
		
		//1766630782518L
	
		cal.setTimeInMillis(1166630782518L);
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DATE);

		System.out.println( yy + "-" + (mm+1) + "-" + dd );
		
		System.out.println();
		
		Calendar cal2 = Calendar.getInstance();
	
		String data = "1177730782518";
		//2025년 1월 10일이고 31일까지 있습니다.
		//int time2 = Integer.parseInt(data);	//예외사항발생
		long unixtime = Long.parseLong(data);
		cal2.setTimeInMillis(unixtime);
		
		int yy2 = cal2.get(Calendar.YEAR);
		int mm2 = cal2.get(Calendar.MONTH);
		int dd2 = cal2.get(Calendar.DATE);
		
		int lastday2 = cal2.getActualMaximum(Calendar.DATE);	//마지막 날짜
		
		System.out.println( yy2 + "년 " + (mm2+1) + "월 " + dd2 + "일이고 " + lastday2 + "까지 있습니다." );
		
	}	

}
