
public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first); //안넣으면 초기값 0 
		System.out.println(ex032.second); //안넣으면 초기값 0
		System.out.println(ex032.val); //#1 
		System.out.println(Ex03.val);//또는#2(값동일)
		int result = ex031.add();
		System.out.println(result);
		result = ex032.add();
		
		System.out.println(result);
		result = Ex03.sub();
		// static 키워드 : 클래스명을 이용해 사용하기 위한 메서드
		// 메서드 내에서 this 키워드를 사용할 수 없다
	}

}
