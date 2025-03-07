package study09;

public class StringTest1 {

	public static void main(String[] args) {
		
		//풀어보기 3
		String date = "2025-02-11";
		String yy = date.substring(0,4); //0~3
		String mm = date.substring(5,7); //0 ~12
		String dd = date.substring(8,10); //0 ~12
		
		
		//split () :: 구분자를 통해 분리 -> 배열 형식의 결과		
		String[] str = date.split("-");
		//String[] str = {"2025", "02", "11"};
		yy = str[0];
		mm = str[1];
		dd = str[2];
		
		System.out.println( yy + "년 " + mm + "월 " + dd + "일 " );
		
		System.out.println();
		
		//풀어보기 4 
		String scores = "70,90,88";
		String s1 = scores.substring(0,2);
		String s2 = scores.substring(3,5);
		String s3 = scores.substring(6,8);
		
		System.out.println( s1 );
		System.out.println( s2 );
		System.out.println( s3 );
		
		String[] datas = scores.split(",");
		for(int i=0; i<datas.length; i++) {
			System.out.println(datas[i]);
		}
		//System.out.println( s1 + "," + s2 + "," + s3 );
		
		//풀어보기 5
		String str5 = "오늘의 학슴\n자바\n데이터베이스\n전자정부 프레임워크";
		
		String str6 = str5.replace("\n","<br>") ;
		System.out.println(str6);
		
		str6 = str6.replace("","&nbsp;") ;
		System.out.println(str6);
				
		
	}

}
