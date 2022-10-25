package Collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		
		// Key : Integer, val : String
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "홍길동");
		map.put(200, "김기영");
		map.put(300, "박문식");
		map.put(300, "윤문식");
		
		map.remove(300); // 삭제.
		
		System.out.println("컬렉션 : " + map.size());
		System.out.println("val : " + map.get(300));
		
		//반복자 생성
		Set<Integer> KeySet = map.keySet(); // 키값만 새로운 set컬렉션에 저장
		for(Integer Key : KeySet) {
			System.out.println("키 : " + Key + " 값 : " + map.get(Key));
		}
		
		Set<Entry<Integer, String>> entSet = map.entrySet();
		for(Entry<Integer, String> ent : entSet) {
			System.out.println("키 : " + ent.getKey() + ", 값 : " 
								+ ent.getValue());
		}
		
		
	}
}

