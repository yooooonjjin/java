package study10;

public class StudentInfo {

	int eng = 0; 	//인스턴스(객체) 변수
	int kor = 0;
	String name = "";

	//static 생략됨
	public int hap() {
		return eng + kor;
	}
	
	public int avg() {
		return hap()/2;
	}

	
}