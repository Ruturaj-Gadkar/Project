package projectRepo.model.extra;

public class TeamIdAndProjectId {

	
	Integer teamid;
	Integer projectid;
	String projectDesc;
	
	
	public TeamIdAndProjectId() {
		// TODO Auto-generated constructor stub
	}


	public TeamIdAndProjectId(Integer teamid, Integer projectid, String projectDesc) {
		super();
		this.teamid = teamid;
		this.projectid = projectid;
		this.projectDesc = projectDesc;
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


	public String getProjectDesc() {
		return projectDesc;
	}


	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}


	@Override
	public String toString() {
		return "TeamIdAndProjectId [teamid=" + teamid + ", projectid=" + projectid + ", projectDesc=" + projectDesc
				+ "]";
	}






	
}
