package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

interface Inter1 {
	public void abg(String t);
}
public class ConsumerTest {

	public static void main(String[] args) {
		
		Inter1 it = (t) -> {
			System.out.println(t);
		};
		it.abg("java1");						// java1
		
		Consumer<String> cons1 = (t) -> {
			System.out.println(t);
		};
		cons1.accept("java2");					// java2
		
		Consumer<Integer> cons2 = (t) -> {
			System.out.println(t+100);
		};
		cons2.accept(100);						// 200
		
		BiConsumer<Integer,Integer> cons3 = (t1,t2) -> {
			System.out.println("합계 : " + (t1+t2) );
		};
		cons3.accept(100,200);
		
		// 소문자 -> 대문자 전환
		Consumer<String> strUp = (str) -> {
			System.out.println( str.toUpperCase() );
			//return str.toUpperCase();	// error
		};
		strUp.accept("java");
		
		
		
	}

}
