package study02;

public class Test7 {

	public static void main(String[] args) {
		
        //오전, 오후
      	int hh = 20; //13시 ::0~23
      	
      	//지금 시간은 오후 1시입니다.
      	//13시 - 1시, 15시 - 3시, 9시 - 9시, 3시 - 3시
      	String n1 = (hh-12) >= 0 ? "오후":"오전";
      	int n2 = (hh-12) >= 0 ? hh-12 : hh;
      	System.out.println("지금 시간은 " + n1 + " " + n2 + "시 입니다.");
      	
		
      	System.out.println();
      	
      	//성적 출력 - 우수 (80이상), 보통 (60점 이상), 노력
      	int score = 40;
      	
      	//68점 득점으로 보통에 해당됩니다.
      	//String result2 = (score < 60)?"노력":(score < 80)?"보통":(score >= 80)?"우수":"";
      	String result2 = (score >= 80)? "우수":
      					 (score >= 60)?"보통":"노력";
      	
      	System.out.println(score + "점 득점으로 " + result2 + "에 해당됩니다.");
	}

}
