package projectRepo.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


@Entity
public class Subtask {

	@Id 
	private Integer subtaskid;
	private Date date_created;
	private String subtask_desc;
	@JoinColumn(name="projectid")
	private Integer projectid;
	@JoinColumn(name="subteamid")
	private Integer subteamid;

    public Subtask() {
	
    }
    
	public Subtask(Integer subtaskid, Date datecreated, String subtask_desc, Integer projectid, Integer subteamid) {
		super();
		this.subtaskid = subtaskid;
		this.date_created = datecreated;
		this.subtask_desc= subtask_desc;
		this.projectid = projectid;
		this.subteamid = subteamid;
	}

	public Integer getSubtaskid() {
		return subtaskid;
	}

	public void setSubtaskid(Integer subtaskid) {
		this.subtaskid = subtaskid;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date datecreated) {
		this.date_created = datecreated;
	}

	public String getSubtask_desc() {
		return subtask_desc;
	}

	public void setSubtask_desc(String desc) {
		this.subtask_desc = desc;
	}

	public Integer getProjectid() {
		return projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	public Integer getSubteamid() {
		return subteamid;
	}

	public void setSubteamid(Integer subteamid) {
		this.subteamid = subteamid;
	}

	@Override
	public String toString() {
		return "Subtask [subtaskid=" + subtaskid + ", datecreated=" + date_created + ", subtask_desc" + subtask_desc + ", project="
				+ projectid + ", subteam=" + subteamid + "]";
	}

}
