package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map, 컬렉션
public class HashMapExample1 {
	public static void main(String [] args) {
	//딕셔너리 dic = {"a":1, "b":2} : Map
	//print(dic["a"]) //dic.keys()
	//컬렉션
	List<String> list = new ArrayList<String>();
	list.add("이숭무");
	//Map 컬렉션 생성 : Map<키,값>
	//    키       값
	Map<String, Integer> map = new HashMap<String, Integer>();
	//객체 저장
	map.put("이숭무", 35);
	map.put("이이무", 34);
	map.put("이숭민", 33);
	map.put("이라무", 32);
	map.put("이민무", 31);
	map.put("이하무", 30);
	map.put("이하무", 90);// 중복 키를 허용하지 않습니다.
	System.out.println("map의 크기는 "+map.size());
	System.out.println("이하무의 나이는 "+map.get("이하무")); //키를 넣어주기
	
	map.put("이이무", 40); //키로 값을 수정할 수 있다
	
	Set<String> keySet = map.keySet(); //키를 추출하면 Set 자료형으로 가져옴
	for(String key : keySet) {
		System.out.println(key+"의 나이는 "+map.get(key)+"살입니다.");
	}
	
	Iterator<String> iterator = keySet.iterator();
	while(iterator.hasNext()) {
		String key = iterator.next();
		System.out.println(map.get(key));
	}
	
	System.out.println();
	map.remove("홍길동");
	System.out.println(map.size());
	
	map.clear();
	System.out.println(map.size());
	System.out.println(map.isEmpty());
	
	}
}