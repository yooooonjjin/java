package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in); 
		Calendar cal = Calendar.getInstance();
		
		System.out.println( "날짜 (예:2025-02-15) : ");
		String str = scn.next();
		
		String[] arr = str.split("-");
		int yy = Integer.parseInt(arr[0]);
		int mm = Integer.parseInt(arr[1]);
		int dd = Integer.parseInt(arr[2]);
		cal.set(yy, (mm-1), dd);

		
		Date date = cal.getTime();
		//Date date = new Date();
		System.out.println( date );
		
		
		//String pattern = "y-M-d(E요일) h:m:s";
		//String pattern = "올해의 몇번째 날인가 : D";
		String pattern = "G yy/MM/dd (a)hh:mm:ss";	//AD 25/02/20 (오후)04:26:49
				
		SimpleDateFormat simple = new SimpleDateFormat(pattern);
		System.out.println( simple.format(date) );
	}

}
