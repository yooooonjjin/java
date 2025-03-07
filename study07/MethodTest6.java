package study07;

public class MethodTest6 {

	public static void main(String[] args) {
		
		int age = age();
		String str = method1();
		int year = method2();
		
		System.out.println( "회원님의 나이는 " + age + "세로 " + str + "이며, " + year + "년생입니다." ); 
		
	}

	
	public static int age() {
		return 26;
	}
	
	
	public static String method1() {
		String str = "";
		if( age() >= 20 ) {
			str = "성인";
		} else {
			str = "미성년자";
		}
		return ((age()>=20)?"성인":"미성년자");
	}

	//출생년도가 리턴이 되는 메소드 (method2)
	public static int method2() {
		int year = 2025 - age();
		return 2025-age();
	}
	
}

