
public class Ex02 extends Ex01{
	public Ex02(int first) {
		super(first);
	}
	public void method2() {
			//추상메서드 있는 클래스는 객체생성할 수 없다
			//Ex01 ex01 = new Ex01(12);
	}
	//추상메서드가 있는 추상클래스를 상속하면 추상메서드는 오버라이딩해야 함
	@Override
	public void method01() {
		System.out.println("Ex02=method1");
	}
}
