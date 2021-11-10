
public class Ex02test { 

	public static void main(String[] args) {
		int i = 10;
		// 파이썬은 아래를 이렇게 작성 
		//cal = calculator(), 자바는 new가 필요
		//cal1 = calculator(); call.first = 20
		//cal.first = 10, 자바는 앞에 자료형이 필요
		Ex02 ex02 = new Ex02();
	// #1자료형 #2변수명(변수명의 첫글자는 소문자!)
	// #1클래스명의 첫글자는 대문자!(변수와 헷갈리지 않게 하기 위해)
		ex02.addr = "분당";
		ex02.age = 35;
		ex02.name = "이숭무";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);

		Ex02 ex021 = new Ex02();
		ex021.addr = "분당";
		ex021.age = 18;
		ex021.name = "이상범";
		System.out.println(ex021.name);
	}

}
