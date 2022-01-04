

public class Animal {
	//속성 정의
	String name; //동물이름
	int	weight; //크기(몸무게)
	int speed; //달리는 속도

	//디폴트 (동물), 매개변수 1개 : 동물 이름, 크기(30~200), 속도는 디폴트로 설정
	public Animal() {
		name = "동물";
		weight= 30;
		speed = 0;
	}
	
	//생성자 (클래스명과 동일, 반환타입 없음(return도 없음), 나머지는 메서드 정의 방법과 동일)
	//오버로딩된생성자 (매개변수 1개: 동물이름)
	public Animal(String aName) { //매개변수 있는 생성자 
		name = aName;
	}
	
	//오버로딩된생성자 (매개변수 2개: 동물이름, 크기)
	public Animal(String aName, int aWeight) { //매개변수 있는 생성자 
		name = aName;
		weight = aWeight;
	}
	
	//메서드 정의
	// get set 정의 각각 -- !!!!! 진짜 중요 !!!!!
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	public void setWeight(int aWeight) {
		weight = aWeight;
	}
	public void setSpeed(int aSpeed) {
		speed = aSpeed;
	}
	
	
	//달리는 속도 증가(기본 증가(10), 주어진 값 증가) : 0 ~ 100 사이만 가능
	
	public void speedUp() {
		if (speed + 10 >100) { // 현재 속도에 추가될 속도를 덧셈해서 100보다 큰지 확인
			speed = 100;
		} else {
			speed += 10;
		}
	}
	
	public void speedUp(int aSpeed) {
		if (speed + aSpeed > 100) { // 현재 속도에 추가될 속도를 덧셈해서 100보다 큰지 확인
			speed = 100;
		} else {
			speed += aSpeed;
		}
	}
	
//	public int speedUp() {
//		  if (0 <= speed && speed <= 100) { //연산자 활용
//				speed += 10;
//				return speed;
//			}
//			else {
//				System.out.println("error");
//				return speed;
//			}
//		}
	
	// get 이나 set은 특별한 경우에 쓰는게 좋다.
	public void setSpeedUp () {
		if (speed + 10 > 100) { //이게 100 이 넘으면 밑으로 내려가서 
			speed = 100 ; //무조건 100으로 
		}
		else { //아니면 
			speed += 10; //기본증가
		}
	}
	
//	public void SpeedUp (int pSpeed) {
//		if (speed + pSpeed >100) {
//			speed = 100;
//		}
//		else {
//			speed += pSpeed;
//		}
//	}

	//달리는 속도 감소(기본 감소(10), 주어진 값 감소) : 0 ~ 100 사이만 가능
	public void speedDown () {
		if (speed - 10 < 0) {
			speed = 0;
		}
		else {
			speed -= 10;
		}
	}
	
	public void speedDown (int aSpeed) {
		if (speed - aSpeed < 0) {
			speed = 0;
		}
		else {
			speed -= aSpeed;
		}
	
	}
}