
public class Ex1116_6 {

	public static void main(String[] args) {
		// do ~ while, È¦¼öÀÇ ÇÕ
		int num = 1 ;
		int sum = 0 ;
		do { 
			if (num%2 == 1) { //È¦¼ö
				sum += num ;  // ´©Àû		
			}
			num++;
		} while (num <= 10);
		System.out.println(sum + "========" + num);
	}

}
