
public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); //�ȳ����� �ʱⰪ 0 
		System.out.println(ex032.second); //�ȳ����� �ʱⰪ 0
		System.out.println(ex032.val); //#1 
		System.out.println(Ex03.val);//�Ǵ�#2(������)
		int result = ex031.add();
		System.out.println(result);
		result = ex032.add();
		
		System.out.println(result);
		result = Ex03.sub();
		// static Ű���� : Ŭ�������� �̿��� ����ϱ� ���� �޼���
		// �޼��� ������ this Ű���带 ����� �� ����
	}

}
