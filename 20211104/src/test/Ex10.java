package test;

public class Ex10 {

	public static void main(String[] args) {
		// ���� ������
		int i = 10;
		System.out.println(i);
		i += 1; //i = i+1 = i++
		//����               ����
		System.out.println(i);
		i += 2;
		System.out.println(i);
		i -= 2; // i = i - 2
		System.out.println(i);
		i *= 2; // i = i * 2
		System.out.println(i);
		i /= 2; // i = i / 2
		System.out.println(i);
		i %= 3; // i = i % 3
		System.out.println(i);
		
		System.out.println();
		int a, b, c;
		a = b = c = 100;
		String str = "hello " + "java";
		System.out.println(str);
		String str1 = "hello";
		String str2 = "java";
		str = str1 + " " + str2;
		System.out.println(str);
		System.out.println("a,b,c�� "+ 100); //���̽㿡���� �ȵ����� �ڹٿ����� ��
		
		System.out.println();
		str = "3 * 7 = "+21;
		System.out.println(str); //�ڹٿ����� ���ڰ� ���ڷ� �ڵ� ����ȯ ��
		
		System.out.println();
		//���� ������ : ���� �� ��
		i = 70;
		System.out.println(i > 60 ? "�հ�" : "���հ�");
		//                   1��      2��      3��
		/*if (i > 60){
		 * 		System.out.println("�հ�");
		 * }else{
		 * 		System.out.println("���հ�");
		 * }
		 */
		
		// �ڹٿ����� //, ** ������ ���� 

		
	}

}
