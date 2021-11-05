
public class Ex01 {

	public static void main(String[] args) {
		// 리터널 : 자연어 : 한국어, 영어, .../ 자연수 : 정수, 실수
		/* 자료형 : 정수 : byte(1), char(2), short(2), int(4), long(8)
		 * 		  실수 : float(4), double(8)
		 * 		  문자 : char(2) : 'a', '가'
		 * 	      문자열 : string : "acbd", "가나", "a", "가"(문자 하나라도 ""로 표시하면 문자열로 인식함)
		 */
		// 형변환 : 자동형변환, 강제형변환
		short sh = 10;
		int i = sh; //자동 형변환
		sh = (short)i; //강제 형변환
		short sh1 = 10;
		short sh2 = 20;
		//short sh3 = sh1 + sh2; 이렇게는 할 수 없음. 아래처럼 해야 함.
		int i1 = sh1 + sh2;
	    short sh4 = (short)(sh1 + sh2);
		//short sh5 = (short)sh1 + (short)sh2;
	    //                 4  >  2  > 4 byte라서 안됨 
		//              강제형변환    자동형변환
		// byte => char => short => int => long => float => double
	    // 위 방향으로는 언제든 자동형변환이 일어난다.
	    
	    //제어문 : whrjsans, qksqhrans
	    //if, if ~ else, if ~ else if ~ else if ~ ... ~ else
	    int money = 3000;
	    if (money > 3000) {
	    	System.out.println("차를 타고 가시오");
	    }
	    if (money >= 3000) {
	    	System.out.println("차를 타고 가시오.");
	    }else {
	    	System.out.println("걸어가시오.");
	    }
    }
}