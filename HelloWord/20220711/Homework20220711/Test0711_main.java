package Homework20220711;

import java.util.HashMap;

public class Test0711_main {
public static void main(String[] args) {
		HashMap<Test0711, String>hashMap = new HashMap<>(10);
		Test0711 a = new Test0711("100");
		Test0711 a2 = new Test0711("100");
		
		hashMap.put(a,"김상영");
		hashMap.put(a2,"김상영");
		System.out.println(a.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println();
		
		System.out.println(a.equals(a2));
	
		System.out.println();
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
		
		
		
		
}
}
