
public class Ex1130_4 {

	public static void main(String[] args) {
		//다차원배열 pg219
		// int[][] arr = new int[2][3]; //2행3열
		int[][] arr = {{1,2,3},{4,5,6}}; //2행3열 생성 및 초기화
		for (int i = 0; i < arr.length; i++) { //행 
			for (int j = 0;j < arr[i].length; j++) { //열
				System.out.print(arr[i][j] + " ");//원소의 값 출력

			}
			System.out.println();
		}

	}

}
