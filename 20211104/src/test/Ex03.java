package test;

public class Ex03 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		// i = "10"; / ""로 묶어주면 문자열이 됨
		String str = "10"; // 문자열인 경우 ""로 표시!
		System.out.println(str);
		// char ch = '10'; / ''로 묶어줘 문자열 됨
		//(1문자와 0문자가 합쳐진 형태)
		char ch = '0'; // 문자인 경우 : ''로 표시!
		System.out.println(ch);
		ch = '9';
		System.out.println(ch);
		ch = 0;
		System.out.println(ch); //공백문자
		ch = '0';
		System.out.println(ch); 
		System.out.println((int)ch); 
		//String str1 = 'a';
		//char ch1 = "a";
	}

}
