package study10;

public class Test1 {

	public static void main(String[] args) {

		double a1 = 1.12345;
		//1.12
		//1.123
		// (1) 문자타입 전환 후 문자열 메소드를 이용하여 세팅 가능
		//String s1 = a1 + "";				//1.123456 -> 야매
		String s1 = Double.toString(a1);	//더블 타입을 스트링으로 변경하겠다
		System.out.println( s1 );
		System.out.println( s1.substring(0,4) );
		
		double a2 = Double.parseDouble(s1.substring(0,4));
		System.out.println( a2 );
		
		System.out.println();
		
		double result = myPow(a1,3);
		System.out.println( result );

		
	}
	public static double myPow(double dd, int nn) {

		//소수점 아래 2자리까지 표현 //1.12
		int p = (int)Math.pow(10, nn); //10*10
		double ret1 = dd*p;	//112.3456 -> 112/100 -> 1.12
		double ret2 = (int)ret1/(double)p;
		
		//Math.pow(10, 1);	//10
		//Math.pow(10, 2);	//10*10
		//Math.pow(10, 3);	//10*10*10
		
		return ret2;
		
	}

}
