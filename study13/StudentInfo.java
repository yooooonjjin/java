package study13;

class StudentVO {
	private String name;
	private int year;
	private int eng;
	private int kor;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
}

public class StudentInfo extends StudentVO {
 
	public int sum() {
		return getEng() + getKor();
	}
	
	public int avg() {
		return sum()/2;
	}
	
	public void input(String name, int year, int eng, int kor) {
		setName(name);
		setYear(year);
		setEng(eng);
		setKor(kor);
	}
	public void output() {
		System.out.println("이름 : " + getName());
		System.out.println("학년 : " + getYear());
		System.out.println("총합 : " + sum());
		System.out.println("평균 : " + avg());
	}
	
	
	public static void main(String[] args) {

		StudentInfo info1 = new StudentInfo();
		StudentInfo info2 = new StudentInfo();
		
		info1.input("김철수", 1, 90, 80);
		info2.input("추신수", 1, 80, 88);
		
		info1.output();
		
		System.out.println();
		
		info2.output();
		
		//StudentInfo info = new StudentInfo();
		
		//info.setName("김철수");
		//info.setYear(1);
		//info.setEng(90);
		//info.setKor(80);
		
		//System.out.println("이름 : " + info.getName());
		//System.out.println("학년 : " + info.getYear());
		//System.out.println("총합 : " + info.sum());
		//System.out.println("평균 : " + info.avg());
		
		
		
	}

}
