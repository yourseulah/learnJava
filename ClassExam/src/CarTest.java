
public class CarTest {

	public static void main(String[] args) {
		// Car 클라스 테스트
		Car c1 = new Car ();
		Car c2 = new Car ("Bubblebee");
		Car c3 = new Car ("Mercedes", 100);
					
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarSpeed());
		System.out.println("차이름 :" + c1.getCarName() + ", 속도 : " + c1.getCarSpeed());
		
		System.out.println(c2.getCarName());
		System.out.println(c2.getCarSpeed());
		
		// 이미 만들어진 객체 수정/갱신할때 바로 객체이름으로 입력가능
		c1.setCar("tico", 60); //호출
		System.out.println(c1.getCarName());
		System.out.println(c1.getCarSpeed());
		
		c3.setCar("audi", 120); //호출
		System.out.println("차이름 :" + c3.getCarName() + ", 속도 : " + c3.getCarSpeed());
	
		c3.setSpeedUp(50); //호출
		System.out.println(c3.getCarSpeed());	
		
		c3.setSpeedDown(50); //호출
		System.out.println(c3.getCarSpeed());	
	
	}

}
