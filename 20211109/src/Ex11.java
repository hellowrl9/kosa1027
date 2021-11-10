
public class Ex11 {
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex11() {}
	public Ex11(String company, String model, int maxSpeed) {
		this.company = company; //
		this.model = model; //공통 코드
		this.maxSpeed = maxSpeed;
	}
	public Ex11(String company, String model, String color) {
		this.company = company; //
		this.model = model; //공통 코드
		this.color = color;
	}
	
	//공통 코드를 관리하는 생성자
	public Ex11(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		
	return company;
	}
}
