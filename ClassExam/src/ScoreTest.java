
public class ScoreTest {

	public static void main(String[] args) {
		// 테스트 클래스 생성하여 2명 테스트
		
		Score s1 = new Score ();
		System.out.println(s1.getName());
		System.out.println(s1.getKorean());
		System.out.println(s1.getEnglish());
		System.out.println(s1.getMath());
		
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
		
		Score s2 = new Score ("철수", 80, 90, 100);
		System.out.println(s2.getName() + "의 국어점수: " + s2.getKorean() + " 영어점수: " + s2.getEnglish() + " 수학점수: " + s2.getMath());
		
		System.out.println("총점은" + s2.getTotal());
		System.out.println("평균점수는" + s2.getAverage());
		
		s2.setKorean(78);
		s2.setEnglish(96);
		s2.setMath(33);
		System.out.println(s2.getName() + "의 국어점수: " + s2.getKorean() + " 영어점수: " + s2.getEnglish() + " 수학점수: " + s2.getMath());
		s2.setAll(30, 30, 30);
		System.out.println(s2.getName() + "의 국어점수: " + s2.getKorean() + " 영어점수: " + s2.getEnglish() + " 수학점수: " + s2.getMath());
		
				
		Score s3 = new Score ("용복", 100, 100, 100);
		System.out.println(s3.getName() + "의 국어점수: " + s3.getKorean() + " 영어점수: " + s3.getEnglish() + " 수학점수: " + s3.getMath());
		
		System.out.println(s3.getTotal());
		System.out.println(s3.getAverage());
	}
}

