
public class Ex01 {

	int first;

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();
		//10000   20000
		if(ex01 == ex02) {//�� ���� ���� ���� ��ü�ΰ�? �ƴϴ�.
			System.out.println("����");//(x)
		}else {
			System.out.println("�ٸ���");//(o)
		}
		ex01.first = 20;
		System.out.println(ex02.first);
		System.out.println(ex01.first);
		
		Singleton s1 = Singleton.getInstance();// 30000
		Singleton s2 = Singleton.getInstance();// 30000
		if(s1 == s2) {
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� �ٸ���.");
		}
	}

}
