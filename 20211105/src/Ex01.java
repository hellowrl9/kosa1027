
public class Ex01 {

	public static void main(String[] args) {
		// ���ͳ� : �ڿ��� : �ѱ���, ����, .../ �ڿ��� : ����, �Ǽ�
		/* �ڷ��� : ���� : byte(1), char(2), short(2), int(4), long(8)
		 * 		  �Ǽ� : float(4), double(8)
		 * 		  ���� : char(2) : 'a', '��'
		 * 	      ���ڿ� : string : "acbd", "����", "a", "��"(���� �ϳ��� ""�� ǥ���ϸ� ���ڿ��� �ν���)
		 */
		// ����ȯ : �ڵ�����ȯ, ��������ȯ
		short sh = 10;
		int i = sh; //�ڵ� ����ȯ
		sh = (short)i; //���� ����ȯ
		short sh1 = 10;
		short sh2 = 20;
		//short sh3 = sh1 + sh2; �̷��Դ� �� �� ����. �Ʒ�ó�� �ؾ� ��.
		int i1 = sh1 + sh2;
	    short sh4 = (short)(sh1 + sh2);
		//short sh5 = (short)sh1 + (short)sh2;
	    //                 4  >  2  > 4 byte�� �ȵ� 
		//              ��������ȯ    �ڵ�����ȯ
		// byte => char => short => int => long => float => double
	    // �� �������δ� ������ �ڵ�����ȯ�� �Ͼ��.
	    
	    //��� : whrjsans, qksqhrans
	    //if, if ~ else, if ~ else if ~ else if ~ ... ~ else
	    int money = 3000;
	    if (money > 3000) {
	    	System.out.println("���� Ÿ�� ���ÿ�");
	    }
	    if (money >= 3000) {
	    	System.out.println("���� Ÿ�� ���ÿ�.");
	    }else {
	    	System.out.println("�ɾ�ÿ�.");
	    }
    }
}