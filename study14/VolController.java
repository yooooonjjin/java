package study14;

public class VolController {

	public static void main(String[] args) {

		VolMake tv = new VolMake();
		VolMake radio = new VolMake();
		
		tv.volUp(10);
		System.out.println( "tv : " + tv.getVolumn() );
		
		tv.volDown(5);
		System.out.println( "tv : " + tv.getVolumn() );
		
		radio.volUp(30);
		System.out.println( "radio : " + radio.getVolumn() );
		
		radio.volDown(20);
		System.out.println( "radio : " + radio.getVolumn() );
		
		
	}

}
