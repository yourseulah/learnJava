
public class Ex1126_2 {

	public static void main(String[] args) {
		// �ƽ�Ű�ڵ� ������� (�迭�� ���� �����ϰ� ����� �迭�� ���)
		char[] alpha = new char[26];
		char ch = 'A'; // ����� ���� ���� 
//		System.out.println(ch);// ���� ��µ� 
//		System.out.println((int)ch);// ch�� ����Ÿ������ ����ȯ. ch�� 2����Ʈ�� ����.A��� 65�� ��ȯ �����ϰ� ���������� ��Ī�� �Ǵ� ���ڰ� �ֱ���. 
//		ch++; //�Ǵ� ++ch���� ĳ���� Ÿ���� ���ڷ� ������Ų�ڿ� ���
//		System.out.println((int)ch);
//		
		
//		alpha[0] = 'A';
//		alpha[1] = 'B'; ������ 26�� �׷��� �ݺ������� ���� ����
		
		for (int i = 0; i < alpha.length; i++, ch++) {
			alpha[i] = ch;
		}
		System.out.println(alpha[25]); // 25�� ������ �ε��� 
//		System.out.println(alpha[26]); // �����޼��� �����  
		System.out.println(alpha[5]); 
		
		for (int i = 0; i< alpha.length; i++) {
			System.out.println(alpha[i] + ":" + (int)alpha[i]);
		}

//		char[] alpha = new char[26];
//		char ch = 'a'; // ����� ���� ���� - �ҹ��� a ���� 26���迭
	}

}
