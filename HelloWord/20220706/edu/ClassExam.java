package edu;

import java.util.Scanner;

public class ClassExam {
public static void main(String[] args) {
	String name = "히사이시 조";
	int age = 71;
	
	String[] names = {"히사이시조","존슈미츠","크레인"};
	int[] scores = {92,97,88};
	int[] ages = {71,55,60};
	
	ExPerson p1 = new ExPerson(); 
	p1.name = "히사이시조";
	p1.score = 92;
	p1.age = 71;
	
	
	ExPerson p2 = new ExPerson(); 
	p2.name = "존슈미츠";
	p2.score = 97;
	p2.age = 60;
	
	
	ExPerson p3 = new ExPerson(); 
	p3.name = "크레인";
	p3.score = 88;
	p3.age = 60;
	
//	ExPerson [] students = {p1,p2,p3};
//	Scanner scn = new Scanner(System.in);
//	System.out.println("[저장된 학생의 이름은]");
//	for (int i=0; i<students.length;i++) {
//		System.out.print(students[i].name+" /");
//	}
//	System.out.println("\n원하는 대상의 이름을 입력하세요");
//	System.out.print("-- >");
//	String serach = scn.nextLine();
//	
//	
//	
//	for(int i=0; i<students.length;i++) {
//	 if (students[i].name.equals(serach)) {
//		 System.out.println("["+serach+"의 정보를 출력합니다.]");
//		 p3.meth();
//	 }
//	}
	Car c1 = new Car(30000,3.3);
	c1.model = "소나타";
	c1.speed  =30;
	c1.setSp(90);
	System.out.println("최속은 "+c1.maxSp+"Km/h"); 
	c1.color= "red";
	c1.showSp();
	System.out.println(c1.price+"="+c1.weight);

	Car c2 = new Car();
	c2.model = "그랜저";
	c2.price = 4000000;
	c2.speed = 50;
	c2.maxSp=300; 
	c2.weight= 2.5;
	c2.color= "pink";
	
	
	
	
	
	
	
}	




}
