package calendar;

import java.util.Calendar;

public class CalTest2 {

	public static void main(String[] args) {
		
		String date = "2023/07/20";
		
		Calendar cal = Calendar.getInstance();
		
		String[] array = date.split("/");
		//String[] array = {"2023", "07", "20"};
		
		int yy = Integer.parseInt(array[0]);
		int mm = Integer.parseInt(array[1]);
		int dd = Integer.parseInt(array[2]);
		
		cal.set(yy, (mm-1), dd);
		
		//마지막 날짜
		//2023년 7월의 마지막 날짜는 31일 입니다.
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.println( yy + "년 " + mm + "월의 마지막 날짜는 " + lastday + "일 입니다." );

		//요일
		//2023년 7월 20일의 요일은 화요일입니다.
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

		System.out.println( yy + "년 " + mm + "월 " + dd + "일의 요일은 " + str + "입니다.");	
	}

}
