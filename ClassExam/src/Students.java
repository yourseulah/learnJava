
import java.util.*; //ArrayList쓰기 위해
public class Students {
//배열응용 11/30 pg 226
	//멤버변수
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
    	
	//디폴트생성자 
	public Students() {
	}
	//오버로딩된 생성자
	public Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //ArrayList 생성
	}
	
	//과목명과 점수를 추가하는 메서드, 학생마다 각각처리 
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject); //Subject 타입의 객체를 추가
	}
	
	public void showStudentInfo() {
		int total = 0; //총점 계산 지역변수
	
		System.out.println("=======================================");
		System.out.println(studentName + ":" + studentID);
		for(Subject s : subjectList) { //저장된 원소 수만큼 반복
			total += s.getScorePoint(); //총점누적
			System.out.print(s.getName() + ":" + s.getScorePoint() + " ");
		}
		
		System.out.println();
		System.out.println("총점 : " +  total);
		System.out.println("=======================================");
		
		
		
		
	}
}
