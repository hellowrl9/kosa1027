
public class Ex02 {
	final int first; //final ������ ����� �̸��� ��� �빮�ڿ��� ��
	final int second; //����ó�� �ҹ��ڷ� �ᵵ �������� ������ ��ó�� ����� �����
	final String GOODS_PRICE;
	String name;
	public Ex02(int first, int second, String GOODS_PRICE){
		this.first = first; //�ʱⰪ ������ ��
		this.second = second; //�ʱⰪ ������ ��
		this.GOODS_PRICE = "";
	}
// �Ʒ�ó�� setter�� ���ؼ� ���� ������ �� ����
//	public void setFirst(int first) {
//		this.first = first;
//	}
	public void setName(String name) {//name �빮�� �ƴ϶� �ҹ���
		this.name = name;
	}//getter �ƴϹǷ� void
	public String getName() {
		return this.name;
	}
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
}
