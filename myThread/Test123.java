package myThread;

public class Test123 {

	public static void main(String[] args) {
		
		// 0 ~ 1 ; 0.00000000001 ~ 0.99999999999
		//double d1 = Math.random()*45;	//28.633762906572382
		// 0.00000000001 * 45 -> 0.0000000045 -> 반올림 하면 0
		// 최대값 44.99999999 (*45를 해서) -> 반올림하면 45.0
		// 0.xxxxx -> 1 / 44.xxxxx -> 45.0으로 되어야 함
		//double d2 = Math.round(d1);		//29.0 : 반올림
		//System.out.println(d1);
		//System.out.println(d2);
		//System.out.println((int)d2);	//29 : 정수 형태

	}

}
