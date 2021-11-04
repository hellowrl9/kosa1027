package test;

public class Ex05 {

	public static void main(String[] args) {
		// 형변환
		// 자동 형변환 : 작은 자료형이 큰 자료형으로 변환하는 것
		// 1byte -> 2byte -> 4byte -> 8byte
		// 1byte -> 8byte, 1byte - > 4byte
		// 정수 -> 실수
		short sh = 30000;
		int i = sh; // 자동형변환 : 정수 -> 실수
		float f = sh; // 자동형변환
		System.out.println(i);
		System.out.println(f);
		double d = sh;
		System.out.println(d);
		// 강제 형변환 : 큰 자료형을 작은 자료형으로 변환하는 것
		// 실수 -> 정수, 큰 형 -> 작은 형
		double d1 = 174.5;
		float f1 = 174.5f; //float이니까 뒤에 f를 줌
		int i1 = (int)f1; //바로위의 큰 형이 지금의 작은 형으로 됨 
		//실수를 정수로 바꾸면, 소숫점 이하를 잘라 정수로 만들어야 함
		//실수가 정수보다 큼
		System.out.println(i1);
		i1 = (int)d1; // 실수 -> 정수
		System.out.println(i1);
		int i2 = 2100000000;
		short sh1 = (short)i2; //큰 형 -> 작은 형
		System.out.println(sh1);
		//큰 평을 작은 형으로 변환하면 오버플로우가 발생하여 수가 달라질 수 있다
		//오버플로우는 버리게 된다
		int i3 = 32000;
		short sh3 = (short)i3;
		System.out.println(sh3);
		//바로 위처럼 하면 오버플로우가 발생하지 않는다
		//오버플로우가 발생해 수가 달라지지 않도록 타입 지정을 주의하자
	}

}
