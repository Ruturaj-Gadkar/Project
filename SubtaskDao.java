package projectRepo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import projectRepo.model.Subtask;

@Repository
public interface SubtaskDao extends JpaRepository<Subtask, Integer> {

	@Query(value = "select max(subtaskid)+1 as id from Subtask")
	public Integer getMaxSubTaskId();
}
