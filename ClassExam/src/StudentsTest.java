
public class StudentsTest {

	public static void main(String[] args) {
		// 학생, 과목 클래스 테스트(가변 과목)
		Students st1 = new Students(1001, "홍길동");
		st1.addSubject("국어", 90);
		st1.addSubject("영어", 85);
		Students st2 = new Students(1002, "김삿갓");
		st2.addSubject("국어", 70);
		st2.addSubject("영어", 93);
		st2.addSubject("수학", 81);
		
		st1.showStudentInfo();
		st2.showStudentInfo();
	}

}
      