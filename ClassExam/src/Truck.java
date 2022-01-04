// 상속과 다형성  pg233
// 부모클라스 Vehicle

public class Truck extends Vehicle {
	public Truck(String carName) {
		this.carName = carName;
	}
	public void move() {
		System.out.println(carName + " : 짐을 싣는다.");
	}
}
