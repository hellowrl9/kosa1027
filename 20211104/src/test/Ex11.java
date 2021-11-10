package test;

public class Ex11 {

	public static void main(String[] args) {
		/* 파이썬에서는,
		 * 	if 조건식:
		 * 		명령어1
		 *  	명령어2
		 *  	...
		 *  
		 * 자바에서는,
		 * 	if (조건식){
		 *  	명령어1
		 *  	명령어2
		 *  	...
		 * } 
		 * 자바에서는 들여쓰기를 가독성 높이기 위해 사용한다.
		 */
		int i = 10;
		if (i < 20) System.out.println("작다"); //자바에서 명령어가 한개일때는 중괄호 해줄필요 없다
		
		if (i > 20) { 
			System.out.println("i는 "); //명령어가 여러개일때는 중괄호한다
			System.out.println("10보다 작다");
			System.out.println("..."); 
			}
		
		System.out.println();
		int money = 3000;
		// 돈 3000원을 초과하면 차를 타고 가시오.
		if (money > 3000)						//아랫줄까지가 하나의 명령문임
			System.out.println("차를 타고 가시오"); //조건 불만족으로 이것만 실행되지 않음
		System.out.println("if문이 종료되었습니다"); //조건과 관련 없어서 이건 실행됨
		
		
			
		
	}

}
