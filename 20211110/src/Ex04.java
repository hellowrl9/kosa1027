
public class Ex04 {
	static int first;
	static int second;
	//static 변수는 생성자를 이용해서 초기화할 수 없다
	//static 변수를 초기화 할 때는 static 블럭을 이용한다.
	//아래는 static 블럭
	static {
		first = 10;
		second = 20;
	}
	int val;
	public Ex04() {}
	//ex04test에서 아래 이용
	public Ex04(int val) {
		this.val = val;
		
	}
}
