
public class StudentArray {

	public static void main(String[] args) {
		// Student ��ü �迭 �׽�Ʈ 
		Student[] st = new Student[5];
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
		st[0] = new Student(1, "����");
		st[1] = new Student(2, "�ƶ�");
		st[2] = new Student(3, "����");
		st[3] = new Student(4, "����");

		for (int i = 0; i < st.length; i++) {
			st[i].showStudentInfo();
		}
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		
//		for (int i = 4; i < 5; i--) {
//			st[i].showStudentInfo();
//		}
				
		Student st1 = new Student("ȫ�浿"); // Id���� ���� �������
		System.out.println(st1.getStudentName() + ":" + st1.getStudentId());
			st1.showStudentInfo();
		
		
	}

}
