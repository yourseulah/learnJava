
public class Ex112_1 {

	public static void main(String[] args) {
		// 기본 연산자 
		int num1 = 90;
		int num2 = 70;
		int num3 = num1 + num2 ;
		System.out.println(num3);
		
		//직전에 실행한 값이 num3
		num3 = num1 / num2;
		System.out.println(num3);
		
		//묵시적 형변환 왼쪽을 소수점을 남는 연산을하려면 꼭 double 형이어야 한다
		double num4 = (double)num1/num2; // double = double + int
		System.out.println(num4);
		
		double num5 = num1/(double)num2; // double = int + double
		System.out.println(num5);
		
		double num6 = (double)num1/(double)num2;// double = double + double
		System.out.println(num6);
		
		//너무 잘할려고 했다가 망친케이스, 케스팅에 대해 이해를 못한거
		double num7= (double)(num1/num2);
		System.out.println(num7);		
		
		int num8 = 10;
		System.out.println("num8 : " + num8);
		++num8; 	// num8 = num8 + 1 ; 전위연산
		System.out.println("num8 : " + num8); 
		num8++;     // 후위연산
		System.out.println("num8 : " + num8);
		
		// 전위연산과 후위연산 단독으로 쓰일때 차이 없다.
		//하지만 뭔가 저장하려고 할때 달라짐. 저장하려고 할때 후위연산을 주위해야한다. 시차가 생긴다. 
		int num9 = 10; // 
		int num10 = ++num9; // 전위연산 num9 변수의 값을 먼저 1 증가시키고 num10에 저장 
		System.out.println("num10 : " + num10) ; 
		
		int num9a = 10 ; // num9a에 10이 있다. 대입되어 있다. 오른쪽에 있는것을 저장한다.
		int num11 = num9a++; // 후위연산 num9a 변수는 값을 다음 행에서 1증가시키나, 현재행에서는 증가되지 않음
		System.out.println("num11 : " + num11) ; 
		num9a++;
		System.out.println(num9a);
		num9a++;
		System.out.println(num9a);
		num9a++;
		System.out.println(num9a);
	
		//따라서 후위연산은 불안해서 전위연산을 좀더 많이 쓴다.
		
		int num12 = 27;
		boolean b1 = (num12 > 25) ; // 크기 비교의 결과는 참, 거짓 (true or false)
		System.out.println("b1은 " + b1) ;
		
		boolean b2 = (5 > 3) && !(5 < 2) ; //참 && 참, And연산, 논리곱   
		System.out.println("b2 :" + b2);
		
		boolean b3 = (5 > 3) || (5 < 2) ; 
		System.out.println("b3 :" + b3);
		
		num1 = 10 ;
		int i = 2;
		
		boolean b4 = ((num1 = num1 + 10) < 10) && ((i = i + 2)<10) ; // 거짓 && 참 
		System.out.println("b4 :" + b4);
		System.out.println("i : " + i);	
		
		int num14 = 10 ;
		num14 += 2 ; // 등가식 , 복합대입연산자, 일반 : num14 = num14 + 2 
		System.out.println("num14 : " + num14);
		
//		// 아래 4개 실행문은 모두 동일 
		num14++;
		++num14;
		num14 = num14 + 1;
		num14 += 1;
		
		char ch = (45 > 47) ?  'T' : 'F' ; // 조건 또는 삼항 연산자 
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
