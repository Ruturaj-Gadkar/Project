
package projectRepo.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Project{

	

	@Id 
	private Integer projectid;
	private String project_desc;
	private Date startdate;
	private Date exenddate;
	private String status;
	@JoinColumn(name="deptcode")
	private String deptcode;

    public Project() {
    	
    }
	public Project(Integer projectId, String project_desc, Date startdate, Date exEnddate, String status,
			String deptcode) {
		super();
		this.projectid = projectId;
		this.project_desc = project_desc;
		this.startdate = startdate;
		this.exenddate = exEnddate;
		this.status = status;
		this.deptcode = deptcode;
	}
	public Integer getProjectid() {
		return projectid;
	}
	public void setProjectid(Integer projectId) {
		this.projectid = projectId;
	}
	public String getProject_desc() {
		return project_desc;
	}
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getExenddate() {
		return exenddate;
	}
	public void setExenddate(Date exEnddate) {
		this.exenddate = exEnddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectid + ", project_desc=" + project_desc + ", startdate=" + startdate
				+ ", exEnddate=" + exenddate + ", status=" + status + ", department=" + deptcode + "]";
	}
	

}
