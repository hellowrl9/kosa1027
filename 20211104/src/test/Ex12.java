package test;

public class Ex12 {

	public static void main(String[] args) {
		int money = 2000;
		if (money >= 3000) { //true
			System.out.println("���� Ÿ�� ���ÿ�");
		}else { // false
			System.out.println("�ɾ�ÿ�");
		}
		/* if money >= 3000 :
		 * 		print("���� Ÿ�� ���ÿ�")
		 * else:
		 * 		print("�ɾ�ÿ�")
		 */
		System.out.println();
		
		char gender = 'M'; //char�� ���� "" �ƴ� ''�� ���ش�
		if (gender == 'M') {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
		} //��ɾ �Ѱ��̸� �߰�ȣ���� �ʾƵ� ������ �򰥸���� ������
		
		System.out.println();
		int score = 57;
		if (score >= 60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	}

}
