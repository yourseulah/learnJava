
public class Ex1116_3 {

	public static void main(String[] args) {
		// switch - case ����
		int score = 100  ;
		char grade ;
		
		switch (score/10) {
		case 10: ; //100�� �ϳ��� ���������� �ִ°� Ȯ��
		case 9: grade = 'A';
			break;
		case 8: grade = 'B';
			break;
		case 7: grade = 'C';
			break;
		case 6: grade = 'D';
			break;
		default : grade = 'F' ;
		}
		// �� �κп� ����� ��� 		
		System.out.println("�����" + score + "������ �ش��ϴ� ������" + grade + "�Դϴ�");
	}

}
