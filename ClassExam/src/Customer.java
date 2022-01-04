
public class Customer {
// 11/30 상속이란 pg 232 - 234  ====   12/30 pg 262
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//디폴트 생성자
	public Customer() {	
		intiCustomer();
	}
	
	//오버로딩된 생성자 
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName; 
		intiCustomer();
	}
	
	//CustomerTest1에 이름만가져다쓰기 위해서 get set 입력 
	public String getCusotmerName() {
		return customerName;
	}

	
	// 생성자에서 사용할 메서드
	private void intiCustomer() {  // public 대신 private으로 해줘도 상관없음 - 문법적으로 외부에서 접근 불가능하도록
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //bonusPoint 업데이트, 가격반환 
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + ":" + customerGrade + ":" + bonusPoint;
		
	}
}
