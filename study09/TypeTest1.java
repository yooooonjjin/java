package study09;

public class TypeTest1 {

	public static void main(String[] args) {

		int n1 = 10;
		n1 += 5;	//15
		n1 += 10;	//25
		n1 -= 5;	//20
		
		String s1 = "";
		//String s1 = "11 12 13 14 15";
		for(int i=11; i<16; i++) {
			s1 += i + " "; //연결
		}
		s1 = s1.trim();
		System.out.println( s1 );
		
		System.out.println();

		int a = 10;
		int b =7;
	
		//정수(나누기)정수 = 정수
		int c1 = a/b;
		double c2 = a/b; //결과값이 실수타입으로 변환 처리됨
		//실수(나누기)정수 = 실수
		double c3 = (double)a/b;	//정수 변수를 실수 변수로 형변환 후 계산
		
		System.out.println(c1);		//1
		System.out.println(c2); 	//1.0
		System.out.println(c3); 	//1.4285714285714286

		System.out.println();
		
		System.out.println( 67/3 ); //22
		System.out.println( (double) 67/3 ); //22.333333333333332
		
		
		//22.33
		//System.out.println( (double) 67/3 );
		//a ~ z
		char  alp = 'a'; //유니코드 (문자의 고유번호)
		String str = ""; //누적 될 수 있도록
		for(int i=0; i<26; i++) {
			System.out.print(alp + " ");
			str += alp;
			alp++;
		}
		System.out.println(str);
	}

}
