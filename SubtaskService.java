package projectRepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.SubtaskDao;
import projectRepo.model.Subtask;
import projectRepo.model.SubtaskStatus;

@Service
public class SubtaskService {

	@Autowired
	private SubtaskDao subtaskDao;
	
	public List<Subtask> getAll(){
		return subtaskDao.findAll();
	}
	
	public SubtaskStatus addSubtask(Subtask s) {
		SubtaskStatus subtaskStatus=new SubtaskStatus(0,"Failed",null);
		if(!subtaskDao.existsById(s.getSubtaskid()))
		{
			subtaskDao.save(s);
			subtaskStatus.setStatus(1);
			subtaskStatus.setMessage("Added Successfully");
			subtaskStatus.setSubtask(s);
		}
		return subtaskStatus;
	}
	public Integer getMaxSubtaskId() {
		return subtaskDao.getMaxSubTaskId();
	}
}

