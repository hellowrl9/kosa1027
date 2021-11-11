package package01;//패키지 내에 있으면 상단에 이렇게 패키지 명이 적혀있어야 함

public class Member {
	int age;
	double height;
	String name;
	boolean gender;
	public Member() {}
	public Member(int age, double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Member(int age, double height, String name, boolean gender) {
		super();
		this.age = age;
		this.height = height;
		this.name = name;
		this.gender = gender;
	}
	//getter
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	//
	public Member(boolean gender) {
		super();
		this.gender = gender;
	}
}