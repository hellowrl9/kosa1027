package default_method;

public interface DefualtMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();// default �޼��带 ������ ����
	
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();// default �޼��带 ������ ��
	}
}
