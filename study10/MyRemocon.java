package study10;

public class MyRemocon {
	
	boolean power = false; //off
	
	int channel = 0;
	public void power() {		//f -> t //t -> f
		power = !power;
	}
	
	public void channelUp() {
		channel += 1;
	}
	
	public void channelDown() {
		channel -= 1;
	}
	
	
}
