
public class DeskTop extends Computer {
	//�߻�Ŭ������ ��ӹ޾��� ��� �ݵ�� �߻� �޼��带 �ݵ�� ���� �ؾ���
	//��ӹ��� �ʿ����� ������ �������� 
	
	@Override // �� annotation�� �Ʒ��� ���뿡 ���� �ǹ̺ο� : �츮���ƴ� �����Ϸ����� �Ű���ּ����� �˷��ִ°�
	public void display() {
		System.out.println("DeskTop display");
	}
	
	
	@Override // �� annotation���Ʒ��� ���뿡 ���� �ǹ̺ο� : �츮���ƴ� �����Ϸ����� �Ű���ּ����� �˷��ִ°�
	public void typing() {
		System.out.println("DeskTop typing");
	}

}
   