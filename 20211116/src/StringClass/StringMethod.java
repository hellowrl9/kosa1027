package StringClass;

public class StringMethod {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//index       01234567890123
				//              1
		
		System.out.println(ssn.charAt(7));
		String str = "나는 자바가 너무 재미있어요.";
		//            01 234 56 78901
		//                         1      
		System.out.println(str.charAt(10));
		//charAt 메소드 : index에 해당되는 문자를 가져옴

		//method 정리
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap");
		System.out.println(b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);
		
		b1 = str1.endsWith("le");
		System.out.println(b1);
		
		str = new String("java");
		str1 = new String("java");
		System.out.println(str1 == str); //false
		System.out.println(str1.equals(str));
		
		str1 = "I like the java";
		//index 012345678901234
		//                1
		System.out.println((str1.indexOf("t")));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));//python:rindex
		System.out.println(str1.length());
		int [] ii = new int[5];
		System.out.println(ii.length);//배열만 괄호가 없고 나머지는 다 있다
		
		//I를 i로(문자로 변환)
		System.out.println(str1.replace("I", "i"));
		//I를 You로(문자열로 변환)/정규표현에 해당하는 문자를 변경
		System.out.println(str1.replaceAll("I", "You"));

		str = "A:B:C:D:abcd";
		String [] str2 = str.split(":");//문자열 split하면 자바:배열, 파이썬:리스트로 저장됨
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split("");
		System.out.println(str2[1]);
		
		//slicing이 자바에서는 substring과 같다
		//slicing : a = "abcdef" : a[1:3] : substring
		str1 = "abcdef";
		System.out.println(str1.substring(1, 3));//1, 1+2(두글자)
		
		str1 = "abcDEF";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		Integer i = 10;
		str = "10" + i.toString();// 숫자를 문자로 변경
		System.out.println(str);
		
		System.out.println();
		str1 = "abc DEF ";//strip, lstip, rstrip
		System.out.println(str.trim());

		str1 = "I like the java";
		//      012345678901234 index 모를때 the java만 출력하기
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start+8));
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
	}
}