package test;

public class Ex09 {

	public static void main(String[] args) {
		// ���̽� : not False = True; not True = False
		System.out.println(!true);
		System.out.println(!false);
		boolean b = true;
		System.out.println(!b);
		System.out.println(!!b);
		boolean b1 = false;
		System.out.println(!b1);
		System.out.println(!!b1);

		//���� ������ �� �� ������
		boolean b2 = true && true;
		System.out.println(b2);
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(false || false);
		//�� ������ : &&(and), ||(or)
		//��(����) ������ : >, <, <=, >=, ==, !=
		int i = 10;
		int j = 20;
		System.out.println(i > j); //���� ������ ����� �ο� Ÿ��
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
		
		boolean b3;
		b3 = i > j;
		System.out.println("b3 : " + b3);
		//���� : ���� ���ϴ� ����
		// 2200���� �����Դϱ�?
		// 4�⸶�� ����, 100�⸶�ٴ� ����̴�. �׷��� 400�⸶�ٴ� ����.
		b3 = 2200%4 ==0 && 2200%100 != 0
				|| 2200%400 == 0;
		System.out.println(b3); //���
		System.out.println();
		
		float f = 10.1f; //10.1000 0000
		double d = 10.1; //10.1000 0000 0000 0000
		boolean b4;
		b4 = f == d;
		System.out.println(b4);
		b4 = (double)f == d;
		System.out.println(b4);
		b4 = f == (float)d;
		System.out.println(b4);

		System.out.println();
		i = 10; //4byte
		d = 10.0; //8byte
		b4 = i == d; //4==8 -> 8==8 -> 10.0==10.0
		System.out.println(b4);
		
		System.out.println();
		int i3 = 65;
		int i4 = 75;
		int i5 = 85;
		boolean b5, b6, b7;
		b5 = i3 > i4;
		b6 = i4 < i5;
		b7 = b5 && b6;
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		b7 = i3 > i4 && i4 < i5;
		System.out.println(b7);

		System.out.println();
		b7 = b5 || b6; //false || true : true
		System.out.println(b7);
		b7 = i3 > i4 || i4 < i5;
		System.out.println(b7);
	}

}
