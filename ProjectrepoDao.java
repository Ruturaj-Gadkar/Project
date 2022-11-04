package projectRepo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projectRepo.model.Projectrepo;

@Repository
public interface ProjectrepoDao extends JpaRepository<Projectrepo, Integer> {

}
