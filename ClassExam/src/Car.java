
public class Car { //Car를 객체로 만들려고 하는것
	// 차명, 속도를 멤버변수 로 지정
	String carname;
	int carspeed;

	//차명으로 생성가능
	public Car(String pCarName) {
		carname = pCarName;
	}
	
	// 차명, 속도로 생성가능
	public Car(String pCarName, int pCarSpeed) {
		carname = pCarName;
		carspeed = pCarSpeed;
	}
	
	// 매개변수 없이 생성가능 (디폴트) - 생성자만 꼭 필요하다
	// 디폴트로 생성했을 경우 기본값 저장 ('자동차', 150)
	public Car () {
		carname = "자동차";
		carspeed = 150;
	}
		
	// 생성이 먼저 되어야 하기 메서드 - 호출 이 가능
	// get Car 입장에서 주는거 그래서 return값을 갖고 있다. CarText 입장에서 가져오는거  
	// set Car 입장에서 저장하는거. 가져오는게 없어서 void. CarText입장에서는 저장을 요구하는것. 
	// 차명, 속도 각각 읽기 get
	public String getCarName() {
		return carname;
	}
	
	public int getCarSpeed() {
		return carspeed;
	}
	
	// 차명, 속도 각각 저장 set
	public void setCarName(String pCarName) {
		carname= pCarName;
	}
	public void setCarName (int pCarSpeed) {
		carspeed = pCarSpeed;
	}
	
	// 차명, 속도 동시 변경 set 
	public void setCar(String pCarName, int pCarSpeed) {
		carname = pCarName;
		carspeed = pCarSpeed;
	}
	
	// 주어진 값으로 속도 증가
	public void setSpeedUp(int pCarSpeed) {  
		carspeed += pCarSpeed; //carspeed = pCarSpeed + carspeed
	}
	
//	or  - return 하는걸 위에 만들어 줬으니까 굳이 또 return 해주지 않아도 됨. 창구 단일화/ 일관성 
//	public int setSpeedUp(int pCarSpeed) {
//		carspeed += pCarSpeed; //carspeed = pCarSpeed + carspeed
//		return carspeed; 
//	}
	
	// 주어진 값으로 속도 감소 
	public void setSpeedDown(int pCarSpeed) {
		carspeed -= pCarSpeed;
	}

	//별도의 클래스에서 객체생성하고 테스트 (5개)
		

}