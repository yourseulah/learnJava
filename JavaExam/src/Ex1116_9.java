
public class Ex1116_9 {

	public static void main(String[] args) {
		// for�� �̿� 1 ~ 10 ������ ������
		int i = 1 ;
		int sum = 0 ;
		for (i=1; i <=10  ; i++ ) { // ������ ������ ++i , i=i+1, i+=1 �ٰ���
			sum +=i;
		}
		System.out.println(sum+ "========" + i);
	
	//��� ���Ϸ��� i���� 1�� �����Ѵ�. i++�̶�

	//1 ~ 10 ���� Ȧ���� ��
		sum = 0 ;
		for (i=1; i<=10 ; i+=2) {
			sum += i ;
		}
		System.out.println(sum+ "========" + i);
	
	//1 ~ 10 ���� Ȧ���� ��, if Ȱ��
		sum = 0 ;
		for (i=1; i<=10 ; i++) {
			if (i%2 == 1) {
			sum += i ;
			}
		}
		System.out.println(sum+ "========" + i);
	
	// 1 ~ 10 ���� ¦���� ��
		sum = 0 ;
		for (i=2; i<=10 ; i+=2) {
			sum += i ;
		}
		System.out.println (sum+ "========" + i);		
		
    // 1 ~ 10 ���� ¦���� ��, if 
		sum = 0 ;
		for (i=2; i<=10 ; i++) {
			if (i%2 == 0) {
			sum += i ;
			}
		}
		System.out.println (sum+ "========" + i);

	//1 ~10 ���� ���
			
		while (i <= 10) {
			i++ ;
			System.out.println(i) ;
		}
		
		for (i=1 ; i <= 10 ; i++) {
			System.out.println(i) ;
		}
		
	}
	
	}
	