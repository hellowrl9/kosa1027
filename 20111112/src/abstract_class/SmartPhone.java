package abstract_class;

//
public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
		
	} //자식 클래스
	
}
