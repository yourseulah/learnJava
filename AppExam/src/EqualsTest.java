//Object Class - equals() method pg358

public class EqualsTest {

	public static void main(String[] args) {
		Student st1 = new Student(100, "ȫ�浿");
		Student st2 = st1; //��ü����, st1�� st2 �̵� ��ü�� ������ �ּҸ� ��Ÿ��
		System.out.println(st1);
		System.out.println(st2);
		Student st3 = new Student(100, "ȫ��"); //st3�� st1 �� ������ ������ ��ü 
		System.out.println(st3); //st1�� st3�� �ٸ� ��ü (�ؽ��ڵ� �ٸ�)
		System.out.println("st1�� st2 �� : " + st1.equals(st2));
		System.out.println("st1�� st3 �� : " + st1.equals(st3));
		// equals() method�� ������ �ؽ��ڵ� �� 
		
		
		// ���� ������ �Ϲݰ�ü�ϰ�� ���� ������ ��ü�� �ٸ��� �ؽ��ڵ尡 �ٸ�
		// String�� ��� ��
		// STring�� ���ڿ��� ������ ��� ������ �޸𸮿� ����
		//������ ȿ���� ���
		
		String a1 = new String("ȫ�浿"); //����� 
		String a2 = new String("ȫ�浿");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a1 == a2); // �� ���� ��� ����
		System.out.println(a1.equals(a2)); //���ڿ��� ���� ��(�ʼ�)
		
		
		
	}
	
	
//	
//	pg 364
//	String abc1 = "hello";
//	String abc2 = "hi";
// 	int abc3 = 123;
// 	int abc4 = 123
// 	
// 	sys
	

}





// String �� ��ü int �׳� ���� 
// ��ü�� ������ ���Ƶ� ���� �ּҰ� (�ؽ��ڵ尡) �ٸ��� 
// String�� (���ڿ���) �޸� ���� �����ϱ� ���� ������ ������ �ּҸ� ���� ����
// ���� std.studentName == this.studentName �� ���� ����� ������ �Ѵ�.
// ������ std.studentName.equals(studentName) �ٶ����� ǥ����
