package myThread;

public class Lotto4 {

	public static void main(String[] args) {
		
		int[] a = new int[6];			// (개수) 번호 (0 ~ 5)
		System.out.println( a.length );	// 6
		System.out.println( a[0] );		// 0
		System.out.println( a[5] );		// 0
		//System.out.println( a[6] );	// error
		
		System.out.println();
		
		String[] b = new String[6];
		System.out.println( b.length );	// 6
		System.out.println( b[0] );		// null
		System.out.println( b[5] );		// null

		System.out.println();
		
		boolean[] c = new boolean[3];
		System.out.println( c.length );	// 3
		System.out.println( c[0] );		// false
		System.out.println( c[1] );		// false
		
	}

}
