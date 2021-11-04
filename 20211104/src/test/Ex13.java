package test;

public class Ex13 {

	public static void main(String[] args) {
		/* 90 이상이면 'A', 
		80 이상이면 'B', 
		70 이상이면 'C', 
		60 이상이면 'D', 
		아니면 'F'
		*/
		int score = 75;
		
		//python : if ~ elif ~ elif ~ ... ~ else
		//java : if ~ else if ~ else if ~ ... ~ else
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}

}
