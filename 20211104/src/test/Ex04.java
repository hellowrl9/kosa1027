package test;

public class Ex04 {

	public static void main(String[] args) {
		// �Ǽ��� ���ͳ� : 0.3, 20,4, ...
		// �Ҽ����� ������ �ִ� ���� �Ǽ���� �Ѵ�
		float f; //4����Ʈ : ���е� ����
		double d; //8����Ʈ : ���е� ����
		// �Ǽ��� �⺻ ũ��� 8����Ʈ
		d = 0.1234567890123456789;
		f = 0.1234567890123456789f;
		System.out.println(d); //�Ҽ��� 18�ڸ����� ���� -> ���е� ����
		System.out.println(f); //�Ҽ��� 9�ڸ����� ���� -> ���е� ����
		boolean b = true;
		boolean b1 = false;
		String str = "true"; // ""�̸� ���ڿ�, bool type �ƴ�
		// b = true : ���̽��� True �빮�ڷ� ���µ�, �ڹٴ� �ҹ��ڷ� ��� ��
		System.out.println(b);
		System.out.println(b1);
		System.out.println(str);
	}
}
