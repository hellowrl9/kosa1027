package multi_implement;

public abstract interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	abstract void turnOn();
	abstract void turnOff();
	abstract void setVolume(int volume);
	
}
