

//Ŭ�󽺿��� �������� �������̽� ���� ���� - ���Ⱑ �߿��� �κ�
public class Calculator implements Calc {
	//Calc �������̽��� ��� �޼��带 �ݵ�� �����ؾ��� - �����ض� == ������ �ۼ��ض�
	public int add(int num1, int num2) { //�󲮵���
		
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
		//��ȣ�� �κ��� ������ ���� �ȵ� - ���߿� �ϳ��� �� ���;� ��
	}
	
}
