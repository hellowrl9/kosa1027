package WrapperExample;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = 100; //�ڽ�(boxing), ������
		int i1 = 1; //Integer => int : ��ڽ�
		int i2 = 20;
		//           �ڵ� ��ڽ� : �ڵ� ����ȯ�� ��
		int result = i + i2;
		
//		Integer i3 = new Integer(10);
//		Integer i4 = new Integer("10");
		Integer i5 = Integer.valueOf("300");
		Integer i6 = 10;
		
		int i7 = i6; //�ڵ� ��ڽ�
		i7 = i6.intValue(); //��ڽ� /��ó�� ��밡���ϱ� ������ �̰�ó���� �� �ʿ�� ����(�� ���� ����)

		int i8 = 10;
		Integer i9 = 10;
		i9 = i8;
		i8 = i9;
	}
}
