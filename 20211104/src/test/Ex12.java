package test;

public class Ex12 {

	public static void main(String[] args) {
		int money = 2000;
		if (money >= 3000) { //true
			System.out.println("차를 타고 가시오");
		}else { // false
			System.out.println("걸어가시오");
		}
		/* if money >= 3000 :
		 * 		print("차를 타고 가시오")
		 * else:
		 * 		print("걸어가시오")
		 */
		System.out.println();
		
		char gender = 'M'; //char일 때는 "" 아닌 ''로 해준다
		if (gender == 'M') {
			System.out.println("남자입니다");
		}else {
			System.out.println("여자입니다");
		} //명령어가 한개이면 중괄호하지 않아도 되지만 헷갈릴까봐 해줬음
		
		System.out.println();
		int score = 57;
		if (score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
