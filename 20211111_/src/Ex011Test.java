
public class Ex011Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();		//stack 		heap
		Ex01 ex02 = ex01; 		//ex01 10000	10000|first|second
								//ex02 10000
		Ex01 ex03 = new Ex01(); //ex03 2000000|first|second

		ex01.first = 30;
		System.out.println(ex01.first); //30
		System.out.println(ex02.first); //30
		System.out.println(ex03.first); //0
		
		if(ex01 == ex02) 
		System.out.println("ex01�� ex02�� ���� ��ü�̴�.");
		else {
		System.out.println("�ٸ� ��ü�̴�.");
		}if(ex01 == ex03) {
		System.out.println("���� ��ü�̴�.");
		}else {
		System.out.println("ex01�� ex03�� �ٸ� ��ü�̴�.");
		}
		// static Ű���尡 �ִ� ��� ������ ��ü ���� ���� Ŭ���������� ����� �� �ִ�
		int result = Singleton.val;
		System.out.println(result);
		//Singleton s = Singleton.singleton;
		Singleton s = Singleton.getInstance(); //s = 30000
		Singleton s1 = Singleton.getInstance(); //s1 = 30000
		
		if(s==s1) {
			System.out.println("s�� s1�� ���� ��ü�̴�.");
		}else {
			System.out.println("s�� s1�� �ٸ� ��ü�̴�.");
		}

	}
}
