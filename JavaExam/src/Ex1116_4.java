
public class Ex1116_4 {

	public static void main(String[] args) {
		// while �ݺ��� (1���� 10���� ������)
		int num = 1 ; //����� (1 ~ ....)
		int sum = 0 ; // ������ ����, �ʱ�ȭ 
		
		while(num <= 10) { 
			sum += num ; 
			System.out.println("sum=" + sum + " , num= " + num); 
			num++ ; // num = num + 1, ++num, num +=1, num++ó�����������ڸ� �����ڵ��� �� ���� ����.
		}
		System.out.println("1���� 10������ ����" + sum + "�Դϴ�.");
	}

}
