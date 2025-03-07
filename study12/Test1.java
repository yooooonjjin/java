package study12;

public class Test1 {

	int a;
	int b;
	
	/*
	 * 오버로딩 된 생성자가 없는 경우 생략 가능
	 */
	Test1(){}
	//Test1(){System.out.println();}
	Test1(int a) {	//생성자 오버로딩
		this.a = a;
	}
	
	//Test1(int b) {  } //error 오류 (타입이 같은 매개 변수를 소유의 생성자 생성 불가)
	
	public static void main(String[] args) {

		Test1 test1 = new Test1();
		Test1 test2 = new Test1(200);
		//Test1 test3 = new Test1("200"); //error 오류 (없는 생성자로 인해 오류)	
	}

}
