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

import com.sgic.hrm.commons.entity.AcademicQualification;
import com.sgic.hrm.employee.service.AcademicQualificationService;

@RestController
public class AcademicQualificationController{
	@Autowired
	private AcademicQualificationService academicQualificationSer;
	
	@PostMapping("/academicQualification")
	public HttpStatus createAcademicQualification(@Valid @RequestBody AcademicQualification academicqualification)
	{
		boolean test=academicQualificationSer.addAcademicQualification(academicqualification);
				if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
		@GetMapping("/academicQualification")
		public ResponseEntity <List<AcademicQualification>> getAcademicQualification()
		{
			List<AcademicQualification> academicquali = academicQualificationSer.getAllAcademicQualification();
			return new ResponseEntity<>(academicquali, HttpStatus.OK);
			
		}
		

		// get details of leave request by user id
//		@GetMapping("/leaverequest/user/{userId}")
//		public ResponseEntity<List<LeaveRequest>> findLeaveRequestByUserId(@PathVariable("userId") Integer id) {		
//			List<LeaveRequest> leaveRequsetDetails = leaveRequestService.findByUserId(id);
//			return new ResponseEntity<>(leaveRequsetDetails, HttpStatus.OK);
//		}
		
	
	
	}
	

