
public class Ex1123_2 {

	public static void main(String[] args) { // main�޼������ ���� 
		
		// ù��° ��ü ���� �� �׽�Ʈ 
		// �ν��Ͻ� �����ؾ� Ŭ���� ��밡��
		// Ŭ������ ������ = new ������
		// ����Ʈ �����ڴ� Ŭ������� �����ϸ� �Ű����� ����
		Ex1123_1 cal1 = new Ex1123_1(); // new�� �� ���� �����Ѵ�. ����Ʈ �����ڷ� �ν��Ͻ� ���� (cal1�̶�� ��ü ����)
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		System.out.println(cal1.add(10, 20)); //or
		int test = cal1.add(1, 2);//����� test�� ��ȯ
		System.out.println(test);
		
		//���� �׽�Ʈ 
		System.out.println(cal1.product (5,10));
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		// �ι�° ��ü ���� �� �׽�Ʈ 
		Ex1123_1 cal2 = new Ex1123_1(3,5); // ��ü ���� (�ν��Ͻ� ����)
		System.out.println(cal2.add()); //ȣ��� ���ÿ� ���
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.divide());
		System.out.println(cal2.add(6,7));
		
		// ����° ��ü ���� �� �׽�Ʈ 
		Ex1123_1 cal3 = new Ex1123_1(10, 5);
		// 10 + 5 = 15
		System.out.println(cal3.getNum1() + cal3.getNum2());
		System.out.println(cal3.getNum1() + "+" + cal3.getNum2() + "=" + cal3.add());
		// cal3.num1 �̷��� �ᵵ �Ǵµ� ���߿� ��������� �����Ŷ� ��) private int num1 ���߿� ��������� �����ǵ帮�� �Ǹ� ������ ���ϰ� ������ ����� �ִ�. 
		
		// �׹�° ��ü ���� �� �׽�Ʈ
		// ����Ʈ �����ڷ� ���� �� �Ű����� (9, 10) �߰��ϰ� ���� ��� �׽�Ʈ 
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9);
		cal4.setNum2(10);
//		cal4.setNum3(9, 10);
		System.out.println(cal4.getNum1() + "*" + cal4.getNum2() + "=" + cal4.product());
		
		}
		
	}


