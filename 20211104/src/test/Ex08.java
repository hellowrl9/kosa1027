package test;

public class Ex08 {

	public static void main(String[] args) {
		int i = -128;
		System.out.println(-i);
		//y = 3 + 4 //3항 연산
		int i1 = 1;
		i1 = i1 +1; // i1 = 1 + 1
		System.out.println(i1);
		i1 = i1 + 1;
		System.out.println(i1);
		
		++i1; //i1 = i1 + 1 : 선행 연산
		//1 증가
		System.out.println(i1); //단항 연산
		i1++; //i1 = i1 + 1 : 후행 연산
		
		System.out.println(i1); //단항 연산
		int y = ++i1;//i1 = i1 + 1; y = i1;
					//i1 = 5 + 1; y = 6;
		System.out.println(y);
		System.out.println(i1);
		
		y = i1++; //후행 연산 // y = i1; i1 = i1 + 1
		System.out.println(y);
		System.out.println(i1);
		
		int i2 = 10;
		i2 = i2 - 1; //1 감소
		System.out.println(i2);
		
		i2 = i2 - 1; //1 감소
		System.out.println(i2);
		--i2; //i2 = i2 -1 : 선행 연산 
		System.out.println(i2);
		i2--; //단항임       : 선행 연산
		System.out.println(i2);
		
		System.out.println(i2);
		y = --i2; //i2 = i2 -1 ; y =i2 /선행 연산
		System.out.println(y);
		System.out.println(i2);
		
		y = i2--; //y =i2; i2 = i2 -1
		System.out.println(y);
		System.out.println(i2);
		
		i1 = 10;
		System.out.println(++i1);//선행 11 
		System.out.println(i1);//11
		
		//!중요! 후행 예시! 잘 이해하기!
		i1 = 10;
		System.out.println(i1++); //10
		/* System.out.printls(i1);
		 * i1 = i1 + 1
		 */
		System.out.println(i1);
		
		System.out.println(i1); //11
		int i3 = 10;
		int j = 20;
		int z = ++i3 + j++;
		// i3 = i3 + 1 = 11
		// z = 11 + 20
		// j = j + 1 = 21
		System.out.println("z =" +z);
		System.out.println("i3 =" +i3);
		System.out.println("j =" +j);
	}

}
