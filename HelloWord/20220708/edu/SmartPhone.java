package edu;

public class SmartPhone extends DmbCellphone {
		private String internet ;
		
		public SmartPhone() {
			super();
		}

		public String getInternet() {
			return internet;
		}

		public void setInternet(String internet) {
			this.internet = internet;
		}
		
		public void wifiOn() {
			System.out.println("와이파이에 연결합니다.");
		}
		public void wifiOff() {
			System.out.println("와이파이의 연결을 종료합니다.");
		}
}
