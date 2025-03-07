package Exam;

class FlowerInfo {
	
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

public class FlowerMain {

	public static void main(String[] args) {

		FlowerInfo flower = new FlowerInfo();
		flower.setColor("빨강");
		flower.setName("장미");
		
		System.out.println( "꽃 이름 : " + flower.getName() );
		System.out.println( "꽃 색상 : " + flower.getColor() );
		
	}

}
