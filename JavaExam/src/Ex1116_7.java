
public class Ex1116_7 {

	public static void main(String[] args) {
		// do ~ while (홀수, 반복횟수 줄이기 10번에서 5번으로 홀수만)
		int num = 1 ;
		int sum = 0 ;
							
		do { 
			sum += num ;
			System.out.println(sum + "============" + num);
			num += 2 ;
		} while (num <= 10); {
		System.out.println(sum + "========" + num);
		}
		
	}

}

