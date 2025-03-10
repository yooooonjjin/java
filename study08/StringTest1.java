package study08;

public class StringTest1 {

	public static void main(String[] args) {

		String subject1 = "spring boot";
		int year = 2024;
		
		// length() 메소드
		System.out.println( subject1.length() );
		//System.out.println( year.length() ); error
		System.out.println( "javascript".length() );
		
		// replace(old,new) 메소드 => 취환(change)메소드
		String subject2 = subject1.replace("spring","summer");
		System.out.println( subject2 ); // summer boot
		System.out.println( subject2.replace("boot","boat") ); // summer boat
		
		// trim() 메소드 => 앞뒤 공백제거
		String address = " 서울시 강남구 갑을빌딩 101호      ";
		System.out.println( address );
		System.out.println( address.length() );
		
		address = address.trim();
		System.out.println( address );
		System.out.println( address.length() );
		
		// substring(시작번호,끝번호) 메소드 => 범위설정하여 자르는 메소드
		// 예) substring(3,7) :: 해당문자열에서 3번~6번까지 설정하여 자른다.
		
		address = "서울시 강남구 갑을빌딩 101호"; // 인덱스번호(자리번호)
		System.out.println( address.substring(0,3)  ); // 서울시
		System.out.println( address.substring(4,7)  ); // 강남구
		System.out.println( address.substring(8,12) ); // 갑을빌딩
		System.out.println( address.substring(13,17) );// 101호
		System.out.println( address.substring(4,17) ); // 강남구 갑을빌딩 101호
		System.out.println( address.substring(4) );    // 강남구 갑을빌딩 101호
		//System.out.println( address.substring(4,20) );  // over된 번호 세팅 불가
		//System.out.println( address.substring(-1,10) ); // 음수 세팅 불가

		// charAt(index) 메소드 => 세팅 인덱스번호의 데이터 값(한개)을 가져옴
		System.out.println( address.charAt(4) ); // 강
		System.out.println( address.charAt(9) ); // 을
		//System.out.println( address.charAt(4,7) );  // (오류) 한자리만 가능
		
		// indexOf("강남") 메소드 => 문자열에서 특정 단어 찾기 (자리번호 얻어줌)
		System.out.println( address.indexOf("강남") );    // 4
		System.out.println( address.indexOf("갑을빌딩") ); // 8
		System.out.println( address.indexOf("서울시") );   // 0
		System.out.println( address.indexOf("홍길동") );   // -1 (못찾았음)
		System.out.println( address.indexOf("자바") );    // -1 (못찾았음)

		// contains("강남") 메소드 => true , false
		System.out.println( address.contains("강남") );   // true
		System.out.println( address.contains("홍길동") ); // false
		
		// startsWith("서울시") / endsWith("107호") => true,false
		System.out.println( address.startsWith("서울") );    // true
		System.out.println( address.startsWith("서울시") ); 	// true
		System.out.println( address.startsWith("부산") );    // false
		System.out.println( address.endsWith("107호") ); 	// false
		System.out.println( address.endsWith("101호") ); 	// true
		
		// split(구분자) => 문자열을 특정 구분자에 의해 나누는 메소드
		// 배열 형식의 결과로 분리
		String subjects = "html,css,java";
		String[] ss = subjects.split(","); //{"html","css","java"};
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		System.out.println(ss[2]);
		
		System.out.println(subjects.substring(0,4));
		System.out.println(subjects.substring(5,8));
		System.out.println(subjects.substring(9,13));
		
		address = "서울시 강남구 갑을빌딩 101호";
		String[] addr = address.split(" ");
		for( int i=0; i<addr.length; i++ ) {
			System.out.println(addr[i]);
		}
		
		// toUpperCase() => 소문자 -> 대문자
		// toLowerCase() => 대문자 -> 소문자
		
		String title = "JavaScript";
		System.out.println( title.toUpperCase() );
		System.out.println( title.toLowerCase() );

		// equals() => 문자열 비교(같음) 메소드
		if( title.equals("javascript") ) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		// 추가1
		if( title.toLowerCase().equals("javascript") ) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		// 추가2
		if( title.toLowerCase().equals("javaSCript".toLowerCase()) ) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}

	}

}



