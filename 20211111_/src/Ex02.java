
public class Ex02 {
	final int first; //final 변수와 상수의 이름은 모두 대문자여야 함
	final int second; //지금처럼 소문자로 써도 오류나진 않지만 위처럼 쓰기로 약속함
	final String GOODS_PRICE;
	String name;
	public Ex02(int first, int second, String GOODS_PRICE){
		this.first = first; //초기값 지정해 줌
		this.second = second; //초기값 지정해 줌
		this.GOODS_PRICE = "";
	}
// 아래처럼 setter를 통해서 값을 변경할 수 없다
//	public void setFirst(int first) {
//		this.first = first;
//	}
	public void setName(String name) {//name 대문자 아니라 소문자
		this.name = name;
	}//getter 아니므로 void
	public String getName() {
		return this.name;
	}
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
}
