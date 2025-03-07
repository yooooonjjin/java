package ioservice;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		// Map :: 임시 저장소
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("title", "첫글입니다.");	// ( key, value )
		map.put("pass", "121212");
		map.put("writer", "나그네");
		
		System.out.println( map.get("eng") );	// 100
		System.out.println( map.get("kor") );	// 90
		System.out.println( map.get("math") );	// 92
		
	}

}
