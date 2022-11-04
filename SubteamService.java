package projectRepo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.SubteamDao;
import projectRepo.model.Subteam;
import projectRepo.model.SubteamStatus;
import projectRepo.model.extra.STeamTeamProjectId;
import projectRepo.model.extra.SubteamIdAndTeamId;

@Service
public class SubteamService {

	@Autowired
	private SubteamDao subteamDao;
	
	public List<Subteam> getAll(){
		return subteamDao.findAll();
	}
	
	public SubteamStatus addSubteam(Subteam s) {
		SubteamStatus subteamStatus=new SubteamStatus(0,"Failed",null);	
		if(!subteamDao.existsById(s.getSubteamid()))
		{
			subteamDao.save(s);
			subteamStatus.setStatus(1);
			subteamStatus.setMessage("Added Successfully");
			subteamStatus.setSubteam(s);
		}
		return subteamStatus;
	}
	
	public Integer getMaxSubteamId() {
		return subteamDao.getMaxSubTeamId();
	}
	public List<SubteamIdAndTeamId> getAllTeamAndSubteamId() {

		List<Object[]> objects = subteamDao.getAllTeamIdAndSubteamId();

		List<SubteamIdAndTeamId> subteamIdAndTeamIds = new ArrayList<SubteamIdAndTeamId>();

		for (Object[] o : objects) {
			Integer subteamId = (Integer) o[0];
			Integer teamId = (Integer) o[1];

			subteamIdAndTeamIds.add(new SubteamIdAndTeamId(subteamId, teamId));
		}

		return subteamIdAndTeamIds;
	}
	public List<STeamTeamProjectId> getSteamTeamPid() {
		List<Object[]> objects = subteamDao.getAllSubteamTeamAndProjectId();
		List<STeamTeamProjectId> teamTeamProjectIds = new ArrayList<STeamTeamProjectId>();

		for (Object[] o : objects) {
			Integer s_id = (Integer) o[0];
			Integer t_id = (Integer) o[1];
			Integer p_id = (Integer) o[2];
			teamTeamProjectIds.add(new STeamTeamProjectId(s_id, t_id, p_id));

		}
		return teamTeamProjectIds;

	}
}
