
public class Ex04 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) +1;
		System.out.println(num);
		if (num ==1 || num == 4) {
			System.out.println('A');
		}else if(num ==2 || num ==5 ) {
			System.out.println('B');
		}else if(num ==3 || num ==6 ) {
			System.out.println('C');
		}

		System.out.println("===switch===");
		num =4;
		switch(num) {   			      // 원한느 출력 결과를 얻기 위해 break를 줌
		case 1 : System.out.println('A'); break;
		case 4 : System.out.println('A'); break;
		case 2 : System.out.println('B'); break;
		case 5 : System.out.println('B'); break;
		case 3 : System.out.println('C'); break;
		case 6 : System.out.println('C'); break;
		}
	}
}

