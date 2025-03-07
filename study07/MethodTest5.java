package study07;

public class MethodTest5 {

	public static void main(String[] args) {
		message();
		System.out.println( "이름 : " + name() );
		System.out.println( "합계 : " + hap() );
		System.out.println( "평균 : " + avg() );
		
		//삼항연산자 -> pass가 true면 합격 false면 불합격
		System.out.println( "결과 : " + ((pass() == true)?"합격":"불합격") );
		
		
		
		
	}
	
	//void : 리턴 처리를 안한다고 선언한 키워드임
	public static void message() {
		System.out.println("=학생 점수 공개=");
		//return "";
	}
	
	//이름 반환
	public static String name() {
		return "홍길동";
		//return 100; -> int error
	}

	/*
	 * 정수타입
	 * byte(-128~127) < short(3만2천) < int(21억) < long
	 */

	//영어점수 반환
	public static int eng() {
		int eng = 98;
		return eng;
	}
	
	//수학점수 반환
	public static int math () {
		short math = 78;
		return math;
	}
	
	//국어점수 반환
	public static int kor() {
		byte kor = 96;
		return kor;
	}
	
	//전체 점수 합산
	public static int hap() {
		int hap = eng() + math() + kor();
		return hap;
	}
	
	//전체 점수 평균 - 실수타입(double)
	public static double avg() {
		int avg = hap()/3;
		return avg;
	}

	
	//합격 or 불합격
	public static boolean pass() {
		//60점 이상은 true / false
		//System.out.println( 100 > 60 );	//true
		boolean result = avg() >= 60;
		return result;
	}
	
	
	

}


