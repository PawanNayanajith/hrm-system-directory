package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.Designation;


public interface DesignationRepository extends JpaRepository<Designation, Integer> {
	
}
