package study02;

/**
 *  3강 실습 예제
 */
public class Test6 {

	public static void main(String[] args) {
		
		//실습 1 : 온도를 의미하는 변수 값이 0보다 작으면 영하, 아니면 영상
		int temp = 0;
		//String result1 = (temp >= 0)?"영상":"영하";
		//System.out.println( "현재 기온은 " + result1 +" "+ temp + "도 입니다." );
		
		String result2 = (temp > 0)?"영상":(temp < 0)?"영하":"";
		System.out.println( "현재 기온은 " + result2 +" "+ temp + "도 입니다." );
		
		//실습 2 : 성별을 의미하는 변수 값이 1이면 남성 2이면 여성을 출력
		int gender = 3; //1: 남성, 2: 여성
		
		//String result3 = (gender == 1)?"남성":"여성";
		//System.out.println( "입력된 숫자는 " + gender +"로 "+ result3 + "입니다." );
		
		String result4 = (gender == 1)?"남성":(gender ==2)?"여성":"잘못된 번호";
		System.out.println( "입력된 숫자는 " + gender +"로 "+ result4 + "입니다." );
		
		//실습 3 : 변수 값을 이용하여 짝수, 홀수를 구별 - 2로 나누어서 나머지 값이 0이면 짝수, 1이면 홀수
		int number = 1;
		
		String result5 = (number % 2 == 0)?"짝수":"홀수";
        System.out.println("입력된 숫자는 " + number + "로 " + result5 + "입니다.");
		
        

	}

}
