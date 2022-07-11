package edu;

public class Car {
	String model;
	int price;
	int maxSp; 
	double weight;
	String color;
	int speed;
	
	public Car() {
		maxSp = 200;
	}
	public Car(int price, double weight) {
		this.price = price;
		this.weight=weight;
		
	}
	
	
	public void setSp(int speed) {
		this.speed=speed;
	}
	public void start() {
		System.out.println(model+"이 외칩니다. 아수라다 간다!!!!");
	}
	public void run() {
		System.out.println(model+"부스터온!!");
	}
	public void stop() {
		System.out.println(model+"이 끼이이이읶ㄲㄲ하고 웁니다.");
	}

	public void showSp() {
		System.out.println("현재 "+model+"스피드는 "+speed+"Km/h입니다.");
	}
}
