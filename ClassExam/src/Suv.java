// 상속과 다형성  pg233
// 부모클라스 Vehicle

public class Suv extends Vehicle {
	public Suv(String carName) {
		this.carName = carName;
	}
	
	public void move() {
		System.out.println(carName +" : 산길을 간다.");
	}
}
