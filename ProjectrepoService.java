package projectRepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.ProjectrepoDao;
import projectRepo.model.Projectrepo;

@Service
public class ProjectrepoService {

	@Autowired
	private ProjectrepoDao projectrepoDao;
	
	public List<Projectrepo> getAllProjectRepo(){
		return projectrepoDao.findAll();
	}
}
