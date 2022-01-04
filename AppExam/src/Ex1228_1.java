// 2021/12/28
// 14-2 예외처리하기

public class Ex1228_1 {
	
	public static void main(String[] args) {
		// 예외처리 try-catch구문
		int[] arr = new int[5];
		
	// 예외 처리 없이 돌렸을 경우 하기 에러 발생
	// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	// at Ex1228_1.main(Ex1228_1.java:11)
	/*
		for (int i = 0; i <= 5 ; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	*/

		try {
			//예외가 발생할 가능성이 있는 문장 
			for (int i = 0; i < 5 ; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch(Exception e) {
			//예외가 발생했을 경우 처리할 문장 
			System.out.println(e); //로깅을 하기위한 문장. 정상처리되면 주석처리
		}
		
	}

}
