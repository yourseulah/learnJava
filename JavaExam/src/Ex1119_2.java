
public class Ex1119_2 {

	public static void main(String[] args) {
		// break ����	
		int sum = 0;
		int num;
		for (num=1; num <= 10; num++) {
			if (num > 5) {
				break ; // 6�� �Ǵ� ���� for ���� ��������.
			}
			sum += num;	
		}
		System.out.println(sum);
	}
	
}
