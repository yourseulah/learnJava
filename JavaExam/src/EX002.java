
public class EX002 {

	public static void main(String[] args) {
		// 문자처리, 형변환
		char ch1 ='A'; //단일문자, 유니코드, 정수(2바이트 이내)가능
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		//소문자, 숫자 일부 출력
		char ch2 = 'a';
		System.out.println((int)ch2);
		char ch3 = '0';
		System.out.println((int)ch3);
		
		// double, in = type num1, num2 = 변수 100 = 리터럴
		double num1;
		int num2 = 3;
		num1 = 100 / num2; //정수 대 정수 연산의 중간결과는 정수 
		System.out.println(num1);
		
		//num1이 정상적인 값이 출력되도록 형변환
		//이건 억지
		num1 = 100.0 / num2 ;
		System.out.println(num1);
		// 캐스팅 명시적 형변환 
		num1 = 100 / (double)num2;
		System.out.println(num1);

		num1 = 100 / (float)num2;
		System.out.println(num1);
	}

}
