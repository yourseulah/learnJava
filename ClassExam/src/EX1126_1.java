
public class EX1126_1 {

	public static void main(String[] args) {
		// 배열 테스트 
		int[] stIDs = new int [10]; // 정수형 배열 선언(초기화 하지 않음)
		
		int[] stArr1 = {101, 102, 103, 104, 105}; // 배열 선언과 동시에 초기화 - 제인 간편
		
		int[] stArr2 = new int[] {101, 102, 103, 104, 105} ; // 위와 동일 
		
		int[] stArr3; // 일단 선언
		stArr3 = new int[] { 101, 102, 103}; //new 생략 불가 
		
		//for문 블록 안에서 선언 - 반복구문에서가장 좋아하는 변수명은 i 
		for (int i = 0; i < 5; i++) {
			System.out.println(stArr1[i]); //인덱스는 0부터 
		}
		
		for (int i = 1; i < 5; i++) { //i에 대한 중복선언인데도 오류가 없다. 안에서 인식되기 때문에 서로영향이 없다.
			System.out.println(stArr1[i]); //인덱스는 0부터 
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stArr1[i]); //인덱스는 0부터 
		}
		
		
	}

}
