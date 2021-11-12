package multi_implement;

//클래스와 클래스에는 다중상속이 되지않고, 클래스와 인터페이스간에 다중상속이 된다
public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}//다중 상속

}
