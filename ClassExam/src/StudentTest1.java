
public class StudentTest1 {

	public static void main(String[] args) {
		// Student Ŭ���� �׽�Ʈ 
		
		//Ŭ�� �̸����� ���� ���� Static ������ 
//		System.out.println(Student.getSerialNum()); //��ü �������� �ʰ� ���� ���� private �϶� 
		System.out.println(Student.serialNum); // public�϶� ����. private���� ���ƹ����� �̰� ����. get���� �ؾ��� 
		
		
		//��ü���� st1, st2 = new 
		Student st1 = new Student(); //����Ʈ ������ 
		st1.setStudentName("ȫ�浿"); //1������ s1 studentID�� ���� 
		//System.out.println(st1.studentName); //public ��������̹Ƿ� ����
		//System.out.println(st1.getStudentName()); //public �޼����̹Ƿ� ����
		//st1.serialNum++;
		
		System.out.println(st1.serialNum); //static ���� �б�

		System.out.println(st1.getStudentName() + ":" + st1.studentId);
		
		Student st2 = new Student (); //2��° ���� s2 studentID�� ����
		st2.setStudentName("���");
		System.out.println(st2.serialNum); //
		System.out.println(st1.serialNum); //st2���� ������ ���������Ƿ� ������
		System.out.println(st2.getStudentName() + ":" + st2.studentId);
		
		System.out.println(Student.serialNum); // ��ü ���̵� Ŭ�� �̸����� �Ӽ��� �����Ҽ� �ִ�. �Ϲ������� �ȵǴµ� static�� ���� 
		System.out.println(st2.getStudentName() + ":" + st2.studentId);
		
//		System.out.println(st1.getSerialNum());
//		System.out.println(Student.getSerialNum()); // �տ� static���� �־ Ŭ�󽺸�.�޼���� - ��ü ������ ����
			
		
	}

	    
	
	
	
	
	
	
}
