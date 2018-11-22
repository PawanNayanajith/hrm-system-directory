package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.EmployeeProfessionalQualification;



public interface EmployeeProfessionalQualificationService {

	boolean addEmployeeProfessionalQualification(EmployeeProfessionalQualification employeeProfessionalQualification);

	List<EmployeeProfessionalQualification> getAllEmployeeProfessionalQualifications();

	boolean editEmployeeProfessionalQualification(EmployeeProfessionalQualification employeeProfessionalQualification, Integer id);

	Optional<EmployeeProfessionalQualification> getEmployeeProfessionalQualificationById(int id);

	boolean deleteEmployeeProfessionalQualification(Integer id);

}
