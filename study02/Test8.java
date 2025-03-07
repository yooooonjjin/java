package study02;

public class Test8 {

	public static void main(String[] args) {

		int a = 1;
		++a; //2
		a++; //3
		
		int b = 1; 
		int c = ++b; //전위연산
		System.out.println( b + "," + c ); //b:2, c:2
		
		int d = 1;
		int e = d++; //후위연산
		System.out.println( d + "," + e); //d:2, e:1
	}

}
