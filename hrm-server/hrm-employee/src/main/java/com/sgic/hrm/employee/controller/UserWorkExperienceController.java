package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.UserWorkExperience;
import com.sgic.hrm.employee.service.UserWorkExperienceService;

@CrossOrigin(origins= "",maxAge=3600)
@RestController
public class UserWorkExperienceController {
	@Autowired
	private UserWorkExperienceService userWorkExperienceService;
	
	@PostMapping("/userworkexperience")
	public HttpStatus addUserWorkExperience(@Valid @RequestBody UserWorkExperience userWorkExperience)
	{
		boolean addworkrecord = userWorkExperienceService.addUserWorkExperience(userWorkExperience);
				if (addworkrecord) {
					return HttpStatus.CREATED;
				}
				return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/userworkexperience")
	public ResponseEntity<List<UserWorkExperience>> GetReferee(){
		List<UserWorkExperience> userWorkExperiences= userWorkExperienceService.getAllUserWorkExperience();
		ResponseEntity<List<UserWorkExperience>>
		response=new ResponseEntity<>(userWorkExperiences,HttpStatus.OK);
		return response;
	}
	
}
