package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.EmployeeProfessionalMembership;
import com.sgic.hrm.commons.repository.EmployeeProfessionalMembershipRepository;
import com.sgic.hrm.employee.service.EmployeeProfessionalMembershipService;

@Service
public class EmployeeProfessionalMembershipServiceImpl implements EmployeeProfessionalMembershipService{

	@Autowired
	private EmployeeProfessionalMembershipRepository employeeProfessionalMembershipRepository;
	@Override
	public boolean addEmployeeProfessionalMembership(EmployeeProfessionalMembership employeeProfessionalMembership) {
		employeeProfessionalMembershipRepository.save(employeeProfessionalMembership);
		return false;
	}

	@Override
	public List<EmployeeProfessionalMembership> getAllEmployeeProfessionalMembership() {
		return employeeProfessionalMembershipRepository.findAll();
	}

	@Override
	public boolean editEmployeeProfessionalMembership(EmployeeProfessionalMembership employeeProfessionalMembership,
			Integer id) {
		if(employeeProfessionalMembershipRepository.getOne(id)!=null) {
			employeeProfessionalMembership.setId(id);
			employeeProfessionalMembershipRepository.save(employeeProfessionalMembership);
			return true;
		}
		return false;
	}

	@Override
	public Optional<EmployeeProfessionalMembership> getEmployeeProfessionalMembershipById(int id) {
		// TODO Auto-generated method stub
		return employeeProfessionalMembershipRepository.findById(id);
	}

	@Override
	public boolean deleteEmployeeProfessionalMembership(Integer id) {
		if(employeeProfessionalMembershipRepository.getOne(id) !=null) {
			employeeProfessionalMembershipRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
