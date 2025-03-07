package arrayMap;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		// nano 시간
		System.out.println( System.nanoTime() );
		// unix 시간	(1970.1.1 0:0:0 -> 1/1000)
		System.out.println( System.currentTimeMillis() );	

		
		System.out.println();
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long nano1 = System.nanoTime();
		long unix1 = System.currentTimeMillis();
		for( int i=0; i<10000; i++ ) {
			list1.add( i + "" );
		}
		long nano2 = System.nanoTime();
		long unix2 = System.currentTimeMillis();
		
		System.out.println( nano2 - nano1 );
		System.out.println( unix2 - unix1 );
		
		System.out.println();
		
		nano1 = System.nanoTime();
		unix1 = System.currentTimeMillis();
		for( int i=0; i<10000; i++ ) {
			list2.add( i + "" );
		}
		nano2 = System.nanoTime();
		unix2 = System.currentTimeMillis();
		
		System.out.println( nano2 - nano1 );
		System.out.println( unix2 - unix1 );
		
		
		
		
		
		
		//list1.add("11");
		//list1.add("22");
		//System.out.println( list1.get(0) );	//11
		//System.out.println( list1.get(1) );	//22
		//for( int i=0; i<list1.size(); i++ ) {
		//	System.out.println( list1.get(i) );
		//}
		
		System.out.println();
		
		//list2.add("101");
		//list2.add("102");
		//System.out.println( list2.get(0) );	//101
		//System.out.println( list2.get(1) );	//102
		//for( int i=0; i<list2.size(); i++ ) {
		//	System.out.println( list2.get(i) );
		//}
		
		
		
		
	}

}
