
public class Ex19 {

	public static void main(String[] args) {
		// for�� 3�ܺ��� 7�ܱ���, 4������ 6������
		//     #1            #2
		for(int dan = 3 ; dan <= 7 ; dan ++) {
			//#3
			//       #3-1      #3-2     #3-4
			for(int gop = 4; gop <= 6; gop++) {
				// #-3
				System.out.println(dan + " * " + gop + " = " + dan*gop);
			}
			//3 ��
			
			System.out.println();
			dan = 3;
			while (dan <= 7) {
				//#3
				int gop = 4; //#3-1
				while (gop <= 6) {//#3-2
					//#3-3
					System.out.println(dan + " * " + gop + " = " + dan*gop);
					//#3-4
					gop++;
				}
				dan ++ ;//#4
			}
		}
		

	}

}
