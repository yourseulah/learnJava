// ��Ӱ� ������  pg233
// �θ�Ŭ�� Vehicle

public class Truck extends Vehicle {
	public Truck(String carName) {
		this.carName = carName;
	}
	public void move() {
		System.out.println(carName + " : ���� �ƴ´�.");
	}
}
