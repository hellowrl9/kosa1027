package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("�̼���");
		list.add("�̻��");
		list.add("�����");
		for(int i = 0; i < list.size(); i++) {
		String s = (String)list.get(i);
		System.out.println(s);
		}
		//�Ʒ�ó�� ������� �ʴ´�
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		List<Integer>list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		//����Ʈ�� �ִ� ���� ����
		list1.remove(0);
		System.out.println(list1.size());
		
		System.out.println();
		System.out.println(list.size());
		for(Object obj : list) {
			String s = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println(list.size());
		list.remove("�̻��");
		System.out.println(list.size());
		list.removeAll(list);
		System.out.println(list.size());
		list.add("�̼���");
		System.out.println(list.isEmpty());
		//add, remove, size, isEmpty
	}

}
