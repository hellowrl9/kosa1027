
public class Ex12 {
	int first;
	int second;
	
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	// return 문 뒤의 값을 반환하기 때문에 값이 일치하도록 해야 함
	public int add() {
		return  this.first + this.second;
	}
	public int sub() {
		return this.first - this.second;
	}
	public String getName() {
		return "이숭무";
	}
}
