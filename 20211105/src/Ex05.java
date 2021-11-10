
public class Ex05 {

	public static void main(String[] args) {
		// 95 이상이면 A+, 90 이상이면 A, 85 이상이면 B+, 80 이상이면 B
		int score = 87;
		if (score >= 95) { //if(score <= 100 && score >=95)
 			System.out.println("A+");
		}else if(score >= 90) { //if(score < 95 && score >= 90)
			System.out.println("A");
		}else if(score >= 85) { //if(score < 90 && score >= 85)
			System.out.println("B+");
		}else if(score >= 80) { //if(score < 85 && score >= 80
			System.out.println("B");
		}

		System.out.println("===swithch===");
		switch (score) {
		case 100 : case 99: case 98: case 97: case 96: case 95: System.out.println("A+"); break;
		case 94: 
		case 93:
		case 92: 
		case 91: 
		case 90: System.out.println("A"); break; //이것처럼하면 보기에 길어져서 바로 위 A+럼 작성함
		
		default : System.out.println("F"); break;//여기에 break가 없다면 뒤에까지 찍힌다.
		
		case 89 : case 88: case 87: case 86: case 85: System.out.println("B+"); break;//중간에는 break가 있어야 하지만,
		case 84 : case 83: case 82: case 81: case 80: System.out.println("B"); //맨마지막에는 break가 필요없다
		
		}
	}

}
