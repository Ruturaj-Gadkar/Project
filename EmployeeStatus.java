package projectRepo.model;

public class EmployeeStatus {
	
	private int status;
	private String message;
	private Employee employee;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeStatus(int status, String message, Employee employee) {
		super();
		this.status = status;
		this.message = message;
		this.employee = employee;
	}
	public EmployeeStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
