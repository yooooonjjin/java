package study09;

public class Test1 {

	public static void main(String[] args) {
		//11 35 17 15 5 25
		String rotto = RandomTest1.rotto7();
		System.out.println(rotto);
		
		String[] array = rotto.split("");
		//String[] array = {"11", "35", "17", "15", "5", "25"};
		
		for( int i=0; i<array.length; i++) {
			//System.out.print(array[i]); //0 1 2 3 4 5
		}
		
		
		//클래스 명 + 메소드 = 불러오기 단, 같은 패키지 안에 있는 내용만
		//RandomTest1.rotto();
		
		
		System.out.println( MaxTest1.myMax5(78, 100, 32, 50, 120) );
		
		
	}
	
	
}
