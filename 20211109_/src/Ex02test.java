
public class Ex02test { 

	public static void main(String[] args) {
		int i = 10;
		// ���̽��� �Ʒ��� �̷��� �ۼ� 
		//cal = calculator(), �ڹٴ� new�� �ʿ�
		//cal1 = calculator(); call.first = 20
		//cal.first = 10, �ڹٴ� �տ� �ڷ����� �ʿ�
		Ex02 ex02 = new Ex02();
	// #1�ڷ��� #2������(�������� ù���ڴ� �ҹ���!)
	// #1Ŭ�������� ù���ڴ� �빮��!(������ �򰥸��� �ʰ� �ϱ� ����)
		ex02.addr = "�д�";
		ex02.age = 35;
		ex02.name = "�̼���";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);

		Ex02 ex021 = new Ex02();
		ex021.addr = "�д�";
		ex021.age = 18;
		ex021.name = "�̻��";
		System.out.println(ex021.name);
	}

}
