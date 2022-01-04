
public class DeskTop extends Computer {
	//추상클래스를 상속받았을 경우 반드시 추상 메서드를 반드시 구현 해야함
	//상속받은 쪽에서는 보통의 문법으로 
	
	@Override // 이 annotation은 아래쪽 내용에 대한 의미부여 : 우리가아닌 컴파일러한테 신경써주세요라고 알려주는것
	public void display() {
		System.out.println("DeskTop display");
	}
	
	
	@Override // 이 annotation은아래쪽 내용에 대한 의미부여 : 우리가아닌 컴파일러한테 신경써주세요라고 알려주는것
	public void typing() {
		System.out.println("DeskTop typing");
	}

}
   