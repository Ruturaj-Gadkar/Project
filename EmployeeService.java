package projectRepo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.EmployeeDao;
import projectRepo.dao.SubteamDao;
import projectRepo.dao.TeamDao;
import projectRepo.model.Employee;
import projectRepo.model.EmployeeStatus;
import projectRepo.model.Subteam;
import projectRepo.model.Team;
import projectRepo.model.extra.Empid;
import projectRepo.model.extra.EmpidNameTeam;
import projectRepo.model.extra.EmployeeAndStatus;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAll(){
		return employeeDao.findAll();
	}
	
	public EmployeeStatus addEmployee(Employee e) {
		EmployeeStatus employeeStatus=new EmployeeStatus(0,"Insert Failed",null);
		if(!employeeDao.existsById(e.getEmpid()))
		{
			employeeDao.save(e);
			employeeStatus.setStatus(1);
			employeeStatus.setMessage("Added Successfully");
			employeeStatus.setEmployee(e);
		}
		return employeeStatus;
	}
	
	public EmployeeStatus updateEmployee(Employee e) {
		EmployeeStatus employeeStatus=new EmployeeStatus(0,"Insert Failed",null);
		if(employeeDao.existsById(e.getEmpid()))
		{
			employeeDao.save(e);
			employeeStatus.setStatus(1);
			employeeStatus.setMessage("Updated Successfully");
			employeeStatus.setEmployee(e);
		}
		return employeeStatus;
	}
	
	public List<Employee> getAllbyTeamId(int teamid)
	{
		return employeeDao.findByTeamid( teamid );
	}
	
	public List<Employee> getAllidleEmployee(){
		return employeeDao.findByState("idle");
	}
	
	@Autowired
	private SubteamDao subteamDao;
	public EmployeeStatus updateEmployeeSubteamid(List<Empid> empids, Integer sid) {
		System.out.println("Sid is"+sid);
		EmployeeStatus employeeStatus = new EmployeeStatus(0, "Insert Failed", null);
		if(empids.isEmpty()) {
			return employeeStatus;
		}
		Optional<Subteam> optionals = 	subteamDao.findById(sid);
		Subteam subteam=null;
		if(optionals.isPresent()) {
			subteam = optionals.get();
		}
		for (int i = 0; i < empids.size(); i++) {
			int eid =  empids.get(i).getEmpid();
			Optional<Employee> options  = employeeDao.findById(eid);
			Employee e=null;
			if(options.isPresent()) {
				e = options.get();
			}
			if(!subteam.getTeamid().equals(e.getTeamid())) {
				employeeStatus.setMessage("Insert Failed! Wrong Team Employees Allocation");
			return employeeStatus;	
			}
			Optional<Employee> optional = employeeDao.findById(empids.get(i).getEmpid());
			if(optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
			employee.setSubteamid(sid);
			employeeDao.save(employee);
			}
		}
		employeeStatus.setStatus(1);
		employeeStatus.setMessage("Employees  Added To Subteam Successfully");
		return employeeStatus;
	}
	
	
	
	public List<EmpidNameTeam> getAllEmployeesHavingTeamId(){
		List<Object[]> objects = employeeDao.findEmpTeamIdNotNull();
		List<EmpidNameTeam> empidNameTeams = new ArrayList<EmpidNameTeam>();

		for (Object[] o : objects) {
			Integer empid = (Integer) o[0];
			String empname = (String) o[1];
			Integer teamid = (Integer) o[2];
			empidNameTeams.add( new EmpidNameTeam(empid, empname, teamid));
		}
		
		return empidNameTeams;
	}
	
	@Autowired
	private TeamDao teamDao;
	
	public EmployeeStatus updateEmployeeAndCreateTeam(List<Empid> empids) {
		EmployeeStatus employeeStatus = new EmployeeStatus(0, "Cannot create Team of 0 employees", null);
		if(empids.isEmpty()) {
			return employeeStatus;
		}
		else {
		int id = teamDao.getMaxTeamId();
		Date today = new Date(System.currentTimeMillis());
		Team team = new Team(id, today, null);

		teamDao.save(team);
		for (int i = 0; i < empids.size(); i++) {
			Optional<Employee> optional = employeeDao.findById(empids.get(i).getEmpid());
			if(optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
			employee.setTeamid(id);
			employee.setState("Busy");
			employeeDao.save(employee);
			}
		}
		employeeStatus.setStatus(1);
		employeeStatus.setMessage("Employees  Added To Team Successfully");
		return employeeStatus;
		}
	}
	public List<EmployeeAndStatus> getCountEmployeeBytype() {
		List<Object[]> objects = employeeDao.countEmployeeByType();

		List<EmployeeAndStatus> employeeAndStatus = new ArrayList<EmployeeAndStatus>();
		for (Object[] o : objects) {

			String state = (String) o[0];
			long count = (long) o[1];
			employeeAndStatus.add(new EmployeeAndStatus(state, count));

		}

		return employeeAndStatus;
	}
}