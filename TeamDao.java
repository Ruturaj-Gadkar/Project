package projectRepo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projectRepo.model.Team;

@Repository
public interface TeamDao extends JpaRepository<Team, Integer> {
	public List<Team> findByProjectid(Integer pid);
	
	@Query(value="SELECT t.teamid , p.projectid , p.project_desc From Team t Inner Join Project p on t.projectid = p.projectid where status='active'")
	public List<Object[]> getActiveTeamIdAndProjectId();
	
	@Query(value = "Select max(teamid)+1 As key from Team")
    public Integer getMaxTeamId();
	
}
