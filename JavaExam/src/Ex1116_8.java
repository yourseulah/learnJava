
public class Ex1116_8 {

	public static void main(String[] args) {
		// 1 ~ 10���� ¦���� ��  (��� ���Ѿ���), while, do ~ while ����
		int num = 0 ; // 2�� �����ص� ��. 0�� ���ϳ������ϱ� 
		int sum = 0 ;
							
		do { 
			sum += num ;
			System.out.println(sum + "============" + num);
			num += 2 ;
		} while (num <= 10); {
		System.out.println(sum + "========" + num);
		}
		
		// �Ǵ�
		
		do { 
			if (num%2 == 0) { // ¦��
				sum += num ;  // ����		
			}
			num++;
		} while (num <= 10);
		System.out.println(sum + "========" + num);
		}
	}

