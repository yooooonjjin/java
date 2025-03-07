package study02;

/**
 * 삼항연산자 [학습]
 */
public class Test5 {

	public static void main(String[] args) {

		//형식 - (조건)?true:false
		// ? - 삼항연산자
		
		//예제 1 : 영어 점수가 60점 이상이면 합격, 미만이면 불합격
		int eng = 90;
		// 물음표를 기준으로 좌측부터 해석 
		System.out.println(eng>=60); //true
		System.out.println( (eng>=60)?"합격":"불합격" );	
		System.out.println( (eng>=60)?"잘했음":"노력을 요함" );
		
		System.out.println( (eng<60)?"불합격":"합격" );	
		
		System.out.println();
		
		//예제 2 : 만점 여부 (만점인지 아닌지)
		System.out.println(eng==100); //false
		System.out.println( (eng==100)?"만점입니다.":"만점이 아닙니다." );
		
		System.out.println(eng!=100); //true
		System.out.println( (eng!=100)?"만점이 아닙니다.":"만점입니다." );
		
		System.out.println();
		
		//예제 3 : 변수의 값(특정 숫자)이 5의 배수인지 아닌지 
		//		  5로 나눈 나머지 값이 0이면 5의 배수임
		int nm = 84;
		int result = nm%5;
		System.out.println( (result==0)?"5의 배수입니다.":"5의 베수가 아닙니다." );
		System.out.println( (result!=0)?"5의 배수가 아닙니다.":"5의 베수입니다." );
		
		//7의 배수 여부
		int result2 = nm%7;
		System.out.println( (result2==0)?"7의 배수입니다.":"7의 베수가 아닙니다." );
		System.out.println( (result2!=0)?"7의 배수가 아닙니다.":"7의 베수입니다." );
		
		//예제 4 : 노래 점수가 90점 이상이면 추가 10분, 그 미만이면 추가 5분
		int song = 70; //노래 점수 (변경되는 부분)
		int time = 30; //남은 시간
		int addTime = (song >= 90)?10:5; //노래 점수가 90점 이상이면 10분, 미만이면 5분
		time = time+addTime;
		
		
		System.out.println("노래 점수가 " + song + "점으로 " + addTime + "분이 연장 되었습니다.");
		System.out.println( "총 " + time + "분 남았습니다." );
		
		
	}

}