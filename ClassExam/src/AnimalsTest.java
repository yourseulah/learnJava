
import java.util.*;

// 20211203 pg 259 다형성 pg275

class Animals { // 파일명과 동일한 클라스는 public 나머지는 public X 
	public void move() {
	System.out.println("동물이 움직입니다.");
	}

}
class Human extends Animals { // Animals 클라스 상속 	
	public void move() {  //move 메서드 오버라이딩 (overriding)
		System.out.println("사람이 움직입니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽는다.");
	}
}
	
class Tiger extends Animals { // Animals 클라스 상속 
	public void move() {  //move 메서드 오버라이딩 (overriding)
		System.out.println("호랑이가 움직입니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다.");
	}
}

class Eagle extends Animals { // Animals 클라스 상속 		
	public void move() {  //move 메서드 오버라이딩 (overriding)
		System.out.println("독수리가 움직입니다.");
	}
	public void flying() {
		System.out.println("독수리가 날아간다.");
	}
}

public class AnimalsTest { // 파일명과 동일한 클라스는 public 나머지는 public X 
	public static void main(String[] args) {
		AnimalsTest aTest = new AnimalsTest () ;
		//인라인으로 생성
//		aTest.moveAnimal(new Human()); 
//		aTest.moveAnimal(new Tiger());
//		aTest.moveAnimal(new Eagle()); // 객체. 메서드
		
		
		//이렇게 하면 배열을 할수가 없다. 타입이 같아야 하는데 Human, Eagle, Tiger 다 다르니까
//		Human a1 = new Human(); 
//		Tiger a2 = new Human(); 
//		Eagle a3 = new Human(); 
		
		Animals[] animalArr = new Animals[10]; // 배열객체생성 Human, Tiger, Eagle을 통합시켜서 할수 있다.
		for (int i = 0; i < 10; i++) {
			animalArr[i] = new Human();
		}
		
		for (int i = 3; i < 10; i++) {
			animalArr[i] = new Tiger();
		}
		
		for (int i = 5; i < 10; i++) {
			animalArr[i] = new Eagle();
		}
		
		// move 메서드 호출
		for (int i = 0 ; i < animalArr.length; i++) {
			//animalArr[i].move();
		}
		
//		for(int i = 5; i < 10 ; i++) {
//		aTest.moveAnimal(animalArr[i]);
//	}
			
		//-----------------------------------------
		ArrayList<Animals> aniList = new ArrayList<Animals>();
		aniList.add(new Human()); // 객체 생성하면서 배열에 추가
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		for (Animals item : aniList) {// 향상된for문 오른쪽 배열객체 왼쪽이 
			//anilist에 3개가 들어있으니까 3개가 출력될거임
			item.move(); //다형성에 의해 각각의 메서드 호출 
			// upcasting 되어있어서 item.readBook(), hunting, flying으로는 출력할수 없다.
		}
		
		//각각의 목적에 맞게 반복구문을 활요하여 출력할수 있게됨.
		for (int i = 0; i < aniList.size(); i++) {
			Animals item = aniList.get(i);
			if (item instanceof Human) { //상위의 객체로 포장되어 있는데 그안에 뭐가 있는지 모르니까 다운캐스팅을 해야햔다 근데 그 안에 class 타입을 찾으려고 instanceof를 사용 
				Human h= (Human)item; //downcasting 다시돌아왔기 대문에 
				h.readBook(); //downcasting 되었으므로 독립된 메서드 사용가능
			} else if (item instanceof Tiger) {
				Tiger t = (Tiger)item;
				t.hunting();
			} else if (item instanceof Eagle) {
				Eagle e = (Eagle)item;
				e.flying();
			} else {
				System.out.println("알수 없는 오류입니다");
			}
		}
		
		
		//---------------------------------------------
	
	}	//end main
	
	public void moveAnimal (Animals animal) {
		animal.move(); //다형성, 실제로 다른 일을 실행 루프를 돌릴수있다는 장점이 있다.
	}

	
	
	
}	
	