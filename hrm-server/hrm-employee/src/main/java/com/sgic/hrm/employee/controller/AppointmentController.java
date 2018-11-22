package com.sgic.hrm.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.employee.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping("/appointment")
	public HttpStatus AddAppointment(@RequestBody Appointment appointment) 
	{
		boolean testadd= appointmentService.addAppointment(appointment);
		if(testadd) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
}
