package abstract_class;

public abstract class Phone {//�θ� Ŭ���� : �߻� Ŭ����
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn(); //�߻�ȭ
	public abstract void turnOff();
	
}
