package projectRepo.model.extra;

public class STeamTeamProjectId {

	
	Integer subteamid;
	Integer teamid;
	Integer projectid;
	
	
	STeamTeamProjectId(){}
	public STeamTeamProjectId(Integer subteamid, Integer teamid, Integer projectid) {
		super();
		this.subteamid = subteamid;
		this.teamid = teamid;
		this.projectid = projectid;
	}
	public Integer getSubteamid() {
		return subteamid;
	}
	public void setSubteamid(Integer subteamid) {
		this.subteamid = subteamid;
	}
	public Integer getTeamid() {
		return teamid;
	}
	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}
	public Integer getProjectid() {
		return projectid;
	}
	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}
	
	@Override
	public String toString() {
		return "STeamTeamProjectId [subteamid=" + subteamid + ", teamid=" + teamid + ", projectid=" + projectid + "]";
	}
	
}
