package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.repository.DepartmentRepository;
import com.sgic.hrm.employee.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
@Autowired
private DepartmentRepository departmentRepo;
	@Override
	public boolean addDepartment(Department department) {
		departmentRepo.save(department);
		return true;
	}

	@Override
	public List<Department> getDepartment() {
		
		return departmentRepo.findAll();
	}

	
	
}
