
public class Ex13Test {
	public static void main(String [] args) {
		/////6�� ���
		//for�� �̿�
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("6 * "+i+" = "+6*i);
//		}
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("8 * "+i+" = "+8*i);
//		}
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("3 * "+i+" = "+3*i);
//		}
		gugu(2); //argument(=����)
		gugu(4);
		gugu(6);
		int result = 10 + 3;
		System.out.println(result);
		result = 30 + 6;
		System.out.println(result);
		result = add(20, 10);
		System.out.println(result);
		int result1 = add(30, 10);
		System.out.println(result1);
	} //�ݺ������� ����ϴ� �ڵ尡 �ִ� ��� �Լ��� �ۼ��ϴ� ���� ���ϴ�
	  // 				        dan : parameter(=�Ű�����)

	public static void gugu(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.println("dan * "+i+" = "+dan*i);	
		}
	}
	public static int add(int num1, int num2) { 
		return num1 + num2;
	}
}
