package study07;

public class MethodTest8 {

	public static void main(String[] args) {

		
	}

	//남성 또는 여성이라는 값이 리턴
	public static String getGender(String gender) {
		String value;
		if( gender.equals("M") ) {
			value = "남성";
		} else if( gender.equals("F") ) {
			value = "여성";
		} else {
			value = "설정안됨";
		}
		
		return value;
		
	}
	
}
