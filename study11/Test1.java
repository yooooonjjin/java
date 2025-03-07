package study11;

public class Test1 {

	int a = 10;		//멤버 변수, 인스턴스 변수
	int b = 20;
	String c = "";
	
	int hap() {
		return a+b;
	}
	void setA(int z) {
		if( z > 100 || z < 0) {
			a = 0;
		} else {
			a = z;
		}
	}
	
	public static void main(String[] args) {
		
		int a = 10; //지역(local) 변수
//	 참조클래스 참조변수 = new(키워드) 생성자;
		Test1 hong = new Test1();	//인스턴스 처리
		Test1 kim  = new Test1();	//인스턴스 처리
		
		//참조클래스에서 a라는 변수의 존재유무 확인 후 주요 메모리에 있는 변수에 접근함
		hong.a = 70;
		hong.b = 90;
		
		kim.a = 30;
		kim.b = 40;
		
		System.out.println( "홍의 합계 : " + hong.hap() );
		System.out.println( "김의 합계 : " + kim.hap() );
		
		
		
	}

}
