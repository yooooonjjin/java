package study14;

//interface 키워드 :: 명세처리 메소드 세팅
//public abstract Cookie
public interface Cookie {

	//인스턴스 변수이지만, 인터페이스 파일에서는 모두 공유(static)변수 처리됨
	int a = 100;		//멤버변수, 인스턴스변수
	static int b = 90;	//멤버변수, 클래스변수(공유메모리)

	// abstract void makeCookie();
	public void makeCookie();

	// abstract void makeSalad();
	public void makeSalad();

	// 완성형의 메소드 세팅 불가
	//public void abc() {
	//	System.out.println("aaaa");
	//}

}
