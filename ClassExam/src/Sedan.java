
// 상속과 다형성  pg233
// 부모클라스 Vehicle
public class Sedan extends Vehicle {
	public Sedan(String carName) { //생성자
		this.carName = carName;
	}
	public void move() {
		System.out.println(carName + " : 조용하게 움직인다.");
	}
}
