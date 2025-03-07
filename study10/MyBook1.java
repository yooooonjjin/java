package study10;

public class MyBook1 {

	public static void main(String[] args) {
		
		String message = "객체지향";
		
		BookInfo mk = new BookInfo();
		System.out.println( "제목 : " + mk.title );
		System.out.println( "가격 : " + mk.price );

		System.out.println();
		
		mk.price = 15000;
		mk.title = "자바교재";
		System.out.println( "제목 : " + mk.title );
		System.out.println( "가격 : " + mk.price );
	}

}
