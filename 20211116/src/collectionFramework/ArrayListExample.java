package collectionFramework;

import java.util.ArrayList; //ctrl+shift+o�� import
import java.util.List;

public class ArrayListExample {
	public static void main(String [] args) {
	
	//�ڹ� ����Ʈ �迭 ����
	String str [] = {"����","�ڹ�","�ʹ�","���ƿ�"};
	System.out.println(str.length); //�迭�� ũ��� �����̴�.
	str[3] = "�����ƿ�";
	//str[4] = "."; //3������ �����ϱ� ������ 4 �ϸ� ArrayIndexOutOfBoundsException ������
	//����Ʈ�� ũ�Ⱑ �������̴�. �迭�� �Ȱ��� ���� Ÿ�Ը� ������.
	
	List list = new ArrayList(); //���̽� ����Ʈ�� ����ϴ�.
	list.add("�̼���");//python�� append
	list.add("�̻��");
	list.add("�����");	
	list.add("�����"); //����Ʈ������ ���� ���� ����ȴ�
	System.out.println(list.get(0));
	System.out.println(list.get(1));
	System.out.println();
	System.out.println(list.get(2));
	System.out.println();
	
	for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i)); }

	for(Object obj : list) {
		System.out.println(obj);
	}
	List<String> list1 = new ArrayList<String>();
	list1.add("�̼���");//python�� append
	list1.add("�̻��");
	list1.add("�����");
	for(String s : list1) {
		System.out.println((s));}
	
	int i = 10;
	Object obj1 = 10;
	System.out.println(obj1);
	String st = "�̼���";
	obj1 = "�̼���";
	double f = 10.5;
	obj1 = 10.5; 
	}
}