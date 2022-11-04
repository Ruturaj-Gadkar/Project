package projectRepo.model;

public class TeamStatus {
	
	private int status;
	private String message;
	private Team team;
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
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public TeamStatus(int status, String message, Team team) {
		super();
		this.status = status;
		this.message = message;
		this.team = team;
	}
	public TeamStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
