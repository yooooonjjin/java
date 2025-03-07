package study07;

public class MethodTest2 {

	public static void main(String[] args) {

		// 메소드 호출
		programBooks();
		
		System.out.println();
		
		databaseBooks();
	}

	public static void programBooks() {
		System.out.println("1.자바의 첫걸음 - 30000");
		System.out.println("2.스크립트의 이해 - 35000");
	}

	public static void databaseBooks() {
		System.out.println("1.오라클 그대로 따라하기 - 35000");
		System.out.println("2.스키마란 무엇인가 - 30000");
	}
	
}