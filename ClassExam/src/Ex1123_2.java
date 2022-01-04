
public class Ex1123_2 {

	public static void main(String[] args) { // main메서드부터 시작 
		
		// 첫번째 객체 생성 및 테스트 
		// 인스턴스 생성해야 클래스 사용가능
		// 클래스명 변수명 = new 생성자
		// 디폴트 생성자는 클래스명과 동일하며 매개변수 없음
		Ex1123_1 cal1 = new Ex1123_1(); // new로 꼭 먼저 생성한다. 디폴트 생성자로 인스턴스 생성 (cal1이라는 객체 생성)
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		System.out.println(cal1.add(10, 20)); //or
		int test = cal1.add(1, 2);//결과가 test에 반환
		System.out.println(test);
		
		//곱셈 테스트 
		System.out.println(cal1.product (5,10));
		System.out.println(cal1.num1);
		System.out.println(cal1.num2);
		System.out.println(cal1.result);
		
		// 두번째 객체 생성 및 테스트 
		Ex1123_1 cal2 = new Ex1123_1(3,5); // 객체 생성 (인스턴스 생성)
		System.out.println(cal2.add()); //호출과 동시에 출력
		System.out.println(cal2.subtract());
		System.out.println(cal2.product());
		System.out.println(cal2.divide());
		System.out.println(cal2.add(6,7));
		
		// 세번째 객체 생성 및 테스트 
		Ex1123_1 cal3 = new Ex1123_1(10, 5);
		// 10 + 5 = 15
		System.out.println(cal3.getNum1() + cal3.getNum2());
		System.out.println(cal3.getNum1() + "+" + cal3.getNum2() + "=" + cal3.add());
		// cal3.num1 이렇게 써도 되는데 나중에 멤버변수를 막을거라서 예) private int num1 나중에 멤버변수를 직접건드리게 되면 통제를 못하고 오류가 생길수 있다. 
		
		// 네번째 객체 생성 및 테스트
		// 디폴트 생성자로 생성 후 매개변수 (9, 10) 추가하고 곱셈 출력 테스트 
		Ex1123_1 cal4 = new Ex1123_1();
		cal4.setNum1(9);
		cal4.setNum2(10);
//		cal4.setNum3(9, 10);
		System.out.println(cal4.getNum1() + "*" + cal4.getNum2() + "=" + cal4.product());
		
		}
		
	}


