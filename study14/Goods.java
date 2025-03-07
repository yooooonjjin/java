package study14;

abstract class GoodsInfo {
	public int quantity;	//수량변수
	abstract public void quantityUp(int n); 
	abstract public void quantityDown(int n);
	public void quantityZero() {
		quantity = 0;
	}
}

public class Goods extends GoodsInfo {

	
	public void quantityUp(int n) {
		quantity += n;
	}
	public void quantityDown(int n) {
		//20개 보유, -30 //20 < 30
		//보유한 숫자보다 가감처리를 할 숫자가 더 큰 경우
		if ( quantity < n ) {
			quantityZero();
			//quantity = 0;
		} else {
			quantity -= n;	
		}
	}
	public void quantityZero() {
		quantity = 0;
	}
	
	public static void main(String[] args) {
		
		Goods goods = new Goods();
		
		System.out.println( "상품 잔량 : " + goods.quantity);		//0
		
		goods.quantityUp(100);
		
		System.out.println( "상품 잔량 : " + goods.quantity);		//100
		
		goods.quantityDown(50);
		
		System.out.println( "상품 잔량 : " + goods.quantity);		//50
		
		goods.quantityDown(60);
		
		System.out.println( "상품 잔량 : " + goods.quantity);		//-10
		
	}

}
