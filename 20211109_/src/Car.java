
public class Car {
	//회사, 모델, 색, 스피드
	String company;
	String model;
	String color;
	int maxSpeed;
	public Car() {}//여기까지 작성 후에
	public Car(String company, String model, String color, int maxSpeed) {//shift, alt, s, o 한번에 누르면 생성됨)
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//shift, alt, s, r 한번에 누르면 생성됨
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
