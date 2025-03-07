package study10;

public class Aircon {

	public static void main(String[] args) {
		
		MyRemocon3 con = new MyRemocon3();
		
		//전원
		con.pow(); //pow :: false -> true
		
		System.out.println("현재 온도 : " + con.temp);		//20
		
		//온도 2 증가
		con.tempUp();
		con.tempUp();
		System.out.println("현재 온도 : " + con.temp);		//22
		
		System.out.println("운전 상태 : " + con.drive);	//A (난방)
		//운전 선택 (난방 -> 냉방)
		con.setDrive();
		System.out.println("운전 상태 : " + con.drive);	//B (냉방)
		
		System.out.println("바람 세기 : " + con.wind);		//A (약풍)
		//바람세기 (약풍(A) -> 중풍(B))
		con.setWind();
		System.out.println("바람 세기 : " + con.wind);		//B (중풍)
		
		//실내온도
		con.setTemp25();
		System.out.println("현재 온도 : " + con.temp);		//25
		System.out.println("운전 상태 : " + con.drive);	//C
	}

}
