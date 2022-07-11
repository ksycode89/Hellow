package ExMoring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


//Array는 인덱스값저장
//HashSet은 인덱스값x 동일한값x
public class ExHastSet {
	public static void main(String[] args) {
		HashSet<String> hs1 = new HashSet<>();

		hs1.add("홍길동");
		hs1.add("김길동");
		hs1.add("홍길동");
		
		System.out.println("size= "+hs1.size());
		System.out.println("toString= "+hs1.toString());
		Iterator<String> iter = hs1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("--Array↓----Hash↑--");
		ArrayList<String> arl = new ArrayList<>();
		arl.add("홍길동");
		arl.add("김길동");
		arl.add("홍길동");
		System.out.println("size= "+arl.size());
		System.out.println("toSTring ="+arl.toString());
//		for (int i=0;i<arl.size();i++) {
//			System.out.println(arl.get(i));
//		}
		Iterator<String> iter2 = arl.iterator();
		while(iter2.hasNext()) {
			System.out.println("iterator test : "+iter2.next());
		}
		
		
	}

}
