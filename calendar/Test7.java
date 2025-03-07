package calendar;

public class Test7 {

	public static void main(String[] args) {

		MyCalendar mc = new MyCalendar();
		
		String [] dates = {"2025-01-01", "2025-01-05"};
		System.out.println( mc.dateDif2(dates[0], dates[1]) );
		
		System.out.println();
		
		long a1 = 123456789123L;
		long a2 = 100L;
		int a3 = (int) ((a1-a2)/1000);
		int a4 = (int) (a1-a2/1000);	//(int)(a1-0)
		//형변환을 우선 처리하고 나누기 처리를 행함
		int a5 = (int)(a1-a2/1000);
		//int a5 = (int) (123456789023L)/1000;
		
		System.out.println( a3 );	//정상
		System.out.println( a4 );	//비정상
		System.out.println( a5 );	//비정상
		
	}

}
