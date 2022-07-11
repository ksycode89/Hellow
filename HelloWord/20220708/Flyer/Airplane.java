package Flyer;

public class Airplane implements Flyer {

	public void takeOff() {
		System.out.println("비행기가 이륙합니다");
	}

	public void fly() {
		System.out.println("비행기가 비행중입니다.");
	}

	public void land() {
		System.out.println("비행기가 착륙합니다.");
	}

}
