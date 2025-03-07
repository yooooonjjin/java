package arrayMap;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayMapTest1 {

	public static List setCalendarInfo(String year) {
		
		Calendar cal = Calendar.getInstance();
		
		List<Map> list = new ArrayList<Map>();
		
		for( int m=1; m<=12; m++ ) {
			
			cal.set(Integer.parseInt(year),m-1, 1);	// 년, 월, 일
			
			Map<String,String> map = new HashMap<String,String>();	
			// 년월, 마지막일, 첫번째날의 요일
			map.put("yearMonth",year+ ((m<10)?"0"+m:m));	
			map.put("lastDay"  , cal.getActualMaximum(Calendar.DATE)+"");	// 매달 마지막 날짜
			map.put("dayOfWeek", cal.get(Calendar.DAY_OF_WEEK)+"");			// 매달 1일의 첫번째 요일
			list.add(map);
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		
		/*
		List<Map> list = new ArrayList<Map>();
		Map<String,String> map = new HashMap<String,String>();	
		// 년월, 마지막일, 첫번째날의 요일
		map.put("yearMonth", "202501");
		map.put("lastDay", "31");
		map.put("dayOfWeek", "4");
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("yearMonth", "202502");
		map.put("lastDay", "28");
		map.put("dayOfWeek", "7");
		list.add(map);
		
		map = new HashMap<String,String>();
		map.put("yearMonth", "202503");
		map.put("lastDay", "31");
		map.put("dayOfWeek", "7");
		list.add(map);
		 */

		//for( int i=0; i<list.size(); i++) {
		//	System.out.println( list.get(i) );
		//}
		
		// 기본출력
		// dayOfWeek : 4
		// yearMonth : 202501
		// lastDay	 : 31
	
		List<Map> list = setCalendarInfo("2025");
			
		for( int i=0; i<list.size(); i++ ) {
			
			Iterator<String> keys = list.get(i).keySet().iterator();
			while( keys.hasNext() ) {
				String key = keys.next();
				System.out.println( key + " : " + list.get(i).get(key) );
			}
			System.out.println();
		}

	}

}
