
public class Ex1116_3 {

	public static void main(String[] args) {
		// switch - case 구문
		int score = 100  ;
		char grade ;
		
		switch (score/10) {
		case 10: ; //100점 하나라도 빠져나갈수 있는것 확인
		case 9: grade = 'A';
			break;
		case 8: grade = 'B';
			break;
		case 7: grade = 'C';
			break;
		case 6: grade = 'D';
			break;
		default : grade = 'F' ;
		}
		// 이 부분에 등급을 출력 		
		System.out.println("당신의" + score + "점수에 해당하는 학점은" + grade + "입니다");
	}

}
