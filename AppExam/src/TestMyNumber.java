// 2021/12/28
// 13-2 람다식 pg463

public class TestMyNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber max = (int x, int y) -> (x >= y ) ? x : y; // 인터페이스의 메서드 구현
		System.out.println(max.getMax(100, 200));
		
		//TestStringConcat 대신 pg467
		String s1 = "자바";
		String s2 = "프로그래밍";
		StringConcat concat = (x,y) -> System.out.println(x + y); 
		concat.makeString(s1,s2);
		
	}

}

