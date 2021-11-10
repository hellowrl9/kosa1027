
public class Ex04test {

	public static void main(String[] args) {
		Ex04 ex04;
		ex04 = new Ex04();
		ex04.setData(18, 174.5, false, "박시아");
		String name = ex04.getName();
		System.out.println(name);
		Ex04 ex004;
		ex004 = new Ex04();
		ex004.setAge(35);
		ex004.setGender(false);
		ex004.setHeight(185);
		ex004.setName("박윤아");
		name = ex004.getName();
		System.out.println(name);
		
		// 객체 지향에서는 아래처럼 사용하면 안된다
		Ex04 ex041 = new Ex04();
		ex041.age = 20;
		ex041.gender = true;
		ex041.height = 160.5;
		ex041.name = "이상엽";
		System.out.println(ex041.name);
	}

}
