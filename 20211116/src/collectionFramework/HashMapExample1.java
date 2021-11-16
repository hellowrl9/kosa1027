package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map, �÷���
public class HashMapExample1 {
	public static void main(String [] args) {
	//��ųʸ� dic = {"a":1, "b":2} : Map
	//print(dic["a"]) //dic.keys()
	//�÷���
	List<String> list = new ArrayList<String>();
	list.add("�̼���");
	//Map �÷��� ���� : Map<Ű,��>
	//    Ű       ��
	Map<String, Integer> map = new HashMap<String, Integer>();
	//��ü ����
	map.put("�̼���", 35);
	map.put("���̹�", 34);
	map.put("�̼���", 33);
	map.put("�̶�", 32);
	map.put("�̹ι�", 31);
	map.put("���Ϲ�", 30);
	map.put("���Ϲ�", 90);// �ߺ� Ű�� ������� �ʽ��ϴ�.
	System.out.println("map�� ũ��� "+map.size());
	System.out.println("���Ϲ��� ���̴� "+map.get("���Ϲ�")); //Ű�� �־��ֱ�
	
	map.put("���̹�", 40); //Ű�� ���� ������ �� �ִ�
	
	Set<String> keySet = map.keySet(); //Ű�� �����ϸ� Set �ڷ������� ������
	for(String key : keySet) {
		System.out.println(key+"�� ���̴� "+map.get(key)+"���Դϴ�.");
	}
	
	Iterator<String> iterator = keySet.iterator();
	while(iterator.hasNext()) {
		String key = iterator.next();
		System.out.println(map.get(key));
	}
	
	System.out.println();
	map.remove("ȫ�浿");
	System.out.println(map.size());
	
	map.clear();
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	
	}
}