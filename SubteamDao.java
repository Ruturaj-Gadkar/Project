package projectRepo.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projectRepo.model.Subteam;

@Repository
public interface SubteamDao extends JpaRepository<Subteam, Integer> {

	@Query(value = "select max(subteamid)+1 as id from Subteam")
	public Integer getMaxSubTeamId();
	
	@Query(value = "select subteamid , teamid from Subteam")
	public List<Object []>  getAllTeamIdAndSubteamId();
	
	@Query(value = "select s.subteamid , s.teamid , t.projectid from Subteam As s inner join Team  AS t on s.teamid = t.teamid")
	public List<Object []> getAllSubteamTeamAndProjectId();
}

