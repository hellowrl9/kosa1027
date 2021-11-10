package test;

public class Ex01 {
//클래스명의 첫문자는 대문자여야 함 ex)Ex01
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*리터럴 : 자연어(한국어, 영어, 중국어, ...), 	
			     문자 리터럴 : a, b, c(문자가 한 개)
			     문자열 리터럴 : abcd(문자가 두 개 이상)
		  자연수(정수, 실수, 지수, ...)
				정수 : ex) 1, 20
				실수 : ex) 10.4, 2.3
		*/
		// 변수 선언
		int i ;
		i = 10;
		System.out.println(i + 10);
		int y = 20;
		System.out.println(y + 40);
		y = 30; //변수는 오로지 하나의 값만 가진다, 그래서 이전의 값이 아닌 새로운 값으로 됨
		System.out.println(y);
	}
}