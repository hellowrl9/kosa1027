package test;

public class Ex10 {

	public static void main(String[] args) {
		// 대입 연산자
		int i = 10;
		System.out.println(i);
		i += 1; //i = i+1 = i++
		//이항               일항
		System.out.println(i);
		i += 2;
		System.out.println(i);
		i -= 2; // i = i - 2
		System.out.println(i);
		i *= 2; // i = i * 2
		System.out.println(i);
		i /= 2; // i = i / 2
		System.out.println(i);
		i %= 3; // i = i % 3
		System.out.println(i);
		
		System.out.println();
		int a, b, c;
		a = b = c = 100;
		String str = "hello " + "java";
		System.out.println(str);
		String str1 = "hello";
		String str2 = "java";
		str = str1 + " " + str2;
		System.out.println(str);
		System.out.println("a,b,c는 "+ 100); //파이썬에서는 안됐지만 자바에서는 됨
		
		System.out.println();
		str = "3 * 7 = "+21;
		System.out.println(str); //자바에서는 숫자가 문자로 자동 형변환 됨
		
		System.out.println();
		//삼항 연산자 : 항이 세 개
		i = 70;
		System.out.println(i > 60 ? "합격" : "불합격");
		//                   1항      2항      3항
		/*if (i > 60){
		 * 		System.out.println("합격");
		 * }else{
		 * 		System.out.println("불합격");
		 * }
		 */
		
		// 자바에서는 //, ** 연산자 없음 

		
	}

}
