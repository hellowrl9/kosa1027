
public class Car {
	//ȸ��, ��, ��, ���ǵ�
	String company;
	String model;
	String color;
	int maxSpeed;
	public Car() {}//������� �ۼ� �Ŀ�
	public Car(String company, String model, String color, int maxSpeed) {//shift, alt, s, o �ѹ��� ������ ������)
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//shift, alt, s, r �ѹ��� ������ ������
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
