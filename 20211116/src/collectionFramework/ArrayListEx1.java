package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		///// Ÿ���� �������ָ� ���� ����ȯ ����� ��
		
		//������ �ڷ���
		//Date date;
		List list = new ArrayList();//ctrl+shift+o�� ����Ʈ
		//list.add(1); (x)
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		for(int i = 0; i<list.size(); i++) {
			Board s = (Board)list.get(i); //board�� ���� ����ȯ ����
			System.out.println(s.getContent());
		}
	
		/////�Ʒ��� <> �κ� : ���ʸ�Ÿ�� / ���ʸ�Ÿ���� ������ ���� ����ȯ �� �ʿ� ����
		List<Board> list1 = new ArrayList();
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		for(int i = 0; i <list1.size(); i++) {
			Board s = list1.get(i);
			System.out.println(s.getContent());
			//System.out.println(list1.get(i).getContent());
		}
	}

}
