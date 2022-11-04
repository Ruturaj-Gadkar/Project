package projectRepo.model;

public class SubteamStatus {

	private int status;
	private String message;
	private Subteam subteam;
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
	public Subteam getSubteam() {
		return subteam;
	}
	public void setSubteam(Subteam subteam) {
		this.subteam = subteam;
	}
	public SubteamStatus(int status, String message, Subteam subteam) {
		super();
		this.status = status;
		this.message = message;
		this.subteam = subteam;
	}
	public SubteamStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
