
public class Ex1116_8 {

	public static void main(String[] args) {
		// 1 ~ 10까지 짝수의 합  (방법 제한없음), while, do ~ while 택일
		int num = 0 ; // 2로 시작해도 됨. 0을 더하나마나니까 
		int sum = 0 ;
							
		do { 
			sum += num ;
			System.out.println(sum + "============" + num);
			num += 2 ;
		} while (num <= 10); {
		System.out.println(sum + "========" + num);
		}
		
		// 또는
		
		do { 
			if (num%2 == 0) { // 짝수
				sum += num ;  // 누적		
			}
			num++;
		} while (num <= 10);
		System.out.println(sum + "========" + num);
		}
	}

