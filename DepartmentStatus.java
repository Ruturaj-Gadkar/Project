package projectRepo.model;

public class DepartmentStatus {

	private int status;
	private String message;
	private Department department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public DepartmentStatus(int status, String message, Department department) {
		super();
		this.status = status;
		this.message = message;
		this.department = department;
	}
	public DepartmentStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
