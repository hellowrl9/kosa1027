package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("�̼���", 35);
		int age = map1.get("�̼���");

		Map<Integer, Double> map2 = new HashMap<Integer, Double>();
		map2.put(1, 10.5);
		double d = map2.get(1);
		System.out.println(d);
		
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("�̼���", new Member("�̼���", 30));
		map.put("�̻��", new Member("�̻��", 15));
		map.put("�����", new Member("�����", 18));
		map.put("�̰ṫ", new Member("�̰ṫ", 85));

		Member m = map.get("�̼���");
		System.out.println(map.get("�̼���"));
		}

}
