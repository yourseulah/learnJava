
public class Ex1119_1 {

	public static void main(String[] args) {
		// continue ����
		int total = 0;
		int num;
		for (num = 1; num <=100 ; num++ ) {
			if (num % 2 == 0) {
				continue; // ¦���� ��츸 ���� ���������� �ƴѰ�� (Ȧ��)���� ������ ������
			}
			total += num; // num�� Ȧ���϶��� ����
		}
		System.out.println(total);
	}
}




