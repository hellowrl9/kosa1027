
public class Ex14 {

	public static void main(String[] args) {  
		/*i = 1 #1
		while i <= 9: #2
			print(i) #3
			i ++ #4 > 10
		#1 > 2 > 3 > 4 > 2 > 3 > 4 > ... > #2���� �ݺ����̳��� 
		<for ���� ���� ����>      
		        #1	     #2	   #4
		*/
		for(int i = 1; i <= 9; i++){
			//#3
			System.out.println("5 * " + i +" = " + 5*i);
		// #1 > 2 > 3 > 4 > 2 > 3 > 4 > ... > #2
		}
		
		int i = 1;
		for(; i <= 9;){
			System.out.println("5 * " + i +" = " + 5*i);
			i++;
		}
		
		System.out.println("---while---");
		i = 1;
		while (i <= 9) {
			System.out.println("5 * " + i +" = " + 5*i);
			i++;
		}
		//while������ 3�� ���
		int gop = 1;
		while (gop <= 0) {
			System.out.println("3 * " + gop + " = " + 3*gop);
		}
		/*i = 1;
		for(; i <= 9;){
			System.out.println("3 * " + i +" = " + 5*i);
			i++;
		*/
		
		System.out.println("===========");
		for(gop = 3; gop <= 7; gop++) {
			System.out.println("3 * " + gop + " = " + 3*gop);
		}
		
		System.out.println("=====While=====");
		gop = 3;
		while (gop <= 7) {
			System.out.println("3 * " + gop + " = " + 3*gop);
			gop ++;
		}
	}
}