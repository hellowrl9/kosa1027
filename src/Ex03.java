
public interface Ex03 {
	//���, �߻�޼���
	static final int FIRST = 10;
	public void method01(); //�߻�޼��� //�������̵�
	//�����ڰ� ����
	//�Ϲݸ޼��� ���� //����ʵ� ���� /�޼���� �ܺο� ���� �������ֱ� ���� �ʿ���
	//�޼��� ���� : �ܺηκ��� ����ʵ忡 ���� ���޹ްų� 
	//����ʵ忡 �ִ� ���� �ܺο� �����ϱ� ���� ���, setter, getter
	
	//���� 8 �������� ��������, ���Ŀ��� �Ʒ����� ��� ����
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
}
