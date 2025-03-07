package study14;

public class CarVolController {

	public static void main(String[] args) {
		
		CarVolMake car = new CarVolMake();		//인스턴스(객체)
		System.out.println( car.getVolumn() );	//0
		
		car.volUp(10);
		car.volUp(10);
		
		System.out.println( car.getVolumn() );	//20
		
		car.volDown(5);
		System.out.println( car.getVolumn() );	//15
		
		car.volPause();
		System.out.println( car.getVolumn() );	//0
		
		car.volResume();
		System.out.println( car.getVolumn() );	//15
		
		car.volOff();
		System.out.println( car.getVolumn() );	//0
		
		
	}

}
