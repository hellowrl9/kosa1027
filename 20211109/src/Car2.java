
public class Car2 {
//공통코드
	String model;
	String color;
	int maxSpeed;
//	
	public Car2(String model) {
		this(model, "흰색", 250);
	}
	
	public Car2(String model, String color) {
		this.model = model;
		this.color = "흰색";
		this.maxSpeed = 250;
	}
	
	public Car2(String model, String color, 
			int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
