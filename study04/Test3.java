package study04;

public class Test3 {

	public static void main(String[] args) {
		
		//논리연산자
		//예제 1
		int time1 = 11; //현재시간 오전 11시
		int time2 = 12; //점심식사 시간 12시

		if ( time1 != time2 ) {
			System.out.println("지금 시간은 점심 시간이 아닙니다.");
		} else {
			System.out.println("점심시간 입니다. 지금부터 50분까지 입니다.");
		}

		System.out.println();

		//AND 연산자 (&&)
		//예제 2
		int kor = 70;
		int eng = 40;
		String txt = "";

		//두개의 조건 모두가 충족되어야만 합격, 둘 다 충족되지 않거나, 둘중에 하나만 충족된다면 불합
		if ( kor >= 60 && eng >= 60 ) {
			txt = "합격";
		} else {
			txt = "불합격";
		}
		System.out.println( txt + "입니다. " + "{국어점수 " + kor + "점, 영어점수 "+ eng +"점}" );

		System.out.println();

		//OR 연산자 (||)
		//두 과목 하나라도 60점 이상이면 합격
		if ( kor >= 60 || eng >= 60 ) {
			txt = "합격";
		} else {
			txt = "불합격";
		}
		System.out.println( txt + "입니다. " + "{국어점수 " + kor + "점, 영어점수 "+ eng +"점}" );

		System.out.println();

		//예제 3
		
		
		

	}

}
