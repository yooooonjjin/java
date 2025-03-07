package study03;

public class Test1 {

	public static void main(String[] args) {
		
		int count = 1;
		
		//1 증가
		count = count + 1;
		count += 1;
		count++; //1씩만 증가
		
		//3증가
		count = count + 3;
		count += 3;
		
		//count 값은 10입니다.
		System.out.println("count 값은 " + count + "입니다.");
		
		System.out.println();
		
		//3항 연산
		//100 보다 크다, 작다.
		int number = 100; //숫자 대입
		String result = ( number > 100 )?"크다":"작다";

		//90은 100보다 작다.
		System.out.println( number + "은 100보다 " + result + ".");

		//100보다 크다, 작다, 같다.
		/*String result2 = ( number > 100 )?"크다":
						   ( number == 100 )?"같다":"작다"; //같다 추가
		*/
		String result2 = ( number > 100 )?"크다":
			             ( number < 100 )?"작다":"같다"; //같다 추가
		
		System.out.println( number + "은 100과 비교하여 " + result2 + ".");
	
		
		//학점 (A, B, C, D, F)
		int math = 92;
		String level = ( math > 90 )?"A":
					   ( math > 80 )?"B":
					   ( math > 70 )?"C":
					   ( math > 60 )?"D":"F";
		
		//수학점수는 88점으로 B 학점입니다.
		System.out.println( "수학 점수는 " + math + "점으로 " + level + "학점입니다." );
		
		//조건이 1개인 경우
		//(조건)?참:거짓;
				
		//조건이 2개인 경우		   
		//(조건 1)?참:(조건 2):참:거짓;
				
		//조건이 3개인 경우		
		//(조건 1)?참:(조건 2)?참:(조건 3)?참:거짓		
		
	}

}
