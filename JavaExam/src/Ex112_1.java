
public class Ex112_1 {

	public static void main(String[] args) {
		// �⺻ ������ 
		int num1 = 90;
		int num2 = 70;
		int num3 = num1 + num2 ;
		System.out.println(num3);
		
		//������ ������ ���� num3
		num3 = num1 / num2;
		System.out.println(num3);
		
		//������ ����ȯ ������ �Ҽ����� ���� �������Ϸ��� �� double ���̾�� �Ѵ�
		double num4 = (double)num1/num2; // double = double + int
		System.out.println(num4);
		
		double num5 = num1/(double)num2; // double = int + double
		System.out.println(num5);
		
		double num6 = (double)num1/(double)num2;// double = double + double
		System.out.println(num6);
		
		//�ʹ� ���ҷ��� �ߴٰ� ��ģ���̽�, �ɽ��ÿ� ���� ���ظ� ���Ѱ�
		double num7= (double)(num1/num2);
		System.out.println(num7);		
		
		int num8 = 10;
		System.out.println("num8 : " + num8);
		++num8; 	// num8 = num8 + 1 ; ��������
		System.out.println("num8 : " + num8); 
		num8++;     // ��������
		System.out.println("num8 : " + num8);
		
		// ��������� �������� �ܵ����� ���϶� ���� ����.
		//������ ���� �����Ϸ��� �Ҷ� �޶���. �����Ϸ��� �Ҷ� ���������� �����ؾ��Ѵ�. ������ �����. 
		int num9 = 10; // 
		int num10 = ++num9; // �������� num9 ������ ���� ���� 1 ������Ű�� num10�� ���� 
		System.out.println("num10 : " + num10) ; 
		
		int num9a = 10 ; // num9a�� 10�� �ִ�. ���ԵǾ� �ִ�. �����ʿ� �ִ°��� �����Ѵ�.
		int num11 = num9a++; // �������� num9a ������ ���� ���� �࿡�� 1������Ű��, �����࿡���� �������� ����
		System.out.println("num11 : " + num11) ; 
		num9a++;
		System.out.println(num9a);
		num9a++;
		System.out.println(num9a);
		num9a++;
		System.out.println(num9a);
	
		//���� ���������� �Ҿ��ؼ� ���������� ���� ���� ����.
		
		int num12 = 27;
		boolean b1 = (num12 > 25) ; // ũ�� ���� ����� ��, ���� (true or false)
		System.out.println("b1�� " + b1) ;
		
		boolean b2 = (5 > 3) && !(5 < 2) ; //�� && ��, And����, ����   
		System.out.println("b2 :" + b2);
		
		boolean b3 = (5 > 3) || (5 < 2) ; 
		System.out.println("b3 :" + b3);
		
		num1 = 10 ;
		int i = 2;
		
		boolean b4 = ((num1 = num1 + 10) < 10) && ((i = i + 2)<10) ; // ���� && �� 
		System.out.println("b4 :" + b4);
		System.out.println("i : " + i);	
		
		int num14 = 10 ;
		num14 += 2 ; // ��� , ���մ��Կ�����, �Ϲ� : num14 = num14 + 2 
		System.out.println("num14 : " + num14);
		
//		// �Ʒ� 4�� ���๮�� ��� ���� 
		num14++;
		++num14;
		num14 = num14 + 1;
		num14 += 1;
		
		char ch = (45 > 47) ?  'T' : 'F' ; // ���� �Ǵ� ���� ������ 
		System.out.println("ch : " + ch);
				
		int num = 10;
		boolean isEven;
		isEven = (num %2)==0 ?  true : false ;
		System.out.println("isEven : " + isEven);
		
		int num15 = 10;
		char isEvenn;
		isEvenn = (num15 %2)==0 ? 'E' : 'O'; 
		System.out.println("isEvenn : " + isEvenn);
		
		num <<=2 ; // num = num << 2 
		System.out.println(num);
		num >>=2 ; // num = num >> 2;
		System.out.println(num);
	}

}
