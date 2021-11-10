
public class Ex06test {

	public static void main(String[] args) {
		Ex06 ex06; //변수 선언
		ex06 = new Ex06(); //객체 생성
		//멤버 필드의 초기화
		ex06.setData("박시아", 30, 162.5);
		String name = ex06.getName();
		System.out.println(name);
		//객체 생성과 동시에 멤버 필드에 초기화가 되어야 함 : 생성자
		Ex061 ex061 = new Ex061("이상범", 18, 175.5);
		//객체 생성 시에 생성자가 자동으로 실행
		//멤버 필드를 초기화할 때 사용
		System.out.println(ex061.getAge());

	}

}
