
public class Ex13 {

	public static void main(String[] args) {
		// 3��4���� 2���� �迭�� 1~100���� ����ϴ� Math.random()�� �̿��Ͽ�
		// ���� �Է��� �� �հ踦 ����Ͻÿ�.
		int ii[][] = new int[3][4];
		for(int row = 0; row<ii.length; row++) {
			for(int col =0 ; col <ii[row].length; col++) {
				ii[row][col] =(int)(Math.random() * 100) + 1;
			}
		}//foreach���� ����ؼ��� ���� ������ �� ���� for���̳� while�� ���
		 /*for(int [] row : ii) { 
			for(int col : row) {
				col = (int)(Math.random() * 100) + 1;
			}                   
		}*/   
		int sum = 0;
		for(int [] row : ii) { 
			for(int col : row) {
				sum += col;
			}                   
		}                       
		System.out.println(sum);
		int [] score = {60,89,56,73,66,90,95};
		// �հ�� ����� foreach���� ����ؼ� ���Ͻÿ�.
		sum = 0;
		for(int num : score) {
			sum += num;
		}
		System.out.println("�հ�� " + sum);
		System.out.println("����� " + sum / score.length);
	}
}








