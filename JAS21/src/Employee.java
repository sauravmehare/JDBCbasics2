
public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public Employee(int empId, String empName, float empSal, String mobile, String password) {
		
		this.empId = empId;
		this.empName = empName;
		
	}

	public void setPassword(String password) {
		this.password = password;
	}

	int empId;
	String empName;
	float empSal;
	String mobile;

	String password;

}
