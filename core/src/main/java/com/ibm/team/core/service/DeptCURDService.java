package com.ibm.team.core.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.team.core.entities.Dept;
import com.ibm.team.core.repository.DeptRepository;

@Service
public class DeptCURDService {

	@Autowired
	private DeptRepository deptRepository;
	
	
	public Optional<Dept> findById(long id){
        return deptRepository.findById(id);
    }

    public List<Dept> findAll(){
        return deptRepository.findAll();
    }
    
    public Dept update(Dept dept){
        Optional<Dept> optionalDeptEntity = deptRepository.findById(dept.getDeptno());
        if(optionalDeptEntity.isPresent()) {
        	Dept deptEntity = optionalDeptEntity.get();
        	deptEntity.setDname(dept.getDname());
        	deptEntity.setDbsource(dept.getDbsource());
            return deptRepository.save(deptEntity);
        }
        return null;
    }
    
    public Dept save(Dept dept){
        return deptRepository.save(dept);
    }
	
	public void delete(long id){
		deptRepository.deleteById(id);
    }
}
