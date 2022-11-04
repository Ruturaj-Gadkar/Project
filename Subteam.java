package projectRepo.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Subteam {
 
	@Id
	private Integer subteamid;	
	private Date date_created;
	@JoinColumn(name="teamid")
	private Integer teamid;
	
	public Subteam() {
	   
   }
	public Subteam(Integer subteamid, Date date_created, Integer teamid) {
		super();
		this.subteamid = subteamid;
		this.date_created = date_created;
		this.teamid = teamid;
	
	}
	public Integer getSubteamid() {
		return subteamid;
	}
	public void setSubteamid(Integer subteamid) {
		this.subteamid = subteamid;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Integer getTeamid() {
		return teamid;
	}
	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}

	
	@Override
	public String toString() {
		return "Subteam [subteamid=" + subteamid + ", date_created=" + date_created + ", team=" + teamid + "]";
	}
	
}
