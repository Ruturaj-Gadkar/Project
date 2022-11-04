package projectRepo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department  {
    
	@Id
	private String deptcode;
	private String deptname;
	
	public Department(){
		
	}
	public Department(String deptcode, String deptName) {
		super();
		this.deptcode = deptcode;
		this.deptname = deptName;
		
	}


	public String getDeptcode() {
		return deptcode;
	}


	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}


	public String getDeptname() {
		return deptname;
	}


	public void setDeptname(String deptName) {
		this.deptname = deptName;
	}



	@Override
	public String toString() {
		return "Department [deptcode=" + deptcode + ", deptName=" + deptname + "]";
	}
	
	
}
