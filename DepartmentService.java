package projectRepo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectRepo.dao.DepartmentDao;
import projectRepo.model.extra.DeptNameWithCount;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public  List<DeptNameWithCount> getAllDepartmentWithCount(){
		List<Object[]> getDeptwithCountProj  = departmentDao.countDeptByType();
		
		List<DeptNameWithCount> deptNameWithCount = new ArrayList<>() ;
		for(Object[] o : getDeptwithCountProj) {
			String state = (String) o[0];
			long count = (long) o[1];
			deptNameWithCount.add(new DeptNameWithCount(state,count));
			
		}
		
		return deptNameWithCount;
	}
	public  List<DeptNameWithCount> getAllDepartmentproWithCount(){
		List<Object[]> getDeptwithCountProj  = departmentDao.countDeptprojByType();
		
		List<DeptNameWithCount> deptNameWithCount = new ArrayList<>() ;
		for(Object[] o : getDeptwithCountProj) {
			String state = (String) o[0];
			long count = (long) o[1];
			deptNameWithCount.add(new DeptNameWithCount(state,count));		
		}
		
		return deptNameWithCount;
	}
}
