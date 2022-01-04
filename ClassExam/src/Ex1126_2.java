
public class Ex1126_2 {

	public static void main(String[] args) {
		// 아스키코드 연속출력 (배열에 먼저 저장하고 저장된 배열을 출력)
		char[] alpha = new char[26];
		char ch = 'A'; // 저장용 시작 문자 
//		System.out.println(ch);// 문자 출력됨 
//		System.out.println((int)ch);// ch를 숫자타입으로 형변환. ch가 2바이트라서 가능.A라는 65로 변환 가능하고 내부적으로 매칭이 되는 숫자가 있구나. 
//		ch++; //또는 ++ch으로 캐릭터 타입을 숫자로 증가시킨뒤에 출력
//		System.out.println((int)ch);
//		
		
//		alpha[0] = 'A';
//		alpha[1] = 'B'; 이짓을 26번 그래서 반복구문을 쓰는 거임
		
		for (int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;
		}
		System.out.println(alpha[25]); // 25가 마지막 인덱스 
//		System.out.println(alpha[26]); // 오류메세지 뜰거임  
		System.out.println(alpha[5]); 
		
		for (int i = 0; i< alpha.length; i++) {
			System.out.println(alpha[i] + ":" + (int)alpha[i]);
		}

//		char[] alpha = new char[26];
//		char ch = 'a'; // 저장용 시작 문자 - 소문자 a 부터 26개배열
	}

}
