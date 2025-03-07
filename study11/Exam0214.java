package study11;

public class Exam0214 {

	public static void main(String[] args) {

		method1();
		
		System.out.println();
		
		double ret1 = method2(30,50);
		System.out.println(ret1);
		
		System.out.println();
		
		String jumin = "240902-3623684";
		method3(jumin);

		System.out.println();
		
		System.out.println( "나이 : " + method4(jumin) );
		
		System.out.println();
		
		boolean bn = method5(jumin);
		if( bn == true  ) {
			System.out.println("올바른 주민번호 입니다.");
		} else {
			System.out.println("날짜가 잘못된 주민번호 입니다.");
		}
		
		System.out.println();
		
		String str = "01022227777, 12346789, 01012356, 01056427896";
		String result = method6(str);
		if( result.equals("")) {
			System.out.println( "모두 정상 데이터 입니다." );
		} else {
			System.out.println( "잘못된 핸드폰번호 : " + result );
		}
		
		
	}
	
	
	//1번
	public static void method1() {
		//0 ~ 9까지 출력
		int a = 0;
		while( a <10 ) {	//a<=9
			System.out.print(a + " ");
			a++;
		}
	}
	
	//2번
	public static double method2(int a, int b) {
		int hap = a +b;
		double avg = (double)hap/2; //32.121212
		
		return avg;
	}
	
	
	//3번
	//회원가입 화면 -> 저장 -> DB에 저장
	public static void method3(String jumin) {
		
		//-를 기준으로 앞,뒤로 나눔
		String[] array = jumin.split("-");
		//String[] array = {"890503" , "1234567"};
		
		String s1 = "정상";
		String s2 = "정상";
		String s3 = "정상";
		
		if( array[0].length() !=6) {
			s1 = "비정상";
		}
		if( array[1].length() !=7) {
			s2 = "비정상";
		}
		//1 ~ 4 :: "1234567"
		String gender = array[1].substring(0, 1); //1개의 글자
		if(  Integer.parseInt(gender)  < 1 ||
			 Integer.parseInt(gender) > 4 ) {	
			s3 = "비정상";
		}
		
		System.out.println( "1. 앞번호 " + s1 );
		System.out.println( "2. 뒷번호 " + s2 );
		System.out.println( "3. 성별부 " + s3 );

	}
	
	
	//4번
	public static int method4(String jumin) {
		
		String str1 = jumin.substring(0,2);		//0~1 ex)88
		String gender = jumin.substring(7,8);	//1개

		String str2 = "";
		if( gender.equals("1") || gender.equals("2") ) {
			str2 = "19" + str1;	
		} else if( gender.equals("3") || gender.equals("4") ) {
			str2 = "20" + str1;	
		} 
		
		int year = Integer.parseInt(str2);
		
		int age = 2025 - year;
		return age;
		//return age;
		//리턴 값 : 나이	
	}
	
	
	
	//5번
	public static boolean method5(String jumin) {
		//921225 - 1,2 
		//001225 - 3,4
		//1 ~ 12 - month
		//1 ~ 31 - day
		//true or false

		String[] str = jumin.split("-");
		//String[] str = {"921225", "1012345"};
		
		String yy1 = str [0].substring(0,2); //92
		String mm1 = str [0].substring(2,4); //12
		String dd1 = str [0].substring(4,6); //25
		
		//String를 int로 변환
		int mm2 = Integer.parseInt(mm1);
		int dd2 = Integer.parseInt(dd1);
		
		
		boolean bn = true;
		
		if( mm2 < 0 || mm2 > 12 ) {
			bn = false; //재정의
		} else if ( dd2 < 1 || dd2 > 31 ) {
			bn = false;
		}

		return true;
	}
	
	
	
	//6번
	public static String method6(String datas) {
		//01022227777, 12346789, 01012356, 01056427896
		
		String[] str = datas.split(",");
		//String[] str = { "01022227777, 12346789, 01012356, 01056427896" };
		
		String ss = "";
		for( int i=0; i<str.length; i++ ) {
			if( str[i].length() != 11 ) {
				ss += str[i]+",";
			} else if( str[i].startsWith("010") == false ) { //010으로 시작하지 않았더라면
				ss += str[i]+",";
			}
		}
		
		//1234678901,01012356, => 마지막 값을 버리는 설정
		if( !ss.equals("") ) {
			//ss = ss.substring(0,7);
			ss = ss.substring(0, ss.length()-1); //0 ~ 6
		}
		
		return ss;
	}
	

}
