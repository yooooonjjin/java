package study07;

public class MethodTest4 {

	public static void main(String[] args) {
		
		String name = memberName();
		String gender = memberGender();
		String year = memberYear();
		
		String str = "";
		if( gender.equals("M") ) {
			str = "남자";
		} else if ( gender.equals("W") ) {
			str = "여자";
		} else {
			str = "잘못된 성별";
		}
		
		// 형변환 String -> integer
		int age = 2025 - Integer.parseInt(year);
		
		System.out.println( "이름 : " + name );
		System.out.println( "성별 : " + str );
		System.out.println( "년도 : " + year   );
		System.out.println( "나이 : " + age   );
		
		
	}
	
	public static String memberName() {
		return "이윤진";
	}
	
	public static String memberGender() {
		return "W";
	}
	
	public static String memberYear() {
		return "2000";
	}
	
}
