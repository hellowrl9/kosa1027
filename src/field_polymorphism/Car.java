package field_polymorphism;

public class Car {
	//�θ� ������ �ڽ� ��ü�� ������ �� �ִ�. �ڵ� ����ȯ.
	Tire frontLeftTire = new KumhoTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
