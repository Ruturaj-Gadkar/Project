package projectRepo.model.extra;

public class SubteamIdAndTeamId {
	
	
	Integer subTeamId;
	Integer teamId;
	
	
	
	public SubteamIdAndTeamId() {
		// TODO Auto-generated constructor stub
	}



	public SubteamIdAndTeamId(Integer subTeamId, Integer teamId) {
		super();
		this.subTeamId = subTeamId;
		this.teamId = teamId;
	}



	public Integer getSubTeamId() {
		return subTeamId;
	}



	public void setSubTeamId(Integer subTeamId) {
		this.subTeamId = subTeamId;
	}



	public Integer getTeamId() {
		return teamId;
	}



	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}



	@Override
	public String toString() {
		return "SubteamIdAndTeamId [subTeamId=" + subTeamId + ", teamId=" + teamId + "]";
	}
	
	

}
