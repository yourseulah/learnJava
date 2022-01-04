
public class Score {
	String name;
	int korean;
	int english;
	int math;

	//디폴트 생성자 (홍길동, 70, 70, 70)
	public Score() {
		name = "홍길동";
		korean = 70;
		english = 70;
		math = 70;
	}
	
	//오버로딩된 생성자
	public Score (String sname, int skorean, int senglish, int smath) {
		name = sname;
		korean = skorean;
		english = senglish;
		math = smath;
	}

	// 매서드 정의 
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

	//총점을 반환하는 메서드 
	public int getTotal() {
		return korean+english+math;
	}
	
// 총점을 뜻하는 멤버변수가 없으니까 get으로 (get은 많이 쓴다 값을 읽어오는 걔념이니까)
//	public int getTotal() {
//		int sum = korean + english + math;
//		return sum;
//	}
	
	//평균 반환하는 메서드
	public double getAverage() {
		return getTotal() / 3.0; //또는 (double)getTotal/3
	}
	
//	public double getAverage() {
//	return (korean+english+math)/3;
//}
	
//	public int getAverage() {
//		int avg = (korean + english + math)/3;
//		return avg;
//	}
	
}
