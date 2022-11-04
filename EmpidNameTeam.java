package projectRepo.model.extra;

public class EmpidNameTeam {
 
	Integer empid;
	String empname;
	
	Integer teamid;
	
	EmpidNameTeam(){
		
	}

	public EmpidNameTeam(Integer empid, String empname,  Integer teamid) {
		super();
		this.empid = empid;
		this.empname = empname;

		this.teamid = teamid;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	@Override
	public String toString() {
		return "EmpidNameTeam [empid=" + empid + ", empname=" + empname +  ", teamid=" + teamid + "]";
	}
	
	
	
}
