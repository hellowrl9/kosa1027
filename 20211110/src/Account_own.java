import java.util.Scanner;//#02:ctrl+shift+o

public class Account_own {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//#01
		//#1
		int i = 0;
		System.out.println("���µ�� : 1 | �Ա� : 2 | ��� : 3 | ������� : 4 | ���� : 5");
		System.out.println("�ش��ȣ�� �Է����ּ���. : ");
		
		if (i == 1)
		{System.out.println("���µ�� �������Դϴ�."); }
		else if (i == 2)
		{System.out.println("�Ա��������Դϴ�."); }
		else if (i == 3)
		{System.out.println("����������Դϴ�."); }
		else if (i == 4)
		{System.out.println("���� ����������Դϴ�"); }
		else if (i == 5) 
		{System.out.println("���α׷� �����մϴ�."); }
		else 
		{System.out.println("�ٽ� �������ּ���."); }	
	}

}