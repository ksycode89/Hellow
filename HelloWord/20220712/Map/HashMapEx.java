package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<>(); //key & value
		map.put("락토핏", 80);
		map.put("김상영", 75);
		map.put("에디플라워", 95);
//		map.put(null, null);
		
		int score = map.get("락토핏"); //좌우타입값이 달라
		System.out.println(map.get("락토핏"));
		System.out.println(map.get("락톳핏"));//오타
		
		map.remove("에디플라워");
		//키관련 다담음
		map.keySet();
		System.out.println(map.keySet());
		map.values();
		System.out.println(map.values());
		
		//key만 우선 가져옴
		Set<String> KeySet=map.keySet();
		
		for(String key : KeySet) {
			Integer val = map.get(key);
			System.out.println("이름: "+key+" 점수: "+val);
		}
		
		///key 와 value를 하나의 담어서 불러옴
		Set<Entry<String, Integer>> entrySet = map.entrySet();
			for(Entry<String, Integer>ent : entrySet) {
				String key = ent.getKey();
						Integer val = ent.getValue();
						System.out.println("이름: "+key+" 점수: "+val);
			}
		
		
		
		
		
	}		
}