package InterfaceTest;


	public class Employee {
		private int epId;
		private String epName;
		private int depId; // 10인사 20개발 30영업
		private String depName;
		private int salary;
		private String email;

		public Employee() {
			super();
		}

		public Employee(int epId, String epName, int depId, int salary) {
			this.epId = epId;
			this.epName = epName;
			this.depId = depId;
//			this.depName=depName;
			this.salary = salary;
			if (depId == 10) {
				depName = "인사";
			} else if (depId == 20) {
				depName = "개발";
			} else if (depId == 30) {
				depName = "영업";
			}
		}
		
		// 사번 이름 초기화
		public Employee(int epId, String epName) {
			this(epId, epName, 100, 30);
		}

//		사번 이름 급여
		public Employee(int epId, String epName, int salary) {
			this(epId, epName, salary, 30);

		}
		
		

		//상세정보S
		public String getDetail() {
			String info = "사원번호: "+epId+" 사원이름: "+epName+" 급여: "+salary+" 부서이름: "+depName;
			
			
			
			return info;
		}
		
		
		
		
		//getter setter
		public void setEpId (int epId) {
			this.epId=epId;
		}
		public int getEpId() {
			return this.epId;
		}
		public void setEpName(String epName) {
			this.epName=epName;
		}
		public String getEpName() {
			return this.epName;
		}
		public void setDepId (int depId ) {
			this.depId=depId;
		}
		public int getDepId() {
			return this.depId;
		}
		public void setDepName(String depName) {
			this.depName= depName;
		}
		public String getDepName() {
			return this.depName;
		}
		public void setSalary(int salary) {
			this.salary=salary;
		}
		public int getSalary() {
			return this.salary;
		}	
		public void setEmail(String email) {
			this.email=email;
		}
		public String GetEmail() {
			return this.email;
		}
	
}
