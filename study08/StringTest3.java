package study08;

public class StringTest3 {

	public static void main(String[] args) {
		
		String addr = "경기 구리시 건원대로 44 태영빌딩 305~307호 (우)11921";
		// (1) length
		System.out.println("주소는 "+addr.length()+"자로 되어 있습니다.");
		
		// (2) 태영빌딩이라는 단어만 출력 -> substring 
		int index = addr.indexOf("태영빌딩");
		System.out.println( addr.substring(index,index+4) );
		
		// (3) 구리시 라는 단어 찾아 출력한다.
		index = addr.indexOf("구리시");
		System.out.println("구리시라는 단어는 인덱스번호로 "+index+"번에 있습니다.");
		
		// (4) 우편번호와 주소를 분리하여 출력한다. 
		String zipcode = addr.substring(32);
		String address = addr.substring(0,28);

		// 역슬레쉬 :: 뒤에오는 특수문자를 의미없는 일반문자로 처리하는 역할
		String[] array = addr.split("\\(우\\)");
		//String[] array = {"경기 구리시 ~~~ 305~307호 ","11921"};
		
		System.out.println("우편번호 : " + array[1] );
		System.out.println("주소 : " + array[0] );
		
		// (5) 주소의 모든 공백제거
		String addr2 = addr.replace(" ","");
		System.out.println(addr2);
		
	}

}




