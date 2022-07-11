package edu;

public class ExDataType {
	public static void main(String[] args) {
		int num = 100;
		int num2 = num;

		num = 200;
		System.out.println("num= " + num + " /num2= " + num2);

		String name = "이순신";
		String name2 = "박길동";
		String tmp;
		
		tmp= name; 
		name=name2;
		name2=tmp;
		
		
		name = "박순신";
		System.out.println("name: " + name);
		System.out.println("name2: " + name2);

		Person a = new Person();
		a.name = "홍길동";
		a.age = 20;
		
		Person a2 = a;
		
		a.name= "박길동";
		a.age = 22;
		
		a2.name= "길동";
		a2.age = 25;
		
		
		System.out.println("이름: "+a.name+" 나이: "+a.age);
		System.out.println("이름: "+a2.name+" 나이: "+a2.age);
		
		
	}
}

class Person{
	String name = "";
	int age;
	
			
	
}