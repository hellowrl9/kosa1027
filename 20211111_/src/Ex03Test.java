import java.util.Scanner;//Ŭ���� �̸� : ������Ű��.������Ű��.Ŭ����

public class Ex03Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Ex03.name);
		Ex03.name = "�����";
		System.out.println(Ex03.name);
		//final ������ ��ü���� ���� �ʱ�ȭ�� �� �ִ�
		//�� �ѹ� �ʱ�ȭ�� �ϸ� ������ �� ����
		Ex03 ex03 = new Ex03(20, 30);
		Ex03 ex031 = new Ex03(50, 20);
		System.out.println(ex03.getVal1());
		System.out.println(ex031.getVal1());
		//����� ����ϴ� ������ ��� ��ü���� ������� ���� ������ ���� ����ϱ� ���ؼ�
		System.out.println();
		System.out.println(ex03.first);
		System.out.println(ex03.second);
		System.out.println(ex031.first);
		System.out.println(ex031.second);
		/*final Ű���带 ������ �־� ������ �� ����
		ex03.first = 10;
		*/
		
	}
}
