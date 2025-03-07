package myThread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lotto6 {
	
	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int i = 0;
		while(true) {
			int num = (int)(Math.random()*45) + 1;
			// ex) map.put(33, 33);
			if( map.size()  < 6) {
				map.put(num, num);
			}
			if( map.size() == 6 ) break;
		}
		Iterator<Integer> keys =  map.keySet().iterator();		
		
		System.out.println( map );
		
	}
}
