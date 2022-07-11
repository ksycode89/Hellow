package edu;

public class CellPhone {
	//field
	private String model;
	private String color;
	
	//default constructor
	public CellPhone() {
		super();
	}
	//full constructor
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//getter setter start
	public void receiveVoice() {
		System.out.println("get Hello");
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//getter setter end
	
	//toString 
	@Override
	public String toString() {
		return " [모델명은 " + model + "이고 "+"색은 "+ color+"입니다."+"]";
	}
	
	
	
	
	//function
	public void powerOn() {
		System.out.println("Feels Good~");
	}
	
	
	public void powerOff() {
		System.out.println("Good Bye");
	}
	public void bell() {
		System.out.println("RRRRRRRRRR~R");
	}
	public void sendVoice() {
	System.out.println("Hello ");		
	}
	//function
		
}//class
