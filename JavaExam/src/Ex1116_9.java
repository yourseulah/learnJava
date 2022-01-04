
public class Ex1116_9 {

	public static void main(String[] args) {
		// for문 이용 1 ~ 10 까지의 누적합
		int i = 1 ;
		int sum = 0 ;
		for (i=1; i <=10  ; i++ ) { // 증감식 구간에 ++i , i=i+1, i+=1 다가능
			sum +=i;
		}
		System.out.println(sum+ "========" + i);
	
	//평균 구하려면 i에서 1을 빼야한다. i++이라서

	//1 ~ 10 까지 홀수의 합
		sum = 0 ;
		for (i=1; i<=10 ; i+=2) {
			sum += i ;
		}
		System.out.println(sum+ "========" + i);
	
	//1 ~ 10 까지 홀수의 합, if 활용
		sum = 0 ;
		for (i=1; i<=10 ; i++) {
			if (i%2 == 1) {
			sum += i ;
			}
		}
		System.out.println(sum+ "========" + i);
	
	// 1 ~ 10 까지 짝수의 합
		sum = 0 ;
		for (i=2; i<=10 ; i+=2) {
			sum += i ;
		}
		System.out.println (sum+ "========" + i);		
		
    // 1 ~ 10 까지 짝수의 합, if 
		sum = 0 ;
		for (i=2; i<=10 ; i++) {
			if (i%2 == 0) {
			sum += i ;
			}
		}
		System.out.println (sum+ "========" + i);

	//1 ~10 까지 출력
			
		while (i <= 10) {
			i++ ;
			System.out.println(i) ;
		}
		
		for (i=1 ; i <= 10 ; i++) {
			System.out.println(i) ;
		}
		
	}
	
	}
	