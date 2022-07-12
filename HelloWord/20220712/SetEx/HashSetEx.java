package SetEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Hash, Tree
public class HashSetEx {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("사괍");
	set.add("딸기");
	set.add("수박");
	set.add("딸기");
	
	System.out.println("set의 크기는 : "+set.size());
	
	set.remove("딸기");
	System.out.println(set.contains("딸기"));
	
	 if(set.isEmpty()) {
		 System.out.println("비어있습니다.");
	 }
	
	 Iterator<String> itr = set.iterator();
	 while(itr.hasNext()) {
		 String val = itr.next();
		 System.out.println(val);
		 
	 }
	
	for(String val : set) {
		System.out.println(val);
	}
	
	
	
	
}
}
