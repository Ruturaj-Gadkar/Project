package projectRepo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Employee {

	@Id
	private Integer empid;
	private String empname;
	private String address;
	private Date birthdate;
	private Date joindate;
	private char sex;
	@JoinColumn(name="desigcode")
	private String desigcode;
	private String supcode;
	private String state;
	@JoinColumn(name = "teamid")
	private Integer teamid;
	@JoinColumn(name = "subteamid")
	private Integer subteamid;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getDesigcode() {
		return desigcode;
	}
	public void setDesigcode(String desigcode) {
		this.desigcode = desigcode;
	}
	public String getSupcode() {
		return supcode;
	}
	public void setSupcode(String supcode) {
		this.supcode = supcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getTeamid() {
		return teamid;
	}
	public void setTeamid(Integer teamid) {
		this.teamid = teamid;
	}
	public Integer getSubteamid() {
		return subteamid;
	}
	public void setSubteamid(Integer subteamid) {
		this.subteamid = subteamid;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empid, String empname, String address, Date birthdate, Date joindate, char sex,
			String desigcode, String supcode, String state, Integer team, Integer subteam) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
		this.birthdate = birthdate;
		this.joindate = joindate;
		this.sex = sex;
		this.desigcode = desigcode;
		this.supcode = supcode;
		this.state = state;
		
		this.teamid = team;
		this.subteamid = subteam;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", address=" + address + ", birthdate=" + birthdate
				+ ", joindate=" + joindate + ", sex=" + sex + ", desigcode=" + desigcode + ", supcode=" + supcode
				+ ", state=" + state + ", teamid=" + teamid + ", subteamid=" + subteamid + "]";
	}
		

}