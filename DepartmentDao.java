package projectRepo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import projectRepo.model.Department;

public interface DepartmentDao extends JpaRepository<Department, String> {

	@Query(value="SELECT d.deptname , count(*) From Department d Inner Join Project p on d.deptcode = p.deptcode group by p.deptcode")
    public List<Object[]> countDeptByType();
    
    @Query(value="SELECT d.deptname , count(*) From Department d Inner Join Projectrepo p on d.deptcode = p.deptcode group by p.deptcode")
    public List<Object[]> countDeptprojByType();    
}
