package inheritance;

public class Ex06 {
	int first;
	int second;
	int result;
	public Ex06() {
		System.out.println("�θ�Ŭ���� ��ü�� �����Ǿ����");
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return result;
	}
	public void add() {
		result = first + second;
	}
}
