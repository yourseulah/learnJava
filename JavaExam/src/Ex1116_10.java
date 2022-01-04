
public class Ex1116_10 {

	public static void main(String[] args) {
		// 중첩된 반복문
		int dan;
		int times;
		for (dan = 1; dan <=9; dan++) { //외부루트
			//System.out.println(dan)//이렇게 하면 1부터 9가 수직으로 출력
			for (times =1; times <= 9; times++) { //내부루트 
				System.out.print(dan + "*" + times + "=" + (dan*times) + "\t");	// \t 탭
			}
			System.out.println(); //줄바꿈
		}
			System.out.println();
		for (dan = 1; dan <=9; dan++) { 
			for (times =1; times <= 9; times++) {
				System.out.print(dan + "*" + times + "=" + (dan*times) + "\t");	// \t 탭
			}
			System.out.println(dan);
		}

}
}
