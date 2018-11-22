package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.repository.DesignationRepository;
import com.sgic.hrm.employee.service.DesignationService;


@Service
public class DesignationServiceImpl implements DesignationService{
	@Autowired
	private DesignationRepository designationRepository;
	
	@Override
	public boolean addDesignation(Designation designation) {
		designationRepository.save(designation);
		return true;
	}

	@Override
	public List<Designation> getDesignation() {
		
		return designationRepository.findAll();
	}
}
