package casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동 형변환, 부모에 있는 것만 사용 가능
		vehicle.run();
		
		Bus bus = (Bus)vehicle; //강제 형변환, 자식 객체이 있는 것이 사용 가능
		bus.checkFare();
		bus.run();
	}
}
