package study11;

class Score {
	int kor;	//멤버 변수, 인스턴스 변수
	int eng;
	int hap;
	int avg;
	
	public void setKor(int kor) {	//매개변수
		this.kor = kor;
	}
	
	public void setEng(int eng) {	//매개변수
		this.eng = eng;
	}
	public void setHap() {
		hap = eng + kor;
		//this.hap = this.eng + this.kor; //this 생략 가능
	}
	public void setAvg() {
		this.avg = hap/2;
	}
}

public class VariableExam {

	public static void main(String[] args) {
		
		Score score = new Score();
		score.setKor(100);
		score.setEng(90);
		score.setHap();
		score.setAvg();
		
		System.out.println( "합계 : " + score.hap );
		System.out.println( "평균 : " + score.avg );
		
		

		//score.kor = 100;
		//score.eng = 90;
		//int avg = (score.kor + score.eng)/2;
		
		//System.out.println( "국어 : " + score.kor + ", 영어 : " + score.eng + ", 평균 : " + avg );
		
	}
}
