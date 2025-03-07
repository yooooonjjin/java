package Exam;

class MyFlowerInfo extends FlowerInfo {

	String size;
	int price;
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void discount() {
		price = (int)(price*0.5);
	}
}

public class MyFlowerMain extends MyFlowerInfo {

	public static void main(String[] args) {
		
		MyFlowerMain my = new MyFlowerMain();
		my.setName("장미");
		my.setColor("분홍");
		my.setPrice(20000);
		my.setSize("대");
		
		System.out.println( my.getName() );
		System.out.println( my.getColor() );
		System.out.println( my.getPrice() );
		System.out.println( my.getSize() );
		
		my.discount();	// 가격 다운 실행
		System.out.println( my.getPrice() );
	}
}
