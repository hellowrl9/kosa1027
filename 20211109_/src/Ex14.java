
public class Ex14 {
	int result;
	int first;
	int second;
	int add; // 변수 
	public Ex14(int first, int second) {
		this.first = first; //멤버필드와 매개변수 구분을 위해 사용
		this.second = second;
	//  멤버필드         매개변수
	}
	/////메소드의 4가지 유형
	//1. 입력값이 있고 결과값(반환형)이 있는 메서드
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	//메서드 오버로딩(아래 4번과 비교)
	public int div(int num1, int num2) {//매개변수 있음
		return num1 / num2;
	}
	// 2. 입력값은 있고 결과값(반환형)이 없는 메서드 
	public void sub(int num1, int num2) {
		this.result = num1 - num2;
	// 일반적으로, 멤버필드에는 this라는 키워드를 붙여 사용한다
		System.out.println(this.result);
	}
	//메서드 오버로딩 //매개변수의 순서가 다르다
	public int sub(int num1, double num2) {
		//2번과 비교. 반환형이 다르다고 해서 다른 메서드가 되지 않는다
		return num1 - (int)num2;
	}
	// 3. 입력값은 없고 결과값이 있는 메서드
	public int mul() {
		return this.first * this.second;
	}
	// 4. 입력값이 없고 결과값이 없는 함수
	public void div() {//매개변수 없음
		System.out.println(this.first / this.second);
	}
}