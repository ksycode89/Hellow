package edu;

public class CellPhoneApp {
	public static void main(String[] args) {
		CellPhone cPhone = new CellPhone();
		DmbCellphone phone = new DmbCellphone("아이폰","핑크",100);
		System.out.println("[cellPhone 체크] \n");
		cPhone.powerOn();
		cPhone.powerOff();
		cPhone.setModel("젤리폰");
		cPhone.setColor("연보라");
		
		//부모기능 
		System.out.println("\n[DMBPhone 체크]\n");
		System.out.println(phone.toString());
		
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();
		phone.powerOff();
				//본인기능
		phone.DmbOn();
		phone.DmbOff();
		
		//SmartPhone
		System.out.println("\n[SmartPhone 체크]\n");
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("K phone");
		sphone.setColor("pink");
		
		sphone.wifiOn();
		sphone.wifiOff();
		
		//상속계층
		CellPhone dPhone = new  DmbCellphone();
		DmbCellphone sPhone2 = new SmartPhone();
	
		System.out.println(cPhone.toString());
		
		// 타입의 기능만 사용가능  //
//		dPhone.Dmbon();    // 불가 타입이 Cell
		sPhone2.DmbOn();  // 가능
//		sPhone2.wifiOn();// 불가 타입이 DMB
		
		//cell폰 타입이었던걸 dmp폰 타입으로 
		if (dPhone instanceof SmartPhone) {
		DmbCellphone upgrageDmb = (DmbCellphone)dPhone;
		SmartPhone	upgardeSmart = (SmartPhone)dPhone;
		
		upgrageDmb.DmbOn();
		upgardeSmart.wifiOn();// ->실행시 오류 //상위 자식으로 사용불가
		}
		
		
		
		
	}
}
