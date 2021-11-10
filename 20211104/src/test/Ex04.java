package test;

public class Ex04 {

	public static void main(String[] args) {
		// 실수형 리터널 : 0.3, 20,4, ...
		// 소숫점을 가지고 있는 수를 실수라고 한다
		float f; //4바이트 : 정밀도 낮다
		double d; //8바이트 : 정밀도 높다
		// 실수의 기본 크기는 8바이트
		d = 0.1234567890123456789;
		f = 0.1234567890123456789f;
		System.out.println(d); //소숫점 18자리까지 나옴 -> 정밀도 높다
		System.out.println(f); //소숫점 9자리까지 나옴 -> 정밀도 낮다
		boolean b = true;
		boolean b1 = false;
		String str = "true"; // ""이면 문자열, bool type 아님
		// b = true : 파이썬은 True 대문자로 쓰는데, 자바는 소문자로 써야 함
		System.out.println(b);
		System.out.println(b1);
		System.out.println(str);
	}
}
