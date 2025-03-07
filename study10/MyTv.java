package study10;

public class MyTv {

	public static void main(String[] args) {

		MyRemocon tv = new MyRemocon(); 	//리모콘의 인스턴스화
		
		System.out.println( tv.power ); 	//false
		tv.power(); //파워 on
		System.out.println( tv.power ); 
		tv.channel = 11;
		System.out.println( tv.channel );	// 11번
		tv.channelDown();
		System.out.println( tv.channel );	//10번
		tv.channelUp();						//11번
		tv.channelUp();						//12번
		System.out.println( tv.channel );
		
		tv.power(); //false
	}

}
