package study13;

class CarInfo2 {

	//캡슐화
	//private 처리된 변수는 상속이 안됨
	//private String carName;
	//private String carColor;
	//private int velocity;
	private String maker;
	
	String carName;
	String carColor;
	int velocity;
}

//상속
public class CarColor extends CarInfo2 {

	public CarColor() {}
	
	//다형성(오버로딩)
	public CarColor(String color, String name, int speed) {
		carName = name;
		velocity = speed;
		carColor = color;
	}
	
	public static void main(String[] args) {
		CarColor cc = new CarColor("Whith","Sonata", 100);
		System.out.println( cc.carName + ", " + cc.velocity + ", " + cc.carColor );
	}

}
