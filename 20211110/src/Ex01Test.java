
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01(20, 10); //first = 20, second = 10
		int result = ex01.add(); //객체 내의 함수를 외부에서 사용하기 위해 변수명.메소드로 작성함
		//ex01은 메서드 내에 있는 this에 전달
		System.out.println(result);
		result = add(30, 10);
		System.out.println(result);
		Ex01 ex02 = new Ex01(50, 20); //first = 50, second = 20
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
}
