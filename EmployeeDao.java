package projectRepo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projectRepo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	public List<Employee> findByTeamid(int teamid);
	public List<Employee> findByState(String state);
	
	@Query(value = "select empid , empname , teamid from Employee where teamid is not null and subteamid is null")
	public List<Object[]> findEmpTeamIdNotNull();
	
	@Query(value="select e.state, count(*) from Employee e Group By e.state")
	 public List<Object[]> countEmployeeByType();
}
