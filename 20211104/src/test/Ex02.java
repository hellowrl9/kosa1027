package test;

public class Ex02 {
	public static void main(String[] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		//b = -129;
		//b = 128;
		char ch = 0;
		System.out.println(ch);
		ch = 65535;
		System.out.println(ch);
		ch = 65; //�빮�� A
		System.out.println(ch);
		ch = 97; //�ҹ��� = �빮�� + 32
		System.out.println(ch);
		ch = 'A' + 32;
		System.out.println(ch);
		//char�� ���ڸ� ��Ÿ���� �ڷ���
		ch = '��';
		System.out.println(ch);
		System.out.println((int)ch);
		ch = 44032;
		short sh = -32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		//sh = -32769;
		//sh = 32768;
		int i = -2147483648;
		System.out.println(sh);
		i = 2147483647;
		System.out.println(sh);		
		
		float f;
		f = 3.4f;
		System.out.println(f);	
		double d = 3.4; //8����Ʈ
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 2000000000l; // 8byte / �빮�� L�̳� �ҹ��� l �ۼ�
		System.out.println(l);
		//������ �⺻ ũ��� 4����Ʈ
		//�Ǽ��� �⺻ ũ��� 8����Ʈ
	}
}