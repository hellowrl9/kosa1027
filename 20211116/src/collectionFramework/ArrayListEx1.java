package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		///// 타입을 안적어주면 강제 형변환 해줘야 함
		
		//왼쪽은 자료형
		//Date date;
		List list = new ArrayList();//ctrl+shift+o로 임포트
		//list.add(1); (x)
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		for(int i = 0; i<list.size(); i++) {
			Board s = (Board)list.get(i); //board로 강제 형변환 해줌
			System.out.println(s.getContent());
		}
	
		/////아래의 <> 부분 : 제너릭타입 / 제너릭타입이 있으면 강제 형변환 할 필요 없음
		List<Board> list1 = new ArrayList();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		for(int i = 0; i <list1.size(); i++) {
			Board s = list1.get(i);
			System.out.println(s.getContent());
			//System.out.println(list1.get(i).getContent());
		}
	}

}
