package study12;

import java.util.Scanner;

public class ScreenInfo {

	String movieTitle = "";
	int ticketPrice = 10000;

	//생성자
	public ScreenInfo() {
		
	}
	
	//생산자 오버로딩
	public ScreenInfo(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	public ScreenInfo(String movieTitle, int ticketPrice) {
		this.movieTitle = movieTitle;
		this.ticketPrice = ticketPrice;
	}
	
	public static void main(String[] args) {

		ScreenInfo screenInfo = new ScreenInfo();
		
		ScreenInfo info1 = new ScreenInfo("미이라");
		ScreenInfo info2 = new ScreenInfo("아마존", 15000);
		
		System.out.println("screen 1의 영화 제목은 : " + info1.movieTitle);
		System.out.println("screen 1의 영화 가격은 : " + info1.ticketPrice);

		System.out.println("screen 2의 영화 제목은 : " + info2.movieTitle);
		System.out.println("screen 2의 영화 가격은 : " + info2.ticketPrice);

	}

}
