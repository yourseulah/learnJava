
public class Ex1116_11 {

	public static void main(String[] args) {
		// ��ø�� �簢�� (5�� 5�� * ���)
		int i; //��
		int j; //��
		// Ƚ���� ó���ϸ� �ǹǷ� ������ 0���� �ص� ��
		for (i = 0; i <=4; i++) { 
			System.out.print("\t"); 
			for (j =0; j <= 4; j++) {  
				System.out.print("*");	
			}
			System.out.println(); //�ٹٲ�
		}

		// �ﰢ�� ��� ���� �����Ҽ��� ���� ����
		for (i=0; i < 5; i++) {
			for (j= 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ���ﰢ�� ��� ���� �����Ҽ��� ���� ����
		for (i=0; i < 5; i++) { //���� �ǵ帮�� �ȵȴ�. 
			System.out.print("\t"); 
			for (j= 0; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ���ﰢ�� ��� ���� �����Ҽ��� ���� ����
		for (i=0; i < 5; i++) { //���� �ǵ帮�� �ȵȴ�. 
				for (j= 5; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
				}		
}
}
  