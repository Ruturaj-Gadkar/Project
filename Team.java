/**
 * 
 */
package projectRepo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Team {
    
	@Id
	private Integer teamid;
	private Date date_created;
	@JoinColumn(name="projectid")
	private Integer projectid;

	public Integer getTeamid() {
		return teamid;
	}

	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}

	public Integer getProjectid() {
		return projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Team(Integer teamid, Date date_created, Integer projectid) {
		super();
		this.teamid = teamid;
		this.date_created = date_created;
		this.projectid = projectid;
	}

	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", date_created=" + date_created + ", projectid=" + projectid + "]";
	}

	
}
