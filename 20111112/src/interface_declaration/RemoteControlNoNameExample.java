package interface_declaration;

public class RemoteControlNoNameExample {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			int vol;
			@Override
			public void turnOn() {
				System.out.println("cd�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("cd�� ���ϴ�.");
			}
			@Override
			public void setVolume(int voluem) {
				if(voluem > RemoteControl.MAX_VOLUME) {
					vol = RemoteControl.MAX_VOLUME;
				}else if(voluem < RemoteControl.MIN_VOLUME) {
					vol = RemoteControl.MIN_VOLUME;
				}else {
					vol = voluem;
				}
				System.out.println("���� cd ������ "+vol+"�Դϴ�.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
}