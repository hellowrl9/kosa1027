import java.util.Scanner;//#02:ctrl+shift+o

public class Account_own {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//#01
		//#1
		int i = 0;
		System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌출력 : 4 | 종료 : 5");
		System.out.println("해당번호를 입력해주세요. : ");
		
		if (i == 1)
		{System.out.println("계좌등록 페이지입니다."); }
		else if (i == 2)
		{System.out.println("입금페이지입니다."); }
		else if (i == 3)
		{System.out.println("출금페이지입니다."); }
		else if (i == 4)
		{System.out.println("계좌 출력페이지입니다"); }
		else if (i == 5) 
		{System.out.println("프로그램 종료합니다."); }
		else 
		{System.out.println("다시 선택해주세요."); }	
	}

}