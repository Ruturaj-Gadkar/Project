package projectRepo.model;

import projectRepo.model.Emprepo;

public class EmprepoStatus {
	
	int status;
	String message;
	Emprepo empRepo;
	
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
	public Emprepo getEmprepo() {
		return empRepo;
	}
	public void setEmprepo(Emprepo empRepo) {
		this.empRepo = empRepo;
	}
	public EmprepoStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmprepoStatus(int status, String message, Emprepo empRepo) {
		super();
		this.status = status;
		this.message = message;
		this.empRepo = empRepo;
	}
	@Override
	public String toString() {
		return "EmployeeRepoStatus [status=" + status + ", message=" + message + ", employeerepo=" + empRepo + "]";
	}
	
	

}
