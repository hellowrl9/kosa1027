package WrapperExample;

public class ValueCompareEx {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		if (i1 == i2) {
			System.out.println("����");
		}
		Integer i3 = 10;
		Integer i4 = 20;
		if (i3 == i4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		//unboxing
		if(i3.intValue() ==i4.intValue()) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		i3 = 10;
		i4 = 10; //-128 ~ 127
		System.out.println();
		System.out.println(i3 == i4); //true
		System.out.println(i3.intValue() == i4.intValue()); //true
		System.out.println(i3.equals(i4)); //true
		
		i3 = 300;
		i4 = 300;
		System.out.println(); //-128���� �۰� 127���ٴ� ū ���� ���
		System.out.println(i3 == i4);//false
		System.out.println(i3.intValue() == i4.intValue());//true
		System.out.println(i3.equals(i4));//true
		}
}