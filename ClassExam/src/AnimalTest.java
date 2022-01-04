
public class AnimalTest {

	public static void main(String[] args) {
		// 클래스 생성하여 테스트 (사자, 호랑이, 코끼리, 기린 ...)
	
		Animal a1 = new Animal (); //디폴트 생성
		System.out.println(a1.getName());
		System.out.println(a1.getWeight());
		System.out.println(a1.getSpeed());
		System.out.println(a1.getName() + "의 몸무게는 " + a1.getWeight() + "이고, 속도는" + a1.getSpeed() + "이다");
		
		a1.setName("사자");
		a1.setWeight(150);
		a1.setSpeed(20);
		System.out.println(a1.getName() + "의 몸무게는 " + a1.getWeight() + "이고, 속도는" + a1.getSpeed() + "이다");
		
		Animal a2 = new Animal ("호랑이");
		a2.setWeight(200);
		a2.setSpeed(30);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는" + a2.getSpeed() + "이다");
		
		a2.speedUp(300);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는" + a2.getSpeed() + "이다");
		a2.speedDown(120);
		System.out.println(a2.getName() + "의 몸무게는 " + a2.getWeight() + "이고, 속도는" + a2.getSpeed() + "이다");
		
		
//		Animal a3 = new Animal ("코끼리", 300);
//		System.out.println(a3.getName() + "의 몸무게는 " + a3.getWeight() + "이고, 속도는" + a2.getSpeed() + "이다");
		
	}
}
