package runtime_exception;

public class NullPointException {
	public static void main(String[] args) {
		Point point = null;
	try {
		point.print();}
	catch(NullPointerException e) {
		point = new Point();
		point.print();}
	}
}
//class Point{void면 왼쪽부분 상관없음
class Point{
	public void print() {
		System.out.println("출력");
	}
}
