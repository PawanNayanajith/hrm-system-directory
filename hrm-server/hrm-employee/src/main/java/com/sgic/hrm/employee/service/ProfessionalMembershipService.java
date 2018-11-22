package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.ProfessionalMembership;




public interface ProfessionalMembershipService {
	
	boolean addProfessionalMembership(ProfessionalMembership professionalMembership);

	List<ProfessionalMembership> getAllProfessionalMembership();
	
	boolean editProfessionalMembership(ProfessionalMembership professionalMembership,Integer id);
	
	Optional<ProfessionalMembership> getProfessionalMembershipById(int id);
	
	boolean deleteProfessionalMembership(Integer id);

}
