package runtime_exception;

public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
	try	{
		Class clazz = Class.forName("java.util.List");
		System.out.println("클래스가 없습니다.");
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println();
	}

}
