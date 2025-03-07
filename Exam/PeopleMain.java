package Exam;

class PeopleInfo {
	
	PeopleInfo(String name) {
		System.out.println( name + "입니다." );
	}

	PeopleInfo(String name, int age) {
		System.out.println( name + "의 나이는 " + age + "세 입니다." );
	}

	PeopleInfo(int age, String gender, String addr) {
		gender = gender.equals("F")?"여성":"남성";
		System.out.println( age + "세의 " + gender  + "은 " + addr + "에 거주하고 있습니다." );
	}
	
}

public class PeopleMain {

	public static void main(String[] args) {
		
		new PeopleInfo("홍길동");
		new PeopleInfo("토마스", 25);
		new PeopleInfo(31, "F", "서울");
		
		//PeopleInfo s1 = new PeopleInfo("홍길동");
		//PeopleInfo s2 = new PeopleInfo("토마스", 25);
		//PeopleInfo s3 = new PeopleInfo(31, "F", "서울");

	}
}
