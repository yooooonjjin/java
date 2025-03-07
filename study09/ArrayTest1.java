package study09;

public class ArrayTest1 {

	public static void main(String[] args) {

		//풀어보기 1
		int age1 = 105;
		int age2 = 82;
		int age3 = 98;
		
		int maxAge = Math.max(age1,
					 Math.max(age2, age3)); 
		
		int minAge = Math.min(age1,
				 	 Math.min(age2, age3)); 
		
		System.out.println( "제일 많은 나이는 " + maxAge + "살이고 "
						+ "제일 적은 나이는 " + minAge + "세 입니다.");
		
		System.out.println();
		
		//풀어보기 2
		int[] a1 = { 50,80,-40,92,72,54,77 };
		
		/*
		 for(int i=0; i<6; i++) {
		 	System.out.println( a1[i] );
		 }
		 */
		
		int sum = 0;
		for(int i=0; i<6; i++) {
			sum += Math.abs(a1[i]);
			//System.out.println( Math.abs(a1[i]) );
		}
		double avg = (double)sum/a1.length;
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		//System.out.println( a1[0] );
		//System.out.println( a1[1] );
		//System.out.println( a1[5] );

		System.out.println();
		
		//풀어보기 3
		int max = 0;
		for(int i=0; i<a1.length; i++) {
			int number = Math.abs(a1[i]);
			max = Math.max(max, number);
			
			//.max(0, 50);
			//Math.max(50, 80);
			//Math.max(80, 40);
			//Math.max(80, 92);
			//Math.max(92, 72);
			//Math.max(92, 54);
			//Math.max(92, 77);
		}
		System.out.println("최대값 : " + max);
	
		//{50,80,-40,92,72,54,77}
		int min = 0;
		for(int i=0; i<a1.length; i++) {
			int number = Math.abs(a1[i]);
			if (i > 0) {
				min = Math.min(min,  number);
			} else if ( i == 0 ) {
				min = number;
			}
		}
		System.out.println("최소값 : " + min);
		
	}

}
