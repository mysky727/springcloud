package com.ibm.team.core.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.team.core.entities.Dept;
import com.ibm.team.core.service.DeptCURDService;

@RestController
public class DeptController {
	
	@Autowired
	private DeptCURDService deptService;
	
	@GetMapping(value = "/dept/{id}")
    public Optional<Dept> findById(@PathVariable int id) {
        return deptService.findById(id);
    }

    @GetMapping(value = "/dept")
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @PostMapping(value = "/dept")
    public Dept save(@RequestBody Dept dept){
        return deptService.save(dept);
    }
    
    @PostMapping(value = "/dept/update")
    public Dept update(@RequestBody Dept dept){
        return deptService.update(dept);
    }
}
