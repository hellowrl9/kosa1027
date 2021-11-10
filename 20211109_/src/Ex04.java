
public class Ex04 {
	int age;
	double height; //¸â¹ö ÇÊµå, ¸â¹ö º¯¼ö
	boolean gender;
	String name;
	public void setData(int age, double height, 
			boolean gender, String name) {
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.name = name;
		
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	//getter
	
	public int getage() {
		return this.age;	
	}
	public boolean getgender() {
		return this.gender;
	}
	
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}

}

