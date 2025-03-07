package lambda;

public class MyFunction1 {

	public static void a1() {
		//System.out.println("html");
	}
	
	public static void main(String[] args) {

		//MyFunction1.a1();	
		
		MyInterface1 f1 = () -> {
			System.out.println("java");
		};
		f1.method();	// 호출

		
		MyInterface2 f2 = () -> {
			System.out.println("react");
		};
		f2.method();	// 호출
		
		
		MyInterface3 f3 = (a,b) -> {
			System.out.println( a + "+" + b + "=" + (a+b) );
		};
		f3.method(90,80);	// 호출
		f3.method(100,200);	// 호출

		
		MyInterface4 f4 = (a,b) -> {
			return a+b;
		};
		int sum = f4.method(50, 80);
		System.out.println( "sum : " + sum );
		System.out.println( f4.method(20, 80) );

		
		MyUnixTime unixTime = () -> {
			return System.currentTimeMillis()/1000;
		};
		System.out.println( "현재 유닉스 시간 : " + unixTime.unixTime() + "초" );
		
		
	}
}
	