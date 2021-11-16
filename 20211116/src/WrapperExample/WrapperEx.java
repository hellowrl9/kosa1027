package WrapperExample;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = 100; //박싱(boxing), 포장함
		int i1 = 1; //Integer => int : 언박싱
		int i2 = 20;
		//           자동 언박싱 : 자동 형변환이 됨
		int result = i + i2;
		
//		Integer i3 = new Integer(10);
//		Integer i4 = new Integer("10");
		Integer i5 = Integer.valueOf("300");
		Integer i6 = 10;
		
		int i7 = i6; //자동 언박싱
		i7 = i6.intValue(); //언박싱 /위처럼 사용가능하기 때문에 이것처럼은 쓸 필요는 없다(잘 쓰지 않음)

		int i8 = 10;
		Integer i9 = 10;
		i9 = i8;
		i8 = i9;
	}
}
