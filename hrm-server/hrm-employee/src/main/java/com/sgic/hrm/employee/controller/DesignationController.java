package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.employee.service.DesignationService;

@RestController
public class DesignationController {
	@Autowired
	private DesignationService designationService;
	
	@PostMapping("/designation")
	public HttpStatus createDesignation(@RequestBody Designation designation )
	{
		boolean testadd = designationService.addDesignation(designation);
		if(testadd) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	
	}
	
	@GetMapping("/designation")
	public ResponseEntity<List<Designation>> GetDesignation(){
		List<Designation> designation= designationService.getDesignation();
		ResponseEntity<List<Designation>> 
		response =  new ResponseEntity<>(designation,HttpStatus.OK);
		return response;
	}
	

}
