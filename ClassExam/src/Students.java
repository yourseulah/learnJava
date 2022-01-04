
import java.util.*; //ArrayList���� ����
public class Students {
//�迭���� 11/30 pg 226
	//�������
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
    	
	//����Ʈ������ 
	public Students() {
	}
	//�����ε��� ������
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //ArrayList ����
	}
	
	//������ ������ �߰��ϴ� �޼���, �л����� ����ó�� 
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); //Subject Ÿ���� ��ü�� �߰�
	}
	
	public void showStudentInfo() {
		int total = 0; //���� ��� ��������
	
		System.out.println("=======================================");
		System.out.println(studentName + ":" + studentID);
		for(Subject s : subjectList) { //����� ���� ����ŭ �ݺ�
			total += s.getScorePoint(); //��������
			System.out.print(s.getName() + ":" + s.getScorePoint() + " ");
		}
		
		System.out.println();
		System.out.println("���� : " +  total);
		System.out.println("=======================================");
		
		
		
		
	}
}
