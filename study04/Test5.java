package study04;

public class Test5 {

	public static void main(String[] args) {
		
		//OR 연산자 (||)
		int score = 150;
		String str = "";
		
		//오류를 조건으로, 0 미만 이거나 100을 초과한 경우
		if (score < 0 || score > 100 ) {
			str = "오류!! 0~100의 값이 아닙니다.";
		} else {
			str = "정상 입력입니다.";
		}
		System.out.println(str);
		
		System.out.println();
		
		//정상 입력을 조건으로, 0 이상이고 100 이하
		if (score >= 0 && score <= 100 ) {
			str = "정상 입력입니다.";
		} else {
			str = "오류!! 0~100의 값이 아닙니다.";
		}
		System.out.println(str);
		
		System.out.println();
		
		//잘못된 세팅
		//(1) 88 ->정상 입력
		//(2) 150 -> 정상 입력
		if (score >= 0 || score <= 100 ) {
			str = "정상 입력입니다.";
		} else {
			str = "오류!! 0~100의 값이 아닙니다.";
		}
		System.out.println(str);
		
		
		
		
		
		
		
		
	}

}
