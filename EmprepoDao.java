package projectRepo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projectRepo.model.Emprepo;
import projectRepo.model.extra.MyKey;

@Repository
public interface EmprepoDao extends JpaRepository<Emprepo, MyKey> {

}
