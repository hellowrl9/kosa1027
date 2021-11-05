
public class Ex12 {

	public static void main(String[] args) {
		/* <파이썬>
		 * num = 1 			//전역변수
		 * def test():
		 * 		num = 100	//지역변수, <자바>블럭변수
		 * 		print(num)
		 * test()
		 * print(num) 
		 */
		
		int num = 1;
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
			int a = 10;
		//변수 i, a를 블럭 안에서 사용 가능한 변수여서 블럭 변수라고 한다
		}
		/* 블럭 밖에서 사용하려 하면 오류가 발생한다
		System.out.println(i);
		System.out.println(a);
		 */
		
		for (num = 1; num <= 10; num ++) {
			System.out.println(num);
			//블럭 밖에 있는 변수 num은 블럭 안에서 사용 가능하다
		}
	}
}
