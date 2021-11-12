package polymorphism;

public class Tire {
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {//Ÿ�̾ �������� �޼���
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� : "+
		(maxRotation - accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location+
					" HankookTire ��ũ ***");
			return false;
		}
	}
}
