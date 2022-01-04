
public class Ex1116_4 {

	public static void main(String[] args) {
		// while 반복문 (1부터 10까지 누적합)
		int num = 1 ; //제어변수 (1 ~ ....)
		int sum = 0 ; // 누적합 저장, 초기화 
		
		while(num <= 10) { 
			sum += num ; 
			System.out.println("sum=" + sum + " , num= " + num); 
			num++ ; // num = num + 1, ++num, num +=1, num++처럼후위연산자를 개발자들은 더 자주 쓴다.
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
