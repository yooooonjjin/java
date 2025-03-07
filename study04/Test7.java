package study04;

public class Test7 {

	public static void main(String[] args) {
		
		int kor = 100; 
		String name = "김철수";
		// A : 90점대 B : 80점대 C : 70점대 D : 60점대 그 미만은 F, 0~100 외의 숫자를 입력하면 잘못된 점수라고 뜨도록
		String str = "";
		
		if ( kor <= 100 && kor >= 90 ) {
			str = "A 학점";
		} else if ( kor < 90 && kor >= 80 ) {
			str = "B 학점";
		} else if ( kor < 80 && kor >= 70 ) {
			str = "C 학점";
		} else if ( kor < 70 && kor >= 60 ) {
			str = "D 학점";
		} else if ( kor < 60 && kor >= 0 ) {
			str = "F 학점";
		} else {
			str = "잘못된 점수";
		}
		System.out.println( name + "의 점수는 " + kor + "점으로 " + str + "입니다." );
	}

}
