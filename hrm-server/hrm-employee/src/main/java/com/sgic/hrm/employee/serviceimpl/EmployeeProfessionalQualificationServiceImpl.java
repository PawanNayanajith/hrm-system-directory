package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.EmployeeProfessionalQualification;
import com.sgic.hrm.commons.repository.EmployeeProfessionalQualificationRepository;
import com.sgic.hrm.employee.service.EmployeeProfessionalQualificationService;


@Service
public class EmployeeProfessionalQualificationServiceImpl implements EmployeeProfessionalQualificationService {

	@Autowired
	private EmployeeProfessionalQualificationRepository employeeProfessionalQualificationRepository;

	@Override
	public boolean addEmployeeProfessionalQualification(
			EmployeeProfessionalQualification employeeProfessionalQualification) {
		employeeProfessionalQualificationRepository.save(employeeProfessionalQualification);
		return false;
	}

	@Override
	public List<EmployeeProfessionalQualification> getAllEmployeeProfessionalQualifications() {
		
		return employeeProfessionalQualificationRepository.findAll();
	}

	@Override
	public boolean editEmployeeProfessionalQualification(
			EmployeeProfessionalQualification employeeProfessionalQualification, Integer id) {
		if(employeeProfessionalQualificationRepository.getOne(id)!=null) {
			employeeProfessionalQualification.setId(id);
			employeeProfessionalQualificationRepository.save(employeeProfessionalQualification);
			return true;
		}
		return false;
	}

	@Override
	public Optional<EmployeeProfessionalQualification> getEmployeeProfessionalQualificationById(int id) {
		// TODO Auto-generated method stub
		 return employeeProfessionalQualificationRepository.findById(id);
	}

	@Override
	public boolean deleteEmployeeProfessionalQualification(Integer id) {
		if(employeeProfessionalQualificationRepository.getOne(id) !=null) {
			employeeProfessionalQualificationRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
