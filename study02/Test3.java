package study02;

public class Test3 {

	public static void main(String[] args) {
		
		int number = 1; //1
	
		//1 증가
		number = number + 1; //1 증가 (증가하는 숫자만 변경 가능)
		number += 1; //1 증가 (증가하는 숫자만 변경 가능)
		number++; //1 증가 (1씩만 증가)
		++number; //1 증가 (1씩만 증가)
		
		//2증가
		number = number + 2; //2 증가
		number += 2; //2 증가
		
		//100증가
		number = number + 100; //100 증가
		number += 100; //100 증가
		System.out.println("number 변수 값 :" + number ); //209
		
		
		
		//쇼핑몰 -> 구매 1개 (+), (-) 1000원		
		
		System.out.println("");
		
		
		int count = 100; //100
		
		//1 가감
		count = count - 1; //1 가감 (가감하는 숫자만 변경 가능)
		count -= 1; //1 가감 (가감하는 숫자만 변경 가능)
		count--; //1 가감 (1씩만 가감)
		--count; //1 가감 (1씩만 가감)
		
		//2증가
		count = count - 2; //2 가감
		count -= 2; //2 가감
		System.out.println("number 변수 값 :" + count ); //92
		
		
	}

}
