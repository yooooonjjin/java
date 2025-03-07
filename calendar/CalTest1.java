package calendar;

import java.util.Calendar;

public class CalTest1 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();	//인스턴스(화)처리
	
		String date1 = "2025-12-25";
		String[] date2 = date1.split("-");
		//String[] date2 = {"2025", "12", "25"};
		
		String year = date2[0];
		String month = date2[1];
		String day = date2[2];
		
		//String year = "2025";
		//String month = "12";
		//String day = "25";
		
		int year1 = Integer.parseInt(year);	//형변환 (String -> Integer)
		int month1 = Integer.parseInt(month);	//형변환 (String -> Integer)
		int day1 = Integer.parseInt(day);	//형변환 (String -> Integer)
		
		//cal.set(year, (month-1), day);
		
		//int year = 2025;
		//int month = 12;
		//int day = 25;
		//cal.set(year, (month-1), day);
		
		//시점을 2025년 12월 25일로 세팅함
		//cal.set(2025, 11, 31);	//month : 0 ~ 11
		
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);	//0 ~ 11
		int dd = cal.get(Calendar.DATE);
		
		System.out.println( yy + "-" + ( mm + 1 ) + "-" + dd );	
		
		
		//요일 ( 1 : 일, 2 : 월 ~ 7 : 토 )
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String str = "";
		switch(dayOfWeek) {
		case 1 : str = "일요일";
		break;
		case 2 : str = "월요일";
		break;
		case 3 : str = "화요일";
		break;
		case 4 : str = "수요일";
		break;
		case 5 : str = "목요일";
		break;
		case 6 : str = "금요일";
		break;
		case 7 : str = "토요일";
		break;
		}

		System.out.println( str );	

		System.out.println( "올해의 몇번째 날 : " + cal.get(Calendar.DAY_OF_YEAR) );
		System.out.println( "올해의 몇번째 주 : " + cal.get(Calendar.WEEK_OF_YEAR) );
		System.out.println( "아달의 몇번째 주 : " + cal.get(Calendar.WEEK_OF_MONTH) );
		System.out.println( "이번달의 마지막 날 : " + cal.getActualMaximum(Calendar.DATE) );
	}

}
