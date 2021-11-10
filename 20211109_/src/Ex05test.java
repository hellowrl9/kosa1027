
public class Ex05test {

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		/*직접 멤버에 접근할 수 없다
		ex05.age = 20; //멤버의 은닉
		ex05.height = 150.5;
		*/
		
		ex05.setAge(30);
		ex05.setHeight(150.4);
		/*
		 * System.out.println(ex05.age);
		 */
		ex05.name = "오징어";
		System.out.println(ex05.getAge());
		System.out.println(ex05.name);
	}

}
