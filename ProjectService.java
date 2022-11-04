package projectRepo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.ProjectDao;
import projectRepo.model.Project;
import projectRepo.model.ProjectStatus;
import projectRepo.model.extra.ProjectStatesWithCount;

@Service
public class ProjectService {

	@Autowired
	private ProjectDao projectDao;
	
	public List<Project> getAll(){
		return projectDao.findAll();
	}
	
	public Project findbyprojectid(int projectid) {
			Optional<Project> opt = projectDao.findById(projectid);
			return opt.get();
		}
	
	public ProjectStatus addProject(Project s) {
		ProjectStatus projectStatus=new ProjectStatus(0,"Insert Failed",null);
		if(!projectDao.existsById(s.getProjectid()))
		{
			projectDao.save(s);
			projectStatus.setStatus(1);
			projectStatus.setMessage("Added Successfully");
			projectStatus.setProject(s);
		}
		return projectStatus;
	}
	
	public ProjectStatus updateProject(Project p) {
		ProjectStatus projectStatus=new ProjectStatus(0,"Update Failed",null);
		if(projectDao.existsById(p.getProjectid()))
		{
			projectDao.save(p);
			projectStatus.setStatus(1);
			projectStatus.setMessage("Updated Successfully");
			projectStatus.setProject(p);
		}
		return projectStatus;
	}
	
	public ProjectStatus updateProjectStatus(Integer pid) {
		ProjectStatus projectStatus=new ProjectStatus(0,"Update Failed",null);
		if(projectDao.existsById(pid))
		{
			Optional<Project> op=projectDao.findById(pid);
			
			Project project=op.get();
			project.setStatus("active");
			projectDao.save(project);
			projectStatus.setStatus(1);
			projectStatus.setMessage("Updated Successfully");
			projectStatus.setProject(project);
		}
		return projectStatus;
	}
	
	//update project is missing currently
	
	public List<Project> getAllonholdProject() {
		return projectDao.findByStatus("on-hold");
	}
	
	public List<Project> getAllactiveProject(){
		return projectDao.findByStatus("active");
	}
	
	public List<Project> getAllUnallocatedProject(){
        
	    return projectDao.findByStatus("unallocated");
	    }
	public int getMaxProjectIDIncremented() {
		return projectDao.getMaxProjectId();
	}
	public List<ProjectStatesWithCount> getAllCategoryWithStates(){
		List<Object[]> lsr  =  projectDao.countStateByType();	
		List<ProjectStatesWithCount> pStatesWithCount = new ArrayList<ProjectStatesWithCount>();	
		for(Object[] o : lsr) {
			String state = (String) o[0];
			long count = (long) o[1];
			pStatesWithCount.add(new ProjectStatesWithCount(state,count));
		}
		
		return pStatesWithCount;
	}
	public ProjectStatus deleteProject(int delete) {
		ProjectStatus projectStatus = new ProjectStatus(0, "Delete failed", null);
		if (projectDao.existsById(delete)) {

			projectDao.deleteById(delete);
			projectStatus.setStatus(1);
			projectStatus.setMessage("Delete Successfull");

		}
		return projectStatus;
	}
}
