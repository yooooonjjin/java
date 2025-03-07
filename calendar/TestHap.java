package calendar;

abstract class Test101 {			//추상클래스
	public abstract void hap();	//명세처리
}

//interface Test2 {				//인터페이스(파일)
//	public void hap();			//명세처리
//}

class MyHap extends Test101 {
	
	MyHap() {}
	
	int a = 10;					//멤버변수, 인스턴스(객체)변수
	final int b = 20;			//멤버변수, 인스턴스(객체)변수, 종단(상수)변수
	static int c = 30;			//멤버변수, 클래스(전역,고유)변수
	static final int d = 100;	//멤버변수, 쿨래스(전역,고유)변수, 종단(상수)변수
	
	@Override	//어노테이션 : 시스템 주석
	public void hap() {
		System.out.println( a + b );
	}
}

//class MyHap2 implements Test2 {
//	
//	@Override
//	public void hap() {
//		System.out.println( 1000 + 200 );
//	}
//	
//	public void hap(int a, int b, int c) {
//		System.out.println( a + b + c  );
//	}
//}

public class TestHap {

	public static void main(String[] args) {
		
  //참조클래스 참조변수 = new 생성자;
		MyHap my1 = new MyHap();	//인스턴스(객체)화
		
		my1.a = 90;
		//my1.b = 80;		//상수변수, error
		MyHap.c = 5000;		//클래스변수 (클래스명으로 접근)
		//MyHap.d = 1000;	//상수변수, error
		
		
		System.out.println();
	}

}
