
public class Ex16 {

	public static void main(String[] args) {
		//��� for���� foreach�� �ΰ��� ����� ����ؼ� ����Ͻÿ�.
		int [] i = {1,2,3,4,5,6};
		for(int j = 0; j < i.length ; j++) {
			System.out.println(i[j]);
		}
		for (int j : i) {
			System.out.println(j);
		}
		System.out.println("===========================");
		String [] str = {"�̼���", "�̻��", "�����",  "������"};
		for(int j = 0; j < str.length ; j++) {
			System.out.println(str[j]);
		}
		for (String j : str) {
			System.out.println(j);
		}
		System.out.println("===========================");
		double [] d = {10.5, 20.6, 40.7, 200.8};
		for(int j = 0; j < d.length ; j++) {
			System.out.println(d[j]);
		}
		for (double j : d) {
			System.out.println(j);
		}
		System.out.println("===========================");
		WEEK1 [] days = WEEK1.values();
		for(int j = 0; j < days.length ; j++) {
			System.out.println(days[j]);
		}
		for (WEEK1 j : days) {
			System.out.println(j);
		}
		System.out.println("===========================");
		String [][] locations = {{"������","�뷮��","����"},
								  {"��","��","��"},
								  {"���", "����", "�̱�"}};
		for(int j = 0; j< locations.length ; j++) {
			for(int k = 0; k < locations[j].length ;k++) {
				System.out.println(locations[j][k]);
			}
		}
		for(String [] loc : locations) {
			for(String s : loc) {
				System.out.println(s);
			}
		}
		System.out.println("===========================");
		int [][] vals = {{1,2,3},{4,5},{6,7,8,9}};
		for(int j = 0; j< vals.length ; j++) {
			for(int k = 0; k < vals[j].length ;k++) {
				System.out.println(vals[j][k]);
			}
		}
		for(int [] val : vals) {
			for(int s : val) {
				System.out.println(s);
			}
		}
	}

}
