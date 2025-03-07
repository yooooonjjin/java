package study10;

public class Student1 {

	public static void main(String[] args) {

		int math = 0;
		//참조클래스   참조변수 = 객체 처리
		StudentInfo info1 = new StudentInfo();
		info1.name = "홍길동";
		info1.eng = 50;
		info1.kor = 80;
		//math = 100;
		
		System.out.println( "이름 : " + info1.name);
		System.out.println( "영어 : " + info1.eng);
		System.out.println( "국어 : " + info1.kor);
		//System.out.println( "수학 : " + math );
		
		System.out.println();
				
		StudentInfo info2 = new StudentInfo();
		info2.name = "김철수";
		info2.eng = 70;
		info2.kor = 100;
		//math = 60;
		
		System.out.println( "이름 : " + info2.name);
		System.out.println( "영어 : " + info2.eng);
		System.out.println( "국어 : " + info2.kor);
		//System.out.println( "수학 : " + math );
		
		System.out.println();
		
		//홍길동 합계
		//int hong_sum = info1.eng + info1.kor;
		//System.out.println( info1.name + " 총점 : " + hong_sum );
		System.out.println( info1.name + " 총점 : " + info1.hap() );
		System.out.println( info1.name + " 평균 : " + info1.avg() );
		
		System.out.println();
		
		//int kim_sum = info2.eng + info2.kor;
		//System.out.println( info2.name + " 총점 : " + kim_sum );
		System.out.println( info2.name + " 총점 : " + info2.hap() );
		System.out.println( info2.name + " 평균 : " + info2.avg() );
		
		
		
	}

}
