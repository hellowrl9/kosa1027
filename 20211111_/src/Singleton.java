			
public class Singleton {
	
	//singleton / setter, getter �־ �������
	int first; // �־ �������
	int second;// �־ �������
	
			static    int       val    = 10;
	//private	static    int       val    = 10;
	//private ��� �� ���� ���� �Ұ���, ���ο����� ���� ����
	
	//�ڱ� �ڽ��� ��ü�� �̸� ����� ���� ��� : �̱���
	static Singleton singleton = new Singleton();
	private Singleton() {} //�ڱⰡ �ڱ� �ڽ����� ������� �����ڿ� private�� ��� ��
	public static Singleton getInstance() {//�ڽ��� ��ü�� ������ �� ����ϴ� �޼ҵ�
		return singleton; //�ڽ��� ��ü�� ������ �� ����ϴ� �޼ҵ� ��� �� getInstance�� ����ؾ� ��
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	public static void setSingleton(Singleton singleton) {
		Singleton.singleton = singleton;
	}
	
	
}
