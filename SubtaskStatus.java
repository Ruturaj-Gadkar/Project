package projectRepo.model;

public class SubtaskStatus {

	private int status;
	private String message;
	private Subtask subtask;
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
	public Subtask getSubtask() {
		return subtask;
	}
	public void setSubtask(Subtask subtask) {
		this.subtask = subtask;
	}
	public SubtaskStatus(int status, String message, Subtask subtask) {
		super();
		this.status = status;
		this.message = message;
		this.subtask = subtask;
	}
	public SubtaskStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
