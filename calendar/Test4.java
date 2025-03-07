package calendar;

import java.util.Calendar;

public class Test4 {

	public static long myDateUnixtime(String date) {	//매개변수
		
		Calendar cal = Calendar.getInstance();
		String[] arr = date.split("-");
		int y1= Integer.parseInt(arr[0]);
		int m1= Integer.parseInt(arr[1]);
		int d1= Integer.parseInt(arr[2]);
		
		cal.set(y1, (m1-1), d1);	//시점세팅
		
		long unix = cal.getTimeInMillis()/1000;
		
		return unix;
	}
	
	public static void main(String[] args) {

		String date1 = "2025-02-26";
		String date2 = "2025-02-23";
	
		long unix1 = myDateUnixtime(date1);
		long unix2 = myDateUnixtime(date2);
		
		long min = unix2 - unix1;
		long result = (int)(min/(60*60*24));
		
		//절대값 메소드
		result = Math.abs(result);
		
		//2025-02-24와 2025-02-26은 2일 차이입니다.
		System.out.println( date1 +"와 " + date2 + "은 " + result + "일 차이입니다." );
		
	}

}

