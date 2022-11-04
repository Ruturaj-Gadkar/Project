package projectRepo.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import projectRepo.model.extra.MyKey;

@Entity
public class Emprepo {
    
//	mykey.java file
	@EmbeddedId
	private MyKey mykey;
	
	private String empname;
	private int teamid;
	
	
	public Emprepo() {
		// TODO Auto-generated constructor stub
	}


	public Emprepo(MyKey mykey, String empname, int teamid) {
		super();
		this.mykey = mykey;
		this.empname = empname;
		this.teamid = teamid;
	}


	public MyKey getMykey() {
		return mykey;
	}


	public void setMykey(MyKey mykey) {
		this.mykey = mykey;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getTeamid() {
		return teamid;
	}


	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}


	@Override
	public String toString() {
		return "EmpRepo [mykey=" + mykey + ", empname=" + empname + ", teamid=" + teamid + "]";
	}
	
}
