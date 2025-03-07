package calendar;

import java.util.Calendar;

public class Test2 {

	public static void main(String[] args) {
		
		//풀어보기 1
		String str = "2025-12-25";
		Calendar cal = Calendar.getInstance();
		
		//오늘 날짜의 유닉스 시간을 얻음
		// 1000/1000 -> 1 (초단위 계산)
		long unix1 = cal.getTimeInMillis()/1000;		//오늘
		
		String[] ars = str.split("-");
		int y1 = Integer.parseInt(ars[0]);
		int m1 = Integer.parseInt(ars[1]);
		int d1 = Integer.parseInt(ars[2]);
		
		cal.set(y1, (m1-1), d1);
		
		//넘어온 날짜의 유닉스 시간을 얻음
		// 1000/1000 -> 1 (초단위 계산)
		long unix2 = cal.getTimeInMillis()/1000;		//넘어온 날짜
		//차이를 얻어내고 날짜 계산을 한다.
		long min = unix2 - unix1;
		//60초*60초*24초 = 1일 
		long result = min/(60*60*24);
		
		System.out.println( "결과 초 : " + min );
		System.out.println( "결과 일 : " + result );
		
		
	}

}
