package study10;

public class MyRemocon3 {
	
	//전원
	boolean pow = false;	
	
	//온도	
	int temp = 20;	

	//바람 단계 ( A : 약풍, B : 중풍, C : 강풍 )
	char wind = 'A';	
	
	//운전 ( A : 난방, B : 냉방, C : 송풍, D : 제습 )
	char drive = 'A';
	
	public void pow() {
		pow = !pow;
	}
	
	public void tempUp() {
		if( temp < 30 ) {
			temp++;
		}

	}
	
	public void tempDown() {
		if( temp > 10 ) {
			temp--;
		}
	}
	
	public void setWind() {
		wind++;
		if( wind == 'D' ) {
			wind = 'A';
		}
	}
	
	public void setDrive() {
		drive++;
		if( drive == 'E' ) {
			drive = 'A';
		}
	}
	
	public void setTemp25() {
		temp = 25;
		drive = 'C';
	}
	
}
