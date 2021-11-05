import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// num = int(input("첫번째 숫자를 입력해주세요."))
		// scanner : ctrl + shift + 영어 o 단축키로 자동으로 import 가능
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요. : "); //println은 line(개행)이라는 뜻으로,
		//개행 원치 않을 시 print라고만 써주면 된다
		String name = sc.next();
		System.out.println("이름 : "+name); //syso +ctrl + space 시 단축키로 입력 가능
		System.out.println("숫자를 입력하세요. : "); //println은 line(개행)이라는 뜻으로,
		//파이썬과 input 다르게, 입력하라는 걸 자바는 여기에 적어줘야함
		int num = sc.nextInt();
		System.out.println("숫자 : "+num);
		*/
	
		// 문제 : 단과 곱의 범위를 입력받아 구구단을 출력하라

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("시작 단을 입력하세요.");
			int startDan = sc.nextInt();
			System.out.println("마지막 단을 입력하세요."); 
			int endDan = sc.nextInt();
			System.out.println("시작 곱을 입력하세요.");
			int startGop = sc.nextInt();
			System.out.println("마지막 곱을 입력하세요."); 
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
		System.out.println("종료하려면 'y', 아니면 아무거나 누르시오.");
		String stop = sc.next();
		if(stop.equals('y')) 
			System.out.println("프로그램을 종료합니다.");
			break;
		}
	}
}

