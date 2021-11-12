
public class Ex04Test {

	public static void main(String[] args) {
		B b = new B(); //A
		C c = new C(); //A
		D d = new D(); //B, A
		E e = new E(); //C, A
		//다형성의 기본 원칙
		//:부모는 자식 객체를 참조할 수 있어야 한다
		//:자식은 부모를 상속받아야만 가능하다
		A a = b; //a가 b가 되었다
		a = c; //a가 c가 되었다
		a = d; //a가 d가 되었다
		a = e; //a가 e가  되었다
		//하나의 객체로 여러개의 변수 사용 가능 : 다형성
		//다/형/성:여러가지 형태를 가질 수 있다
	}

}
