
public class Ex07Test {

	public static void main(String[] args) {
		Ex07 ex07 = new Ex07(20, 10);
		ex07.add();
		System.out.println(ex07.getResult());
		
		Ex07 ex071 = new Ex07(); //디폴트 생성자
		//Ex07.java에서 만들어주니 위 오류 안생김
		ex07.setFirst(100);
		ex07.setSecond(50);
		
		Ex071 ex007 = new Ex071(); //디폴트 생성자
		ex07.setFirst(30);
		System.out.println(ex07.getFirst());
		
	}
}
