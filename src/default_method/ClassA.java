package default_method;

public abstract class ClassA {//추상클래스는
	public abstract void method01();//추상메서드와
	public void method02() {//일반메서드를 가진다.
		System.out.println("ClassA-method02");
	}
}
