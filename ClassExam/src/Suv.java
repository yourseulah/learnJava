// ��Ӱ� ������  pg233
// �θ�Ŭ�� Vehicle

public class Suv extends Vehicle {
	public Suv(String carName) {
		this.carName = carName;
	}
	
	public void move() {
		System.out.println(carName +" : ����� ����.");
	}
}
