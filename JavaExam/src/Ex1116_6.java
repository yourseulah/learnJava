
public class Ex1116_6 {

	public static void main(String[] args) {
		// do ~ while, Ȧ���� ��
		int num = 1 ;
		int sum = 0 ;
		do { 
			if (num%2 == 1) { //Ȧ��
				sum += num ;  // ����		
			}
			num++;
		} while (num <= 10);
		System.out.println(sum + "========" + num);
	}

}
