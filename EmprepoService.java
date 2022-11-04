package projectRepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.EmprepoDao;
import projectRepo.model.Emprepo;

@Service
public class EmprepoService {

	@Autowired
	private EmprepoDao emprepoDao;
	
	public List<Emprepo> getAllEmprepo(){
		return emprepoDao.findAll();
	}
}
