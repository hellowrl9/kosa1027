package test;

public class Ex05 {

	public static void main(String[] args) {
		// ����ȯ
		// �ڵ� ����ȯ : ���� �ڷ����� ū �ڷ������� ��ȯ�ϴ� ��
		// 1byte -> 2byte -> 4byte -> 8byte
		// 1byte -> 8byte, 1byte - > 4byte
		// ���� -> �Ǽ�
		short sh = 30000;
		int i = sh; // �ڵ�����ȯ : ���� -> �Ǽ�
		float f = sh; // �ڵ�����ȯ
		System.out.println(i);
		System.out.println(f);
		double d = sh;
		System.out.println(d);
		// ���� ����ȯ : ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ� ��
		// �Ǽ� -> ����, ū �� -> ���� ��
		double d1 = 174.5;
		float f1 = 174.5f; //float�̴ϱ� �ڿ� f�� ��
		int i1 = (int)f1; //�ٷ����� ū ���� ������ ���� ������ �� 
		//�Ǽ��� ������ �ٲٸ�, �Ҽ��� ���ϸ� �߶� ������ ������ ��
		//�Ǽ��� �������� ŭ
		System.out.println(i1);
		i1 = (int)d1; // �Ǽ� -> ����
		System.out.println(i1);
		int i2 = 2100000000;
		short sh1 = (short)i2; //ū �� -> ���� ��
		System.out.println(sh1);
		//ū ���� ���� ������ ��ȯ�ϸ� �����÷ο찡 �߻��Ͽ� ���� �޶��� �� �ִ�
		//�����÷ο�� ������ �ȴ�
		int i3 = 32000;
		short sh3 = (short)i3;
		System.out.println(sh3);
		//�ٷ� ��ó�� �ϸ� �����÷ο찡 �߻����� �ʴ´�
		//�����÷ο찡 �߻��� ���� �޶����� �ʵ��� Ÿ�� ������ ��������
	}

}
