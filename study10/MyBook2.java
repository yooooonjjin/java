package study10;

public class MyBook2 {

	public static void main(String[] args) {

		BookInfo book = new BookInfo();
		
		System.out.println( book.title );
		System.out.println( book.price );
		
		System.out.println();
		
		book.title = "html 교재";
		book.price = 15000;
		System.out.println( "제목 : " + book.title );
		System.out.println( "가격 : " + book.price );
	}

}
