// 추상 클래스 abstract class pg 281


public abstract class Computer {  //하나라도 추상메서드가 쓰여졌다면 추상클라스로 선언해주어야 한다. 추상클라스가 있다는건 안에 하위클라스들에게 영향을 주기 위한것.
	//public void display(); //문법오류 - 몸통이 없다.
	//public void typing();  //문법오류 - 몸통이 없다.
	
	public abstract void display(); // 추상 메서드
	public abstract void typing(); // 추상 메서드
	
	public void turnOn() {
		System.out.println("전원을 켠다.");
	}
	public void turnOff() {
		System.out.println("전원을 끈다.");
	}
}
