package runtime_exception;//���� �� ������ �߻��Ѵ� �� : ��Ÿ�� �ͼ���

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String [] args) {
		//String [] args = {"1", "2"}
		//		             0    1
		//String [] args = {"1","2","3"}
		//				     0   1   2
		//String [] args = {"1","2","3","4"}
		//				     0   1   2   3
		/*
		try {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		}catch(ArrayIndexOutOfBoundsExceptionExample e) {
				System.out.println("�Է� ���� 3������ �Ѵ�.");
		}*/
		if (args.length == 3) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		}else {
				System.out.println("�Է� ���� 3������ �Ѵ�.");
		}
	}
}
