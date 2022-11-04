package projectRepo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projectRepo.model.Project;

@Repository
public interface ProjectDao extends JpaRepository<Project, Integer> {

	public List<Project> findByStatus(String str);
	
	@Query(value = "Select max(ProjectId)+1 As key from Project")
    public Integer getMaxProjectId();
	
	@Query(value="SELECT p.status , COUNT(p.status) From Project As p Group By p.status")
    public List<Object[]> countStateByType();
}
