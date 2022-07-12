package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//이름 정수 - 맵저장
// 
//학생이름넣으면 점수 반환 
public class MapEx {
	public static void main(String[] args) {
	Map<String, Integer>map = new HashMap<>();
	Scanner scn = new Scanner(System.in);
	
	map.put("김상영",80);
	map.put("이현성", 90);
	map.put("이주훈",100);
	
	map.keySet();
	System.out.println(map.values());
	map.values();
	
	int sum =0;
	
	Set<String> KeySet=map.keySet();
	
	for(String key : KeySet) {
		
		Integer val = map.get(key);
		sum +=val;
//		System.out.println(sum);
		
	}System.out.println("평균은 " +sum/map.size());
	
	String one = null;
	int max= 0;
	for(String key : KeySet) {
		Integer val = map.get(key);
		
		if(max<(map.get(key))) {
			max=val;
			one=key;
		}
		
		
	}System.out.println("최대값은 "+max+" 학생의 이름은 "+one );
	
	
	
	
	
//	for(int i=0;i<map.size();i++) {
////		sum+=map.get(i);
//		System.out.println(sum);
//	}
	
	
//	System.out.println("원하는 사람을 입력하세요.");
//	String input = scn.nextLine();
//	
//	Set<String> KeySet=map.keySet();
//	
//	for(String key : KeySet) {
//		if(input.equals(key)) {
//		Integer val = map.get(input);
//		System.out.println(key+"의 점수: "+val);
//		}
//	}
//	
//	
	
//	 for (int i=0;i<map.size();i++) {
//		  if() {
//			  Integer val = map.get(input);
//				System.out.println("점수: "+val);
//			  
//		  }
//	 }
	
	
	}
}
