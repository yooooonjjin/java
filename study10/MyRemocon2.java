package study10;

public class MyRemocon2 {
	
	boolean power = false; //off
	
	int channel = 0;
	public void power() {		//f -> t //t -> f
		power = !power;
	}
	
	public void setChannel(int c) {
		if( c < 0 || c > 100 ) {
			channel = 0;
		} else {
			channel = c;
		}
	}
	
	public void channelUp() { 	//채널 100번이 끝, 100번에서 업을 누르면 아무런 동작을 안하고 계속 100번인 상태
		if( channel < 100 ) {
			channel++;
		}
	}

	//0에서 다운을 누르면 100번으로
	public void channelDown() {
		channel--;
		if (channel == -1) {
			channel = 100;
		}
		
	}
	
	//public void channelUp() { 	//채널 100번이 끝, 100번에서 업을 누르면 아무런 동작을 안하고 계속 100번인 상태
	//	if( channel < 100 ) {
	//		channel++;
	//	}
	//}
	
	//public void channelDown() {
	//	if( channel > 0 ) {		//채널 값이 0보다 커야 동작하도록, 0번에서 다운을 누르면 아무런 동작을 안하고 계속 0번인 상태
	//		channel--;
	//	}
	//}
	
}
