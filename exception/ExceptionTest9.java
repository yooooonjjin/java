package exception;

import java.util.Calendar;

/**
 * throws Exception
 * :: 예외 처리를 다른 메소드에게 전가 시키는 메소드
 * :: 일반 메소드의 뒤에 세팅읋 하며, 해당 메소드를 호출하는 곳에서는
 * 	  반드시 예외 처리를 하게 유도하는 키워드임
 */
public class ExceptionTest9 {
	
	/**
	 * 
	 * 
	 * 
	 */
	
	public static void unixTm(String pass) throws Exception {
		if(pass.equals("1234")) {
			Calendar cal = Calendar.getInstance();
			System.out.println( cal.getTimeInMillis() );
		} else {
			// 예외상황 발생
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		 try {
			 unixTm("123411"); 
 		 } catch(Exception e) {
 			System.out.println( "- 암호 설정 오류 -" );
 		 }
	}
}
