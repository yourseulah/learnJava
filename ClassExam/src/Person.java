
public class Person { //����� ��ü�� ������� �ϴ°�
	String name;
	int height;
	int weight;
	
	// �����ڰ� �Ѱ��� ���� ��� ����Ʈ �����ڰ� ������
	
	// ������ �ۼ� ��Ģ
	// Ŭ������� ����
	// ��ȯŸ���� ���� (���� ����)
	// ��������� ����Ʈ ������ �ʿ� , �󲮵��� 
	public Person() {
		
	}
	// �����ε��� ������
	public Person(String pName) { //������ �̸��� ����, �Ű����� �ٸ�(����, Ÿ��, ����)
		name = pName; // �Ű������� ���ؼ� ��������� �ִ°�
	}
	//�����ε��� ������
	public Person(String pName, int pHeight, int pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	
	// �޼��� 
	public String getName() {
		return name;
	}

	// Ű�� �����Ը� ���� ������ �� �ִ� �޼��� �߰�
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	// ����, Ű, �����Ը� ������ �� �ִ� �޼��带 ...  �߰� ������ ��� �ֱ⸸ �ϸ� �Ǵϱ� void
	public void setPerson(String pName, int pHeight, int pWeight ) {
		name = pName;
		height = pHeight;
		weight = pWeight;
		return; //�����ȯ(���� ����) ���� �������� return �ڿ� ���� �־����
	}
		
//	public void showStudentInfo() {
//		System.out.println(studentName + "===" + address);
//	
//	
}
