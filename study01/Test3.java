package study01;

public class Test3 {

	public static void main(String[] args) {
		
		String welcome = "안녕하세요?";
		String message = "변수란 무엇인가?";
		String answer = "변수란 변할 수 있는 값을 가진 메모리 공간의 이름입니다.";
		//System.out.println(welcome);
		//System.out.println("welcome"); //변수기능상실 (일반 문자 취급)
		System.out.println(welcome);
		System.out.println(message);
		System.out.println(answer);

		System.out.println();
		
		int kor = 80;
		int eng = 100;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println("-----");
		
		//초기변수 세팅은 변수 타입의 무조건 설정
		String mycolor = "blue";
		System.out.println(mycolor);
		
		//변수값의 재설정 (타입설정 불가)
		mycolor = "red";
		System.out.println(mycolor);
		
		//변수값의 재설정 (타입설정 불가)
		mycolor = "yellow";
		System.out.println(mycolor);
		
		//문법오류 :: 변수타입의 중복설정 (선언)
		//string mycolor = "green";
		
		
		//풀어보기
		
		//1번
		
		//예약어 사용 금지 (class, public 등)
		//String class = "abc"; 예약어 오류
		//String public = "abc"; 예약어 오류
		
		//쌍따옴표 처리
		//String name = '홍길동'; 문자열의 홑따옴표 처리 불가
		
		//문자열은 반드세 쌍따옴표 처리
		//String eng1 =100; 
		
		//정상
		//int eng1 =100; 
		//String eng1 ="100";

		String book ="자바의 첫걸음";
		
		
		
		//2번
		
		//숫자 타입은 쌍따옴표 불가
		//int age = "55";
		
		//정상
		int weight = 300;
		
		//예약어 사용 금지 (class, public 등)
		//int public = 80; 예약어 오류
		
		//특수문자 오류
		//int #number = 77;
	
		//정상
		int number = 77;
		
		//오류
		//int 7number = 77; 변수 이름의 첫글자는 무조건 영문
		
		//정상
		int num7ber = 77;
		
		//정상
		int number_7 = 77;
		
		
		
		// 3번
		
		//정상
		String lotte_tower_height = "555m";
		
		//정상
		int namsan = 470;
		
		//특수문자 오류
		//int namsan#height = 480;
		
		//상단에 이미 변수명 중복
		//int namsan = 480;
		
		//정상
		namsan = 480;
		
		//변수 이름의 첫글자는 무조건 영문
		//String _name = "감자탕";
		
		//정상
		String name_ = "감자탕";
		
		//변수 이름의 첫글자는 무조건 영문
		//String 44size = "희망사항";
		
		//정상
		String lucky7 = "행운";
		
		//변수명은 한글도 가능은 하지만 실제로는 사용하지 않음
		System.out.println();
		String 하이미디어 = "Hi";
		System.out.println(하이미디어);
		
	}

	
}
