package multi_implement;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		Searchable sc = tv;
		RemoteControl rc= tv;
		//�θ� �ִ� �͸� ��� �����ϴ�
		sc.search("�̼���");
		rc.turnOff();
		rc.turnOn();
		//��ӹ��� ������ ��� �����ϴ�
		tv.search("�̻��");
		tv.turnOn();
		tv.turnOff();
	}

}
