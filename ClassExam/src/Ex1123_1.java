
public class Ex1123_1 {
	//��Ģ�����
	int result; //����������� �Ӽ�
	int num1; // ��꿡 ���Ǵ� ���� �Ӽ�
	int num2; // ��꿡 ���Ǵ� ������ �Ӽ�
	
	// ����Ʈ �����ڸ� �ݵ�� ���� (������ ��� ��)
	public Ex1123_1() { //����Ʈ ������
		
	}
	
	//������ (Ŭ������� ����, ��ȯŸ�� ����(return�� ����), �������� �޼��� ���� ����� ����)
	//�����ε��Ȼ����� 
	public Ex1123_1 (int n1, int n2) { //�Ű����� �ִ� ������ 
		num1 = n1;
		num2 = n2;
	}
	
	// �����;��� set 
	public void setNum1 (int n1) {
		num1 = n1;
	}
	
	public void setNum2 (int n2) {
		num2 = n2;
	}
	
	public void setNum3 (int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	// �������б� get(return �ʿ�) set (return �ʿ����) 
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
		
	//�޼���
	public int add() {
		result = num1 + num2;
		return result;
	}
	
	public int subtract() {
		result = num1 - num2;
		return result;
	}
	
	public int product() {
		result = num1 * num2;
		return result;
	}
	
	public int divide() {
		result = num1 / num2;
		return result;
	}
	
	//���� �޼��� (Overloading �� �޼���)
	public int add(int n1, int n2) { //pulic ��ȯŸ�� �ż���� (�Ű����� ����Ʈ) - ������� ��𼭵� ȣ���Ѵ� �����ؾ����� �����ϴϰ� public
		num1 = n1;
		num2 = n2;
		result = num1 + num2 ; // �Ӽ����� ��������
		return result; 
	}
	
	//���� �޼���  --  ���⼭�� n1 n2 �� ���� �޼����� n1 n2�� ���� �������
	public int subtract(int n1, int n2) {
		num1 = n1;
		num2 = n2;		
		result = n1 - n2;//�Ӽ����� ���� ����
		return result;
	}
	
	//���� �޼��� 
	public int product(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		result = n1 * n2; // ���������� ��������
		return result;
	}
	
	//������
	public int divide(int n1, int n2) {
		result = n1 / n2; // ���������� ����������
		return result;
	}
	
}
