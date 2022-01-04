

//클라스에서 여러개의 인터페이스 구현 가능 - 여기가 중요한 부분
public class Calculator implements Calc {
	//Calc 인터페이스의 모든 메서드를 반드시 구현해야함 - 구현해라 == 몸통을 작성해라
	public int add(int num1, int num2) { //빈껍데기
		
		return num1 + num2;
	}
	
	public int substract(int num1, int num2) { 
		return num1 - num2;
	}
	
	public int times(int num1, int num2) { 
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) { 
		if (num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
		//모호한 부분이 있으면 절때 안됨 - 둘중에 하나가 꼭 나와야 함
	}
	
}
