
public interface Ex03 {
	//상수, 추상메서드
	static final int FIRST = 10;
	public void method01(); //추상메서드 //오버라이딩
	//생성자가 없다
	//일반메서드 없다 //멤버필드 없다 /메서드는 외부에 값을 전달해주기 위해 필요함
	//메서드 역할 : 외부로부터 멤버필드에 값을 전달받거나 
	//멤버필드에 있는 값을 외부에 전달하기 위해 사용, setter, getter
	
	//버전 8 이전에는 위에까지, 이후에는 아래까지 사용 가능
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
}
