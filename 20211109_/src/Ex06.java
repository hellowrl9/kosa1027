
public class Ex06 {
	String name;
	int age;
	double height;
	public void setData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	//�ڹٿ��� �����ڴ� Ŭ������� ���ƾ� �Ѵ�
	//������
	
	//�޼��� : Ŭ���� �ȿ� �ִ� �Լ�
	//���������� ��ȯ�� �Լ��� (�Ű�����) //�Ʒ�#1
	//setter
	//#1
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
		//��ȯ��(void : ��ȯ�� �� ����)
	public int getAge() {
		//������ ��ȯ(ȣ���Լ��� ���� �ѱ�)
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}