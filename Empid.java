package projectRepo.model.extra;

public class Empid {
 
	
	Integer empid;
	
	Empid(){
		
	}

	public Empid(Integer empid) {
		super();
		this.empid = empid;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Empid [empid=" + empid + "]";
	}
	

	
	}

