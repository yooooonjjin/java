package study14;

public class WelcomeTest2 extends WelcomeTest1  {

	public void welcome1() {
		System.out.println("안녕!");
	}
	
	public String welcome2() {
		
		return "안녕안녕!!";
	}
	public void welcome3(int aa, String bb) {
		System.out.println("안녕안녕안녕!!!");
	}
	
	public static void main(String[] args) {
		
		//추상클래스는 인스턴스 처리 불가능
		//WelcomeTest1 t1 = new WelcomeTest1();
		
		WelcomeTest2 t2 = new WelcomeTest2();
		t2.welcome1();
		t2.welcome5();
		
		System.out.println( t2.eng );
		System.out.println( t2.kor );
		
	}

}
