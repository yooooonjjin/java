package study10;

public class MyRadio {

	public static void main(String[] args) {

		MyRemocon radio = new MyRemocon(); 	//리모콘의 인스턴스화
		
		System.out.println( "전원 : "+ radio.power );
		radio.power(); //off -> on //false -> true
		System.out.println( "전원 : "+ radio.power );
		radio.channelUp();
		radio.channelUp();
		radio.channelUp();		//채널 +3
		System.out.println( "채널 : "+ radio.channel );
		radio.channelDown();	//채널 -1
		System.out.println( "채널 : "+ radio.channel );
		radio.channel = 91; //채널 91로 세팅
		System.out.println( "채널 : "+ radio.channel );
		radio.power(); //on -> off //true -> false
		System.out.println( "전원 : "+ radio.power );
	}

}
