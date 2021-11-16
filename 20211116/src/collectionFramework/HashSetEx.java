package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();//ctrl,shift,o�� import
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("�ڽþ�", 20));
		System.out.println(set.size());
		
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.getName());
			if(m.getName().equals("�̼���")) {
				set.remove(m);
				break;
			}
		}
		set.remove(0);
		System.out.println(set.size());

	}

}
