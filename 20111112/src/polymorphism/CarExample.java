package polymorphism;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i = 1; i<=5; i++) {
			int problemLocation = car.run(); //1,2,3,4
			switch(problemLocation) {
			//������ / �Ʒ�ó�� �� Ÿ�̾�(��ü)�� ���� Ÿ�̾�(Ÿ��)�� ���� �� �ִ�
			//���� : ����� �Ǿ�� ��
			//    : �θ� �ڽ��� �����ؾ� ��
			case 1:
				System.out.println("�տ��� HankookTire ��ü");
				car.frontLeftTire = new HankookTire("�տ��� ", 6);
				break;
			case 2:
				System.out.println("�տ����� KumhoTire ��ü");
				car.frontLeftTire = new KumhoTire("�տ����� ", 4);
				break;
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�ڿ���", 14);	
				break;
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			}
		}
	}

}
