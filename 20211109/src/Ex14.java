
public class Ex14 {
	int result;
	int first;
	int second;
	int add; // ���� 
	public Ex14(int first, int second) {
		this.first = first; //����ʵ�� �Ű����� ������ ���� ���
		this.second = second;
	//  ����ʵ�         �Ű�����
	}
	/////�޼ҵ��� 4���� ����
	//1. �Է°��� �ְ� �����(��ȯ��)�� �ִ� �޼���
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	//�޼��� �����ε�(�Ʒ� 4���� ��)
	public int div(int num1, int num2) {//�Ű����� ����
		return num1 / num2;
	}
	// 2. �Է°��� �ְ� �����(��ȯ��)�� ���� �޼��� 
	public void sub(int num1, int num2) {
		this.result = num1 - num2;
	// �Ϲ�������, ����ʵ忡�� this��� Ű���带 �ٿ� ����Ѵ�
		System.out.println(this.result);
	}
	//�޼��� �����ε� //�Ű������� ������ �ٸ���
	public int sub(int num1, double num2) {
		//2���� ��. ��ȯ���� �ٸ��ٰ� �ؼ� �ٸ� �޼��尡 ���� �ʴ´�
		return num1 - (int)num2;
	}
	// 3. �Է°��� ���� ������� �ִ� �޼���
	public int mul() {
		return this.first * this.second;
	}
	// 4. �Է°��� ���� ������� ���� �Լ�
	public void div() {//�Ű����� ����
		System.out.println(this.first / this.second);
	}
}