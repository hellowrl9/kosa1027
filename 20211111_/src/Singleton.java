			
public class Singleton {
	
	//singleton / setter, getter 있어도 상관없음
	int first; // 있어도 상관없음
	int second;// 있어도 상관없음
	
			static    int       val    = 10;
	//private	static    int       val    = 10;
	//private 사용 시 직접 접근 불가능, 내부에서만 접근 가능
	
	//자기 자신의 객체를 미리 만들어 놓고 사용 : 싱글톤
	static Singleton singleton = new Singleton();
	private Singleton() {} //자기가 자기 자신으로 만들려면 생성자에 private를 줘야 함
	public static Singleton getInstance() {//자신의 객체를 전달할 때 사용하는 메소드
		return singleton; //자신의 객체를 전달할 때 사용하는 메소드 사용 시 getInstance를 사용해야 함
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
	
	
}
