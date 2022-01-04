
public class Ex1116_2 {

	public static void main(String[] args) {
		// if ~ else 조건문
		int score = 65;
		if (score >= 90) {
			System.out.println("A학점");		
		} else if(score >= 80) { // 90 > 점수 >= 80
			System.out.println("B학점");	
		} else if(score >= 70) {
			System.out.println("C학점");
		} else if(score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}
}
