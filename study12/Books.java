package study12;

public class Books {
	
	String bookName = "JSP 기초";
	
	//기본형은 생략과 관계없이 존재하는 것으로 실행됨
	Books() {
		System.out.println("<< 한빛미디어 >>");
	}
	//생성자 오버로딩
	Books(String name) {
		this.bookName = name;
		System.out.println("<< 한빛미디어 >>" + name );
	}
	
	public static void main(String[] args) {
		
		Books jspBook = new Books();				//한빛미디어 출력
		System.out.println(jspBook.bookName);		//JSP 기초 출력
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Books javaBook = new Books("JAVA 마스터");	//한빛미디어 출력
		System.out.println(javaBook.bookName);		//JAVA 마스터 출력
		
	}

}
