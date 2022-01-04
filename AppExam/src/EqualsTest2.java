
public class EqualsTest2 {

	public static void main(String[] args) {
		Student st1 = new Student(100, "홍길동");
		Student st2 = new Student(100, "홍길동");
		//System.out.println("연산자비교 : " + (st1 == st2)); // 주소비교 & hashcode 비교 (메모리) - 주소가 다르면 해시코드도 다르다 다름은 나타다는 문자열집합
		//System.out.println("메서드비교 : " + st1.equals(st2)); // 주소비교 & hashcode 비교
		
		Student st3 = st1 ; //객체복사 - 같은 메모리를 나타내므로 
		//System.out.println("연산자비교 : " + (st1 == st3)); // 주소비교 & hashcode 비교 - 복사한것이니까 주소 같다 
		//System.out.println("메서드비교 : " + st1.equals(st3)); // 주소비교 & hashcode 비교
		//따라서 객체를 복사하는 방식으로 하는 건 주의할 필요가 있다. 
		
		
		// 스트링 클라스는 다른 일반클라스와 다르게  -- 이부분 다시 확인 필요! 
		String s1 = new String("호랑이");
		String s2 = new String("호랑이");
		//같은 문자열 비교할 경우 
		System.out.println("연산자비교 : " + (s1 == s2)); // 주소비교 - 객체가 별도로 생성된 거니까 주소는 다르다
		System.out.println("메서드비교 : " + s1.equals(s2)); // 문자열 내용 비교 - 같다
		
		String s3 = s1 ; // 문자열 복사 (메모리도같고 다 같음)
		System.out.println("연산자비교 : " + (s1 == s3)); // 주소비교 - 복사한것이니까 주소 같다 
		System.out.println("메서드비교 : " + s1.equals(s3)); // 문자열 내용 비교 - 같다
		
		//문자열 비교할때는 (내용비교할때는) 무조건 equals로 
		
		
		// 2021/12/24  
		// 11-2 String 클래스 pg369
		String s4 = "이순신"; //객체생성 (상수풀에 저장)
		String s5 = "이순신"; //객체생성 (상수풀에 저장)
		System.out.println("연산자비교 : " + (s4 == s5)); // 주소비교
		System.out.println("메서드비교 : " + s4.equals(s5)); // 문자열내용비교 
		//객체가다르지만 같은 주소를 쓰고 있다. - 상수 풀 constant pool - 기억장소낭비를 줄이기 위해 
		// 연산자는 왠만해서 쓸일이 없다. 
		
		
		//✔ CBV, CBR 알아두기 (함수 호출방식)
		//CBV(Call by Value): 기본적으로 대상에 주소값을 가지지 않는것으로, 값을 할당받는 형태로 사용.
		//ex) int(4), float(4), double(8), byte(1), short(2), long(8), char(2), boolean(1) 등 primitive type에 해당함.
		//CBR(Call by Reference): 대상을 선언했을 때, 주소값을 할당받으므로, == 연산자로는 주소값이 달라 모두 false가 나오므로 비교할 수 없지만 
		// equals와 같이 해당 주소에 있는 값에 대한 비교 연산은 가능함.
		//ex) String, Array, Date, file, Class, Object가 해당됨 

		// CBV(기본자료형)는 stack메모리에 실제 값을 저장하기 때문에 비교연산 가능.
		// CBR(참조자료형)은 stack에는 메모리 주소만 저장하고, 실제 값은 heap영역에 저장하기 때문에 equals로 비교 연산 가능
		
		
		// 11-3 Wrapper 클래스  pg375
		String svalue = "100"; // 문자열, 연산 불가, 따라서 String svalue = "10k0"이렇게 못함 parsing을 하면서 이게 문자인지 숫자인지 다 확인. 그래서 정수연산이든 실수연산에서돌리면 에러나옴. 
		//Integer ivalue = new Integer (svalue); //문법에러는 없지만 이방식으로 생성하지 않음
		// int ivlaue = (int)svalue; // string은 이런식으로 형변환 할수 없다
		
		int ivalue = Integer.parseInt(svalue); // 결합: 매개변수는 정수형태의 문자열 
		System.out.println(ivalue + 1); // 연산: 정수연산
	
		double dvalue = Double.parseDouble("3.14"); //결합: 문자열을 double로 
		System.out.println(dvalue + 10); //연산 : 실수연산
		
		//Wrapper : 정수로 감싸겠다 실수로 감싸겠다 
		
		
	}

}
