
public class Ex11 {
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex11() {}
	public Ex11(String company, String model, int maxSpeed) {
		this.company = company; //
		this.model = model; //���� �ڵ�
		this.maxSpeed = maxSpeed;
	}
	public Ex11(String company, String model, String color) {
		this.company = company; //
		this.model = model; //���� �ڵ�
		this.color = color;
	}
	
	//���� �ڵ带 �����ϴ� ������
	public Ex11(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		
	return company;
	}
}
