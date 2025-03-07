package study10;

public class Test3 {

	int a = 10;			//멤버변수, 인스턴스(객체) 변수
	int b = 20;
	String c = "java";	
	
	public static void main(String[] args) {
		
		int i = 100;	//지역(local) 변수
		System.out.println(i);

		//new : 객체 처리하는 키워드
	//참조클래스 참조변수 = new 생성자();
		Test3 test3 = new Test3();	//인스턴스(객체) 처리
		
		System.out.println( test3.a );
		System.out.println( test3.b );
		System.out.println( test3.c );
		
		
	}

}
