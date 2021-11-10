import java.util.Scanner;

public class AccountMain1 {
	static Account [] accs = new Account[100]; //#1.�迭 100�� ����
	static Scanner sc = new Scanner(System.in); //ctr+shift+o�� ����Ʈ
	static int arrayNum = 0; // �迭�� ���� ��ȣ�� ������ ���� ����

	static boolean run = true;
	public static void main(String[] args) {

		//while(run) {
		do 
		{System.out.println("1. ���µ�� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
		System.out.println("���� > ");
		//String selecNo = sc.nextLine(); /string�ϸ� ���ͱ��� �����ͼ� ���¹�ȣ������ �Է� �� �����ַ� �Ѿ
		int selecNo = sc.nextInt(); // 123456\n
		//int�� �ϸ� ���¹�ȣ ������ ������ ��µ�
		sc.nextLine(); //���¹�ȣ ����Ҷ� ���ͱ��� �Է��ϴµ�, �Է���ġ�� \n���� �ִ� ���� ���ֱ� ���� ���
		switch(selecNo) {
		
		case 1 : System.out.println("���µ�� �������Դϴ�."); 
		System.out.print("���� ��ȣ : ");
		String accountNo = sc.nextLine(); System.out.print("������ : ");
		String owner = sc.nextLine();
		System.out.print("�ݾ� : ");
		int money = sc.nextInt();
		accs[arrayNum] = new Account(accountNo, owner, money);
		arrayNum++; break;
		
		case 2 : System.out.println("���¸�� �������Դϴ�.");
		System.out.println("���� ��ȣ \t\t ������ \t\t �ݾ�");
		
		accountPrint();
		System.out.println(); break; 
				
		case 3 : System.out.println("���� �������Դϴ�."); 
		System.out.println("���¹�ȣ : ");
		accountNo = sc.nextLine();
		System.out.println("���ݾ� : ");
		money = Integer.parseInt(sc.nextLine()); //ctrl + space
		
		Account acc = accountFind(accountNo);
		
		int result = acc.getBalance() +money;
		acc.setBalance(result);
		System.out.println();
		break;
		
		case 4 : System.out.println("��� �������Դϴ�."); 
		System.out.println("���¹�ȣ : ");
		accountNo = sc.nextLine();
		System.out.println("��ݾ� : ");
		money = Integer.parseInt(sc.nextLine()); //ctrl + space
		
		acc = accountFind(accountNo);
	
		result = acc.getBalance() - money;
		acc.setBalance(result);
		break;
		
		case 5 : run = false; break; //System.exit(0); //���α׷� ����
		}
	}while(run);}
	
	public static Account accountFind(String accountNo) {
		for(int i = 0; i < accs.length; i++) {
			if(accs[i] == null) break; 
			else {
					if(accs[i].getAccountNo().equals(accountNo))
					{return accs[i];
					}
			}
		}return null;
	}

	public static void accountPrint() {
		for(int i = 0; i < accs.length; i++) {
		if(accs[i] ==null) break; 
		System.out.println(accs[i].getAccountNo()+
					"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance()); 
		}		
}
}