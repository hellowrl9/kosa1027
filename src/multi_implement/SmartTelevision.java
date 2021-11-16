package multi_implement;

public class SmartTelevision implements Searchable, RemoteControl{//,로 묶어주는 것 : 다중상속
	//클래스는 여러개를 동시에 상속받을 수 없다
	
	int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {//상수는 클래스명.상수명
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}
	
}
