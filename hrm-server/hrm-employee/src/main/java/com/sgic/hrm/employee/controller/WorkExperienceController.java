package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.WorkExperience;
import com.sgic.hrm.employee.service.WorkExperienceService;

@RestController
public class WorkExperienceController {
	@Autowired
	private WorkExperienceService workExperienceService;
	
	@PostMapping("/workexperience")
	public HttpStatus addWorkExperience(@Valid @RequestBody WorkExperience workExperience) 
	{
		boolean addtest= workExperienceService.addWorkExperience(workExperience);
		if(addtest) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/workexperience")
	public ResponseEntity<List<WorkExperience>> GetWorkExperience(){
		List<WorkExperience> workExperiences=workExperienceService.getAllWorkExperience();
		ResponseEntity<List<WorkExperience>>
		response=new ResponseEntity<>(workExperiences,HttpStatus.OK);
		return response;
	}
	
	
}
