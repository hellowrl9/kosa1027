
public abstract class Ex01 {
	int first; //��� �ʵ�
	// ������
	public Ex01(int first) {
		this.first = first;
	}
	// �߻� �޼���
	public abstract void method01(); //���ǵǾ� ���� ���� �޼���
	//�Ϲ� �޼���
	public void method02() {
		System.out.println("Ex01-method");
	}
}
