
public class Student {
	//�������
	public static int serialNum = 1000; //�ν��Ͻ�(��ü)������ ������, ��� ��ü���� �������� ���
	public int	studentId;
	public String studentName; 
	public int grade; 
	public String address;
	
	//����Ʈ ������ - �μ��� �����ϱ� 
	public Student() {
		serialNum++; //serialNum = serialNum + 1 ��� ���� �Ǵ� ���� ������ �����ڵ��� ���������� ��ȣ
		studentId = serialNum; // ���� �Ǽ� ����
	}
	
	//�����ε��� ������
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
//		this.grade = 1;
	}
	
	public Student(String studentName) {
		this.studentName = studentName;
		serialNum = serialNum + 1 ;
		studentId = serialNum;
	}
	
	//�޼���
	//���������� �ϴ� ��� 
	public int getStudentId () {
		return studentId;
	}
		
	public String getStudentName () {
		return studentName;
	}
	
	public int getGrade() {
		return grade;
	}

	public String getAddress() {
		return address;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setAdress(String address) {
		this.address=address;
	}
	
	public void showStudentInfo() {
		System.out.println(getStudentId() + ":" + getStudentName());
	}
	
	
//	public static int getSerialNum() {
//		int i = 10; // �������� ��밡��  
//		return serialNum;
//	}
	
	
	
	
	
	/*
	//�����ε��� �޼��� 
	//������ (main) 
	public static void main(String args[]) { // ������, �ü������ ���α׷� ȣ��, Student Ŭ������ ������ �ƴ�.
		// grade = 3; ��ü ������ �ؾ߸� �����ȴ�. �޼��忡���� ���� �����̶� ��������� �������� �����Ҽ� �ִµ� ���θ޼���(static)�� �ȵȴ�.
		//Ŭ������ ������  = new ������ () *�ϱ���� *��ü ����
		Student st1  = new Student(); //��ü���� - �ν��Ͻ��� ����. ó���� ������ ������ ó��
		st1.setStudentName("ȫ�浿");
		
		//�Ѵ� ��µǴ� ����� ����
		System.out.println(st1.studentName); //��������� ���� ���
//		System.out.println(st1.getstudentName()); //�޼���(�Լ�)�� Ȱ���ؼ� ���
	} */
}
