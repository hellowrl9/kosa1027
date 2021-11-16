package StringClass;

public class StringMethod {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//index       01234567890123
				//              1
		
		System.out.println(ssn.charAt(7));
		String str = "���� �ڹٰ� �ʹ� ����־��.";
		//            01 234 56 78901
		//                         1      
		System.out.println(str.charAt(10));
		//charAt �޼ҵ� : index�� �ش�Ǵ� ���ڸ� ������

		//method ����
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
		System.out.println(ii.length);//�迭�� ��ȣ�� ���� �������� �� �ִ�
		
		//I�� i��(���ڷ� ��ȯ)
		System.out.println(str1.replace("I", "i"));
		//I�� You��(���ڿ��� ��ȯ)/����ǥ���� �ش��ϴ� ���ڸ� ����
		System.out.println(str1.replaceAll("I", "You"));

		str = "A:B:C:D:abcd";
		String [] str2 = str.split(":");//���ڿ� split�ϸ� �ڹ�:�迭, ���̽�:����Ʈ�� �����
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split("");
		System.out.println(str2[1]);
		
		//slicing�� �ڹٿ����� substring�� ����
		//slicing : a = "abcdef" : a[1:3] : substring
		str1 = "abcdef";
		System.out.println(str1.substring(1, 3));//1, 1+2(�α���)
		
		str1 = "abcDEF";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		Integer i = 10;
		str = "10" + i.toString();// ���ڸ� ���ڷ� ����
		System.out.println(str);
		
		System.out.println();
		str1 = "abc DEF ";//strip, lstip, rstrip
		System.out.println(str.trim());

		str1 = "I like the java";
		//      012345678901234 index �𸦶� the java�� ����ϱ�
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start+8));
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
	}
}