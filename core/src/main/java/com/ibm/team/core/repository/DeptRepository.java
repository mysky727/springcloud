package com.ibm.team.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.team.core.entities.Dept;

public interface DeptRepository extends JpaRepository<Dept, Long>  {

}
