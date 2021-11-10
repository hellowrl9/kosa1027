
public class Ex06 {
	String name;
	int age;
	double height;
	public void setData(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	//자바에서 생성자는 클래스명과 같아야 한다
	//생성자
	
	//메서드 : 클래스 안에 있는 함수
	//접근지정자 반환형 함수형 (매개변수) //아래#1
	//setter
	//#1
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter
		//반환형(void : 반환할 게 없다)
	public int getAge() {
		//정수를 반환(호출함수로 값을 넘김)
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}