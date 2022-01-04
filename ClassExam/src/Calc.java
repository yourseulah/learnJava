
//interface pg314


//interface는 처음만 접근제한자(public) 쓰고 안에서는 쓰지 않아도 된다. 
public interface Calc {
	double PI = 3.14;
	int ERROR = -99999;
	
	// 인터페이스는 메서드의 내용을 구현하지 않음
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	//그럼 어디서? 클라스에서 (보조기능을 연결해서 쓰는)
	
	
	
	
}
