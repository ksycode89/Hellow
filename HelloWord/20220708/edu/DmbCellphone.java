package edu;

public class DmbCellphone extends CellPhone {
	private int channel;
//	private 
//	private 

	public DmbCellphone() {
		super();
	}
	public DmbCellphone(String model,  String color, int channel) {
		super(model,color);
		this.channel=channel;
		
	}
	
	@Override
	public void powerOn() {
		
		System.out.println("DMB폰의 전원이 켜집니다.");
	}
	@Override
	public void powerOff() {
		
		System.out.println("DMB폰의 전원이 꺼집니다.");
	}
			
			
	@Override
	public String toString() {
		return "[채널정보는 " + channel + ", 모델은 " + getModel() + ", 색은 " + getColor()
				+ "]";
	}
	
	public int getChnnel() {
		return channel;
	}

	public void setChnnel(int chnnel) {
		this.channel = chnnel;
	}

	public void DmbOn() {
		System.out.println("DMB를 시작합니다.");
	}

	public void DmbOff() {
		System.out.println("DMB를 종료합니다.");
	}

}
