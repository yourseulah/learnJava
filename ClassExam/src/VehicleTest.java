import java.util.*;


public class VehicleTest {

	public static void main(String[] args) {
		// ArrayList 사용
		ArrayList<Vehicle> vList = new ArrayList<Vehicle>();// 각종 객체를 저장할 배열
		Vehicle v1 = new Sedan("티코"); //생성자 생성 했을때 매개변수를 하나넣는걸로 만들었으니까
		Vehicle v2 = new Suv("코나");
		Vehicle v3 = new Truck("봉고");
		Vehicle v4 = new Sedan("마티즈");
		Vehicle v5 = new Truck("뭐가있지");
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		//아래와 같이 생성 후 추가해도 됨
		//vList.add(new Sedan()); 9라인 또는 12라인과 동일
		for (Vehicle v : vList ) { //향상된 for 구문
			v.move(); //각각의 객체에 맞게 호출됨(다형성)
			
		}
		
		
	}

}
