package Exam;

import java.util.Calendar;

/**
 *  추상화(추상클래스, 인터페이스) : 명세처리 메소드 생성
 */

abstract class MyStringMethod {
	
	abstract public String dayOfWeek(String date);
	abstract public int getLastday(String date);
}

public class MyStringImpl extends MyStringMethod {

	public static void main(String[] args) {
		
		MyStringImpl my = new MyStringImpl();
		System.out.println( my.dayOfWeek("2025-03-07") );
		System.out.println( my.getLastday("2025-03-07") );
		
	}

	/**
	 *  다형성 (오버로딩   - 깉은 클래스에서 같은 이름의 메소드를 구성하는 일  
	 *  	  오버라이딩  - 상위클래스의 메소드를 재구성)
	 */
	@Override
	public String dayOfWeek(String date) {
		
		Calendar cal = Calendar.getInstance();
		String[] array = date.split("-");
		int yy = Integer.parseInt(array[0]);
		int mm = Integer.parseInt(array[1]);
		int dd = Integer.parseInt(array[2]);
		cal.set( yy,mm-1,dd );
		
		int w1 = cal.get(Calendar.DAY_OF_WEEK);	// 일(1) ~ 토(7)
		String w2 = "";
		switch( w1 ) {
			case 1 : w2 = "일요일";
			break;
			case 2 : w2 = "월요일";
			break;
			case 3 : w2 = "화요일";
			break;
			case 4 : w2 = "수요일";
			break;
			case 5 : w2 = "목요일";
			break;
			case 6 : w2 = "금요일";
			break;
			case 7 : w2 = "토요일";
			break;
		}
		return w2;
	}

	@Override
	public int getLastday(String date) {

		Calendar cal = Calendar.getInstance();
		String[] array = date.split("-");
		int yy = Integer.parseInt(array[0]);
		int mm = Integer.parseInt(array[1]);
		int dd = Integer.parseInt(array[2]);
		cal.set( yy,mm-1,dd );
		
		int lastday = cal.getActualMaximum(Calendar.DATE); 
		
		return lastday;
	}
	
}
