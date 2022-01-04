import java.util.*;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 클라스 상속 테스트
		//Customer cus = new Customer(); //부모(상위)클래스 객체 생성 
		//VIPCustomer vip = new VIPCustomer(); //자식(하위)클래스 객체 생성
		//System.out.println(vip.bonusPoint); //상위클래스 멤버변수 사용가능 
		//System.out.println(vip.customerID); //상위 클래스 멤버변수를 protected로 선언되었을 경우 접근 가능 
		ArrayList<Customer> customerList = new ArrayList<Customer>(); //ArryaList가 오류로 뜰건데 상단에 import java.util* 추가
		Customer a1 = new Customer(1001, "이순신");
		Customer a2 = new Customer(1002, "신사임당");
		Customer a3 = new GoldCustomer(1003, "홍길동");
		Customer a4 = new GoldCustomer(1004, "이율곡");
		Customer a5 = new VIPCustomer(1005, "김유신", 1234);
		customerList.add(a1);
		customerList.add(a2);
		customerList.add(a3);
		customerList.add(a4);
		customerList.add(a5);
		
		System.out.println("============기본정보=============");
		for(int i = 0; i < customerList.size(); i++	) {
			Customer abc = customerList.get(i); // 주어진 인덱스로 객체 반환 
			System.out.println(abc.showCustomerInfo());
		}
		// : 오른쪽에 있는 애를 왼쪽으로 뽑아온다. item은 계속 덮어써지니까 갱신되니까 
		System.out.println("============기본정보=============");
		for(Customer item : customerList) { //downcasting?
			System.out.println(item.showCustomerInfo());
		}
		
		System.out.println("=========고객마다의 price=========");
		int price = 10000; 
		for(Customer item: customerList) { //item 지역변수
			int cost = item.calcPrice(price); //금액은 반환되고 보너스는 내부에 적립
			System.out.println(item.getCusotmerName() + "금액 : " + cost);
		//이름만 뽑아쓰기 위해서 Customer클라스에 get set 입력 	
	
		}

		System.out.println("========고객 마다의 등급과 price =======");
		for(Customer item : customerList) { 
			System.out.println(item.showCustomerInfo());
		}
	}

}























