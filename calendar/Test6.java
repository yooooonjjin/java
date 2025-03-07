package calendar;

import java.util.Calendar;

public class Test6 {

	public static void main(String[] args) {
		
		String data = "1740032633294";
		
		Calendar cal = Calendar.getInstance();
		
		//(1) data 변수의 long 타입 변환
		//(2) 초단위로의 변환
		long unix1 = Long.parseLong(data)/1000;
		cal.setTimeInMillis(unix1);
	
		//(3) 60일을 초단위로 계산함
		int plus = (60*60*24)*60;
		
		//(4) 초단위로 변환된 결과 값과 합산함
		long unix2 = unix1 + plus;
		unix2 = unix2*1000;
		
		//(5) setTimeInMillis()로 시점 변환
		cal.setTimeInMillis(unix2);
		
		//(6) get() 메소드를 통해 년월일을 가져옴
		//int yy = cal.get(Calendar.YEAR);
		//int mm = cal.get(Calendar.MONTH);
		//int dd = cal.get(Calendar.DATE);

		int yy = cal.get(1);
		int mm = cal.get(2); //0 ~ 11
		int dd = cal.get(5);
		
		
		System.out.println( yy + "년 " + (mm+1) + "월 " + dd + "일 입니다. ");
		
		
		//System.out.println(cal.getTimeInMillis());

	}

}
