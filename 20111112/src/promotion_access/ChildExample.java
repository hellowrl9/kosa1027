package promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = new Parent();
		parent = child;//�θ� �ڽ��� ������ ��� �ڽĿ��� ���ǵ� ���� ����� �� ����
		parent.method1();//�ڽĿ��� �������̵� �� �޼���� ��� �����ϴ�
		parent.method2();
	//	parent.method3(); �ڽĿ��� ���ǵ�

	}

}
