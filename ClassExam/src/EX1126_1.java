
public class EX1126_1 {

	public static void main(String[] args) {
		// �迭 �׽�Ʈ 
		int[] stIDs = new int [10]; // ������ �迭 ����(�ʱ�ȭ ���� ����)
		
		int[] stArr1 = {101, 102, 103, 104, 105}; // �迭 ����� ���ÿ� �ʱ�ȭ - ���� ����
		
		int[] stArr2 = new int[] {101, 102, 103, 104, 105} ; // ���� ���� 
		
		int[] stArr3; // �ϴ� ����
		stArr3 = new int[] { 101, 102, 103}; //new ���� �Ұ� 
		
		//for�� ��� �ȿ��� ���� - �ݺ������������� �����ϴ� �������� i 
		for (int i = 0; i < 5; i++) {
			System.out.println(stArr1[i]); //�ε����� 0���� 
		}
		
		for (int i = 1; i < 5; i++) { //i�� ���� �ߺ������ε��� ������ ����. �ȿ��� �νĵǱ� ������ ���ο����� ����.
			System.out.println(stArr1[i]); //�ε����� 0���� 
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(stArr1[i]); //�ε����� 0���� 
		}
		
		
	}

}
