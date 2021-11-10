import java.util.Scanner;

public class AccountMain {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctr+shift+o로 임포트
//		Account acc = new Account("1111","이숭무",100);
//		Account acc1 = new Account("2222","이상범",100);
//		Account acc2 = new Account("3333","이장범",100);	
		//위 account를 아래처럼 배열로 만듦
		int arrayNum = 0; // 배열의 현재 번호를 가지기 위한 변수
		Account [] accs = new Account[100]; //#1.배열 100개 만듦
		/*
		 * stack                         heap
		 * accs 10000                      10000 |Account|....|..||
		 * acc = accs[0]                            0       ~    99(총 100)
		*/
		//배열의 index는 0번부터 시작
		boolean run = true;
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
		String accountNo = sc.nextLine(); 
		System.out.print("예금주 : ");
		String owner = sc.nextLine();
		System.out.print("금액 : ");
		int money = sc.nextInt();
		accs[arrayNum] = new Account(accountNo, owner, money);
		arrayNum++; break;
		
		case 2 : System.out.println("계좌목록 페이지입니다.");
		System.out.println("계좌 번호 \t\t 계좌주 \t\t 금액");
		for(int i = 0; i <accs.length; i++) {
			if(accs[i] ==null) break; 
			System.out.println(accs[i].getAccountNo()+
					"\t\t"+accs[i].getOwner()+"\t\t"+accs[i].getBalance());}break; 
		
		case 3 : System.out.println("예금 페이지입니다."); 
		System.out.println("계좌번호 : ");
		accountNo = sc.nextLine();
		System.out.println("예금액 : ");
		money = Integer.parseInt(sc.nextLine()); //ctrl + space
		Account acc = null;
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null) break;
			else {
				if (accs[i].getAccountNo().equals(accountNo)) {
				//계좌번호가 일치하는 Account를 가지고 와서 acc에 저장
					acc = accs[i];
					//acc = accs[0], acc= accs[1]...
				}
			}
		}
		int result = acc.getBalance() + money;
		acc.setBalance(result);
		System.out.println();
		break;
		
		case 4 : System.out.println("출금 페이지입니다."); 
		System.out.println("계좌번호 : ");
		accountNo = sc.nextLine();
		System.out.println("예금액 : ");
		money = Integer.parseInt(sc.nextLine()); //ctrl + space
		acc = null;
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null) break;
			else {
				if (accs[i].getAccountNo().equals(accountNo)) {
				//계좌번호가 일치하는 Account를 가지고 와서 acc에 저장
					acc = accs[i];
					//acc = accs[0], acc= accs[1]...
				}
			}
		}
		result = acc.getBalance() - money;
		acc.setBalance(result);
		break;
		
		case 5 : run = false; break; //System.exit(0); //프로그램 종료
		}
	}while(run);
 }
	public static void accountPrint() {
		
	}
}