package study03;

public class IfTest3 {

	public static void main(String[] args) {

		//내가 작성한 코드
		
		//if문 예제 1 : 20세 나이를 기준으로 비교하여 출력하기
		int age = 30;

		if ( age >= 20 ) {
			System.out.println("20세 이상으로 담배 판매가 가능합니다.");
		} else {
			System.out.println("미성년자 이므로 담배를 판매할 수 없습니다.");
		}
		
		System.out.println();
		
		//if문 예제 2 : 현재 연도와의 차이를 계산 후 비교하여 출력하기
		int birthYear = 2010;
		int result2 = 2025-birthYear;

		if ( result2 >= 20 ) {
			System.out.println("20세 이상으로 담배 판매가 가능합니다.");
		} else {
			System.out.println("미성년자 이므로 담배를 판매할 수 없습니다.");
		}

		System.out.println();
		
		//if문 예제 3 : 가지고 있는 돈과 과자 금액을 비교하여 출력하기
		int money = 1800;
		int price = 1500;
		String goods = "빼빼로";

		int result3 = money-price;

		
		if ( result3 >= 0 ) { 
			System.out.println("빼빼로를 사고 " + result3 + "원이 남았습니다.");
		} else {
			System.out.println("빼빼로를 사지 못했습니다.");
		}



	}

}
