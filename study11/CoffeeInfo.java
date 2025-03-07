package study11;

public class CoffeeInfo {
	String name = "";			//멤버 변수, 인스턴스 변수 (고유 메모리)
	int price = 0;				//멤버 변수, 인스턴스 변수 (고유 메모리)
	static String maker = "";	//멤버 변수, 클래스 변수  (공유 메모리)
	
	public void setPrice(int pp) {
		if( pp < 100000 ) {
			price = pp;
		}
		
	}
	
	public static void setMaker(String mm) {
		maker = mm;
	}
	
	
}


