package arrayMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("영어",50);
		map.put("국어",40);
		map.put("수학",70);
		
		Iterator<String> keys = map.keySet().iterator();
		
		int sum = 0;
		double avg = 0;
		String str = "";
		while( keys.hasNext() ) {
			String key = keys.next();
			int score = map.get(key);
			if( score < 60 ) str += key+",";
			sum += score;
		}
		//avg = sum/map.size();      // 예) 53.7 -> 53 -> 53.0
		avg = (double)sum/map.size();// 예) 53.7 -> 53.7
		// 53.333333333333336
		String avg2 = Double.toString(avg);
		int dotIndex = avg2.indexOf("."); // 2
		avg2 = avg2.substring(0,dotIndex+3);
		
		//String avg2 = avg+"";

		// 국어,영어,
		if( !str.equals("") ) {
			str = str.substring(0,str.length()-1); // 0 ~ 4
		} else {
			str = "없음";
		}
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg2);
		System.out.println("과락:"+str);
	}

}