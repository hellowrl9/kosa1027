import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// num = int(input("ù��° ���ڸ� �Է����ּ���."))
		// scanner : ctrl + shift + ���� o ����Ű�� �ڵ����� import ����
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���. : "); //println�� line(����)�̶�� ������,
		//���� ��ġ ���� �� print��� ���ָ� �ȴ�
		String name = sc.next();
		System.out.println("�̸� : "+name); //syso +ctrl + space �� ����Ű�� �Է� ����
		System.out.println("���ڸ� �Է��ϼ���. : "); //println�� line(����)�̶�� ������,
		//���̽�� input �ٸ���, �Է��϶�� �� �ڹٴ� ���⿡ ���������
		int num = sc.nextInt();
		System.out.println("���� : "+num);
		*/
	
		// ���� : �ܰ� ���� ������ �Է¹޾� �������� ����϶�

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���� ���� �Է��ϼ���.");
			int startDan = sc.nextInt();
			System.out.println("������ ���� �Է��ϼ���."); 
			int endDan = sc.nextInt();
			System.out.println("���� ���� �Է��ϼ���.");
			int startGop = sc.nextInt();
			System.out.println("������ ���� �Է��ϼ���."); 
			int endGop = sc.nextInt();
					
			int dan = startDan;
			while (dan <= endDan) {
			int gop = startGop;
			while (gop <= endGop) {
				System.out.println(dan + " * "+gop+" = "+dan*gop);
				gop++;}
			dan++;
		}
		sc.next();
		System.out.println("�����Ϸ��� 'y', �ƴϸ� �ƹ��ų� �����ÿ�.");
		String stop = sc.next();
		if(stop.equals('y')) 
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
	}
}

