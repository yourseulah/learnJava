
public class EX002 {

	public static void main(String[] args) {
		// ����ó��, ����ȯ
		char ch1 ='A'; //���Ϲ���, �����ڵ�, ����(2����Ʈ �̳�)����
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		//�ҹ���, ���� �Ϻ� ���
		char ch2 = 'a';
		System.out.println((int)ch2);
		char ch3 = '0';
		System.out.println((int)ch3);
		
		// double, in = type num1, num2 = ���� 100 = ���ͷ�
		double num1;
		int num2 = 3;
		num1 = 100 / num2; //���� �� ���� ������ �߰������ ���� 
		System.out.println(num1);
		
		//num1�� �������� ���� ��µǵ��� ����ȯ
		//�̰� ����
		num1 = 100.0 / num2 ;
		System.out.println(num1);
		// ĳ���� ����� ����ȯ 
		num1 = 100 / (double)num2;
		System.out.println(num1);

		num1 = 100 / (float)num2;
		System.out.println(num1);
	}

}
