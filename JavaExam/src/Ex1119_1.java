
public class Ex1119_1 {

	public static void main(String[] args) {
		// continue 구문
		int total = 0;
		int num;
		for (num = 1; num <=100 ; num++ ) {
			if (num % 2 == 0) {
				continue; // 짝수인 경우만 위로 빠져나가고 아닌경우 (홀수)에만 밑으로 내려감
			}
			total += num; // num이 홀수일때만 실행
		}
		System.out.println(total);
	}
}




