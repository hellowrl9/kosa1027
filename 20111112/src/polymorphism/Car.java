package polymorphism;

public class Car {
	Tire backRightTire = new Tire("�ڿ�����", 6);
	Tire frontLeftTire = new Tire("�տ���", 2);
	Tire frontRightTire = new Tire("�տ�����", 3);
	Tire backLeftTire = new Tire("�ڿ���", 4);
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(frontLeftTire.roll()==false) {stop();return 1;}
		if(backRightTire.roll()==false) {stop();return 2;}
		if(frontLeftTire.roll()==false) {stop();return 3;}
		if(backRightTire.roll()==false) {stop();return 4;}
		return 0;
	}
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
	
}
