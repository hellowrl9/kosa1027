package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();//ctrl,shift,o·Î import
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("¹Ú½Ã¾Æ", 20));
		System.out.println(set.size());
		
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.getName());
			if(m.getName().equals("ÀÌ¼þ¹«")) {
				set.remove(m);
				break;
			}
		}
		set.remove(0);
		System.out.println(set.size());

	}

}
