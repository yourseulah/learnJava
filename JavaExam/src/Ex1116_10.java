
public class Ex1116_10 {

	public static void main(String[] args) {
		// ��ø�� �ݺ���
		int dan;
		int times;
		for (dan = 1; dan <=9; dan++) { //�ܺη�Ʈ
			//System.out.println(dan)//�̷��� �ϸ� 1���� 9�� �������� ���
			for (times =1; times <= 9; times++) { //���η�Ʈ 
				System.out.print(dan + "*" + times + "=" + (dan*times) + "\t");	// \t ��
			}
			System.out.println(); //�ٹٲ�
		}
			System.out.println();
		for (dan = 1; dan <=9; dan++) { 
			for (times =1; times <= 9; times++) {
				System.out.print(dan + "*" + times + "=" + (dan*times) + "\t");	// \t ��
			}
			System.out.println(dan);
		}

}
}
