
public class Score {
	String name;
	int korean;
	int english;
	int math;

	//����Ʈ ������ (ȫ�浿, 70, 70, 70)
	public Score() {
		name = "ȫ�浿";
		korean = 70;
		english = 70;
		math = 70;
	}
	
	//�����ε��� ������
	public Score (String sname, int skorean, int senglish, int smath) {
		name = sname;
		korean = skorean;
		english = senglish;
		math = smath;
	}

	// �ż��� ���� 
	// set get 
	public void setName(String sname) {
		name = sname;
	}
	public void setKorean(int skorean) {
		korean = skorean;
	}
	public void setEnglish(int senglish) {
		english = senglish;
	}
	public void setMath(int smath) {
		math = smath;
	}
	public void setAll(int skorean, int senglish, int smath) {
		korean = skorean;
		english = senglish;
		math = smath;
	}
	
	public String getName() {
		return name;
	}
	public int getKorean() {
		return korean;
	}
	public int getEnglish() {
		return english;
	}
	public int getMath() {
		return math;
	}

	//������ ��ȯ�ϴ� �޼��� 
	public int getTotal() {
		return korean+english+math;
	}
	
// ������ ���ϴ� ��������� �����ϱ� get���� (get�� ���� ���� ���� �о���� �³��̴ϱ�)
//	public int getTotal() {
//		int sum = korean + english + math;
//		return sum;
//	}
	
	//��� ��ȯ�ϴ� �޼���
	public double getAverage() {
		return getTotal() / 3.0; //�Ǵ� (double)getTotal/3
	}
	
//	public double getAverage() {
//	return (korean+english+math)/3;
//}
	
//	public int getAverage() {
//		int avg = (korean + english + math)/3;
//		return avg;
//	}
	
}
