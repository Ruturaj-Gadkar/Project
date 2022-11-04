package projectRepo.model;

public class DesigStatus {

	private int status;
	private String message;
	private Desig desig;
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
	public Desig getDesig() {
		return desig;
	}
	public void setDesig(Desig desig) {
		this.desig = desig;
	}
	public DesigStatus(int status, String message, Desig desig) {
		super();
		this.status = status;
		this.message = message;
		this.desig = desig;
	}
	public DesigStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
