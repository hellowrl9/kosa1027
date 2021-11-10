
public class Ex03 {

	public static void main(String[] args) {
		//8단 출력
		int num = (int)(Math.random() *9) + 1; //9까지 가져오기 위해 플러스 1 해줌
		if (num == 1) {
			System.out.println("8 * 1 = 8");
		}else if (num == 2) {
			System.out.println("8 * 2 = 16");
		}else if (num == 3) {
			System.out.println("8 * 3 = 24");
		}else if (num == 4) {
			System.out.println("8 * 4 = 32");
		}else if (num == 5) {
			System.out.println("8 * 5 = "+ 8*5);
		}else if (num == 6) {
			System.out.println("8 * 6 = "+ 8*6);
		}else if (num == 7) {
			System.out.println("8 * 7 = "+ 8*7);
		}else if (num == 8) {
			System.out.println("8 * 8 = "+ 8*8);
		}else if (num == 9) {
			System.out.println("8 * 9 = "+ 8*9);
		}
		
		System.out.println("===switch===");
		switch(num) { 									    //조건식이 많을수록 switch문 쓰는게 더 좋다
		case 1: System.out.println("8 * 1 = "+ 8*1); break; //switch문 끝나면 꼭 break 걸어줘야 함
		case 2: System.out.println("8 * 2 = "+ 8*2); break;
		case 3: System.out.println("8 * 3 = "+ 8*3); break;
		case 4: System.out.println("8 * 4 = "+ 8*4); break;
		case 5: System.out.println("8 * 5 = "+ 8*5); break;
		case 6: System.out.println("8 * 6 = "+ 8*6); break;
		case 7: System.out.println("8 * 7 = "+ 8*7); break;
		case 8: System.out.println("8 * 8 = "+ 8*8); break;
		case 9: System.out.println("8 * 9 = "+ 8*9); break;
		
		}
	}

}
