package study02;

public class Test2 {

	public static void main(String[] args) {
		
		//예제 1
		//"=" 기호를 대입연산자 라고 부름
		int score1 = 100;
		String myName = "홍길동";
		int score2 = 10+20+30;
		
		
		//예제 2
		int number = 100;
		System.out.println("초기 값:" + number);
		
		//50 누적
		number = number + 50;
		System.out.println("50 증가:" + number);
		
		//80 누적
		number = number + 80;
		System.out.println("80 증가:" + number);
		
		//30 가감
		number = number - 30;
		System.out.println("30 가감:" + number);
		
		//2 곱하기
		number = number *2;
		System.out.println("곱셈 처리:" + number);
		
		System.out.println();
		
		//"number 변수의 최종 누적 값은 ---입니다."
		System.out.println("number 변수의 최종 누적 값은 "+ number + "입니다.");
		
		System.out.println();
	
		
		//예제 3
		int money = 1000;
		System.out.println(money); //1000
		
		//money = money + 100;
		money += 100; //+ 누적
		System.out.println(money); //1100
	
		//money = money + 200;
		money += 200; //+ 누적
		System.out.println(money); //1300
		
		//money = money - 40;
		money -= 40; //- 가감
		System.out.println(money); //1260m
	
		System.out.println("-------------------");
		
		
		//증감연산자, 가감연산자
		//++ (1 증가), -- (1 가감)
		
		int a = 1;
		System.out.println(a); //1
		++a; //1 증가
		System.out.println(a); //2
		++a; //1 증가 //전위연산
		++a; //1 증가
		System.out.println(a); //4
		a++; //1 증가 //후위연산
		System.out.println(a); //5
		
		System.out.println();
		
		a--; //1 가감
		System.out.println(a); //4
		a--; //1 가감
		a--; //1 가감
		System.out.println(a); //2
		
		//a** //없는 표현식
		
		System.out.println("-------------------");
		
		
		//예제2
		int b = 1;
		b++; //스스로 1 증가
		System.out.println(b); //2
		
		b = 1;
		int c = ++b; //전위연산 //연산을 먼저 처리한 후 값을 넘김
		System.out.println( b + "," + c); //b=2, c=2
		
		b = 1;
		c = b++; //후위연산 //값을 먼저 넘긴 후 연산처리
		System.out.println( b + "," + c); //b=2, c=1
	}

}
