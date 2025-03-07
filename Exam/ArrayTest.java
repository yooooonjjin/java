package Exam;

public class ArrayTest {

	public static void main(String[] args) {
		
		String[] subjects = { "영어", "수학", "과학", "체육", "국어" };
		String[] scores = { "90", "88", "75", "55", "95" };
		
		for( int i=0; i<scores.length; i++ ) {
			
			String subj = subjects[i];
			int ss = Integer.parseInt(scores[i]);	// 형 변환
			String hakjum = "";
			
			if( ss >= 90 ) hakjum = "A";
			else if( ss >= 80 ) hakjum = "B";
			else if( ss >= 70 ) hakjum = "C";
			else if( ss >= 60 ) hakjum = "D";
			else hakjum = "F";
			
			System.out.print( "[" + subj + ":" + hakjum+ "]" );
		}
	}

}
