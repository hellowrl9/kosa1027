package test;

public class Ex11 {

	public static void main(String[] args) {
		/* ���̽㿡����,
		 * 	if ���ǽ�:
		 * 		��ɾ�1
		 *  	��ɾ�2
		 *  	...
		 *  
		 * �ڹٿ�����,
		 * 	if (���ǽ�){
		 *  	��ɾ�1
		 *  	��ɾ�2
		 *  	...
		 * } 
		 * �ڹٿ����� �鿩���⸦ ������ ���̱� ���� ����Ѵ�.
		 */
		int i = 10;
		if (i < 20) System.out.println("�۴�"); //�ڹٿ��� ��ɾ �Ѱ��϶��� �߰�ȣ �����ʿ� ����
		
		if (i > 20) { 
			System.out.println("i�� "); //��ɾ �������϶��� �߰�ȣ�Ѵ�
			System.out.println("10���� �۴�");
			System.out.println("..."); 
			}
		
		System.out.println();
		int money = 3000;
		// �� 3000���� �ʰ��ϸ� ���� Ÿ�� ���ÿ�.
		if (money > 3000)						//�Ʒ��ٱ����� �ϳ��� ��ɹ���
			System.out.println("���� Ÿ�� ���ÿ�"); //���� �Ҹ������� �̰͸� ������� ����
		System.out.println("if���� ����Ǿ����ϴ�"); //���ǰ� ���� ��� �̰� �����
		
		
			
		
	}

}
