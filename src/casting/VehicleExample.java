package casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //�ڵ� ����ȯ, �θ� �ִ� �͸� ��� ����
		vehicle.run();
		
		Bus bus = (Bus)vehicle; //���� ����ȯ, �ڽ� ��ü�� �ִ� ���� ��� ����
		bus.checkFare();
		bus.run();
	}
}
