
public class Ex1119_2 {

	public static void main(String[] args) {
		// break 구문	
		int sum = 0;
		int num;
		for (num=1; num <= 10; num++) {
			if (num > 5) {
				break ; // 6이 되는 순간 for 문을 빠져나온.
			}
			sum += num;	
		}
		System.out.println(sum);
	}
	
}
