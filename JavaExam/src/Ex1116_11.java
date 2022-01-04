
public class Ex1116_11 {

	public static void main(String[] args) {
		// 중첩된 사각형 (5행 5열 * 출력)
		int i; //행
		int j; //열
		// 횟수만 처리하면 되므로 시작은 0부터 해도 됨
		for (i = 0; i <=4; i++) { 
			System.out.print("\t"); 
			for (j =0; j <= 4; j++) {  
				System.out.print("*");	
			}
			System.out.println(); //줄바꿈
		}

		// 삼각형 출력 행이 증가할수록 열이 증가
		for (i=0; i < 5; i++) {
			for (j= 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 역삼각형 출력 행이 증가할수록 열이 감소
		for (i=0; i < 5; i++) { //행을 건드리면 안된다. 
			System.out.print("\t"); 
			for (j= 0; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 역삼각형 출력 행이 증가할수록 열이 감소
		for (i=0; i < 5; i++) { //행을 건드리면 안된다. 
				for (j= 5; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
				}		
}
}
  