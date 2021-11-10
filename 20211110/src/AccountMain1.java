import java.util.Scanner;

public class AccountMain1 {
	static Account [] accs = new Account[100]; //#1.배열 100개 만듦
	static Scanner sc = new Scanner(System.in); //ctr+shift+o로 임포트
	static int arrayNum = 0; // 배열의 현재 번호를 가지기 위한 변수

	static boolean run = true;
	public static void main(String[] args) {

		//while(run) {
		do 
		{System.out.println("1. 계좌등록 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("선택 > ");
		//String selecNo = sc.nextLine(); /string하면 엔터까지 가져와서 계좌번호까지만 입력 후 예금주로 넘어감
		int selecNo = sc.nextInt(); // 123456\n
		//int로 하면 계좌번호 끝나고 예금주 출력됨
		sc.nextLine(); //계좌번호 등록할때 엔터까지 입력하는데, 입력장치에 \n값이 있는 것을 없애기 위해 사용
		switch(selecNo) {
		
		case 1 : System.out.println("계좌등록 페이지입니다."); 
		System.out.print("계좌 번호 : ");
		String accountNo = sc.nextLine(); System.out.print("예금주 : ");
		String owner = sc.nextLine();
		System.out.print("금액 : ");
		int money = sc.nextInt();
		accs[arrayNum] = new Account(accountNo, owner, money);
		arrayNum++; break;
		
		case 2 : System.out.println("계좌목록 페이지입니다.");
		System.out.println("계좌 번호 \t\t 계좌주 \t\t 금액");
		
		accountPrint();
		System.out.println(); break; 
				
		case 3 : System.out.println("예금 페이지입니다."); 
		System.out.println("계좌번호 : ");
		accountNo = sc.nextLine();
		System.out.println("예금액 : ");
		money = Integer.parseInt(sc.nextLine()); //ctrl + space
		
		Account acc = accountFind(accountNo);
		
		int result = acc.getBalance() +money;
		acc.setBalance(result);
		System.out.println();
		break;
		
		case 4 : System.out.println("출금 페이지입니다."); 
		System.out.println("계좌번호 : ");
		accountNo = sc.nextLine();
		System.out.println("출금액 : ");
		money = Integer.parseInt(sc.nextLine()); //ctrl + space
		
		acc = accountFind(accountNo);
	
		result = acc.getBalance() - money;
		acc.setBalance(result);
		break;
		
		case 5 : run = false; break; //System.exit(0); //프로그램 종료
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