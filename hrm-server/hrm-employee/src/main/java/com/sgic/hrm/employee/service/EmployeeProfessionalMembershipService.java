package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.EmployeeProfessionalMembership;


public interface EmployeeProfessionalMembershipService {
	
	boolean addEmployeeProfessionalMembership(EmployeeProfessionalMembership employeeProfessionalMembership);

	List<EmployeeProfessionalMembership> getAllEmployeeProfessionalMembership();
	
	boolean editEmployeeProfessionalMembership(EmployeeProfessionalMembership employeeProfessionalMembership,Integer id);
	
	Optional<EmployeeProfessionalMembership> getEmployeeProfessionalMembershipById(int id);
	
	boolean deleteEmployeeProfessionalMembership(Integer id);
}
