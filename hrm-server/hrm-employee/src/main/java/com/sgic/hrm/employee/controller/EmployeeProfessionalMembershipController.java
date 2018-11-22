package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.EmployeeProfessionalMembership;
import com.sgic.hrm.employee.service.EmployeeProfessionalMembershipService;

@RestController
public class EmployeeProfessionalMembershipController {
	@Autowired
	private EmployeeProfessionalMembershipService employeeProfessionalMembershipService;
	@PostMapping("/employeeProfessionalMembership")
	
	public HttpStatus addEmployeeProfessionalMembership(@Valid @RequestBody EmployeeProfessionalMembership employeeProfessionalMembership) {
		boolean test = employeeProfessionalMembershipService.addEmployeeProfessionalMembership(employeeProfessionalMembership);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/employeeProfessionalMembership")
	public ResponseEntity<List<EmployeeProfessionalMembership>> GetEmployeeProfessionalMembership(){
		List<EmployeeProfessionalMembership> employeeProfessionalMembership=employeeProfessionalMembershipService.getAllEmployeeProfessionalMembership();
		ResponseEntity<List<EmployeeProfessionalMembership>> response= new ResponseEntity<>(employeeProfessionalMembership,HttpStatus.OK);
		return response;
		
	}
	@PutMapping("/employeeProfessionalMembership/{id}")
	public HttpStatus ModifyEmployeeProfessionalMembership(@PathVariable Integer id,@RequestBody EmployeeProfessionalMembership employeeProfessionalMembership) {
		boolean editTest=employeeProfessionalMembershipService.editEmployeeProfessionalMembership(employeeProfessionalMembership, id);
		if(editTest) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	@DeleteMapping("/employeeProfessionalMembership/{id}")
	public HttpStatus deleteEmployeeProfessionalMembership(@PathVariable("id") Integer Id) {
		boolean test = employeeProfessionalMembershipService.deleteEmployeeProfessionalMembership(Id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}

}
