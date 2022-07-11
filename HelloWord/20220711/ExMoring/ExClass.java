package ExMoring;

import java.lang.reflect.Method;
import java.util.Iterator;

public class ExClass {
public static void main(String[] args) {
	
	
	
	
	try {
		Class cls = Class.forName("java.lang.String");
		cls = String.class;
		System.out.println(cls.getName());
		
		
		Method[] method = cls.getMethods();
		for (Method methods : method) {
			System.out.println(methods.getName());
		}
//		
		
//		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
			
	
	
}
}
