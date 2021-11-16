package default_method;

public class ClassC extends ClassA{
	public void method04 () {
		System.out.println("ClassC-method04");
	}

	@Override
	public void method01() {//추상메서드
		System.out.println("ClassC-method01");
	}
	@Override
	public void method02() {//일반메서드
		System.out.println("ClassC-method02");
	}
}
