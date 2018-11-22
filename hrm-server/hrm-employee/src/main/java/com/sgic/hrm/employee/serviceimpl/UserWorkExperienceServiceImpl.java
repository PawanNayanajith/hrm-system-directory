package com.sgic.hrm.employee.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.UserWorkExperience;
import com.sgic.hrm.commons.repository.UserWorkExperienceRepository;
import com.sgic.hrm.employee.service.UserWorkExperienceService;


@Service
public class UserWorkExperienceServiceImpl implements UserWorkExperienceService{
		@Autowired
		private UserWorkExperienceRepository userWorkExperienceRepository;
	@Override
	public boolean addUserWorkExperience(UserWorkExperience workExperience) {
		userWorkExperienceRepository.save(workExperience);
		return true;
	}

	@Override
	public List<UserWorkExperience> getAllUserWorkExperience() {
		return userWorkExperienceRepository.findAll();
	}

	@Override
	public boolean editUserWorkExperience(UserWorkExperience workExperience, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<UserWorkExperience> getUserWorkExperienceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserWorkExperience(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
