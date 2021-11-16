package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("�̼���");
		set.add("�̻��");
		set.add("���湫");
		set.add("�̱湫"); 
		set.add("�̱湫"); //���� ���� ������� �ʴ´�
		int size = set.size();
		System.out.println(size);
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = (String)iterator.next();
			System.out.println(s);
		}
		set.remove("�̼���");
		size = set.size();
		System.out.println(size);
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
