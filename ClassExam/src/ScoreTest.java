
public class ScoreTest {

	public static void main(String[] args) {
		// �׽�Ʈ Ŭ���� �����Ͽ� 2�� �׽�Ʈ
		
		Score s1 = new Score ();
		System.out.println(s1.getName());
		System.out.println(s1.getKorean());
		System.out.println(s1.getEnglish());
		System.out.println(s1.getMath());
		
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
		
		Score s2 = new Score ("ö��", 80, 90, 100);
		System.out.println(s2.getName() + "�� ��������: " + s2.getKorean() + " ��������: " + s2.getEnglish() + " ��������: " + s2.getMath());
		
		System.out.println("������" + s2.getTotal());
		System.out.println("���������" + s2.getAverage());
		
		s2.setKorean(78);
		s2.setEnglish(96);
		s2.setMath(33);
		System.out.println(s2.getName() + "�� ��������: " + s2.getKorean() + " ��������: " + s2.getEnglish() + " ��������: " + s2.getMath());
		s2.setAll(30, 30, 30);
		System.out.println(s2.getName() + "�� ��������: " + s2.getKorean() + " ��������: " + s2.getEnglish() + " ��������: " + s2.getMath());
		
				
		Score s3 = new Score ("�뺹", 100, 100, 100);
		System.out.println(s3.getName() + "�� ��������: " + s3.getKorean() + " ��������: " + s3.getEnglish() + " ��������: " + s3.getMath());
		
		System.out.println(s3.getTotal());
		System.out.println(s3.getAverage());
	}
}

