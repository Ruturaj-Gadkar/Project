package projectRepo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.TeamDao;
import projectRepo.model.Team;
import projectRepo.model.TeamStatus;
import projectRepo.model.extra.TeamIdAndProjectId;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;
	
	public List<Team> getAll(){
		return teamDao.findAll();
	}
	
	public List<Team> getUnallocatedTeam(Integer pid){
		return teamDao.findByProjectid(pid);
	}
	
	public TeamStatus updatePidByTid(Integer pid,Integer tid) {
		TeamStatus teamStatus=new TeamStatus(0,"Update Failed",null);
		if(teamDao.existsById(tid))
		{
			Optional<Team> ot=teamDao.findById(tid);
			if(ot.isPresent()) {
			Team team=ot.get();
			team.setProjectid(pid);
			teamDao.save(team);
			teamStatus.setStatus(1);
			teamStatus.setMessage("Updated Successfully");
			teamStatus.setTeam(team);
			}
		}
		return teamStatus;
	}
	
	public List<TeamIdAndProjectId> getAllActiveTeamAndProjectId() {
		List<Object[]> objects = teamDao.getActiveTeamIdAndProjectId();
		List<TeamIdAndProjectId> teamIdAndProjectIds = new ArrayList<>();

		for (Object[] o : objects) {
			Integer teamid = (Integer) o[0];
			Integer projectId = (Integer) o[1];
			String projectDesc = (String) o[2];
			teamIdAndProjectIds.add(new TeamIdAndProjectId(teamid, projectId, projectDesc));
		}
		return teamIdAndProjectIds;
	}
	
	public TeamStatus addTeam(Team team) {
		TeamStatus teamStatus = new TeamStatus(0, "Insert Failed", null);
		if (!teamDao.existsById(team.getTeamid())) {
			teamDao.save(team);
			teamStatus.setStatus(1);
			teamStatus.setMessage("Added Successfully");
			teamStatus.setTeam(team);
		}
		return teamStatus;
	}

}
