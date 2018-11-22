package com.sgic.hrm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.employee.service.RefereeService;

@CrossOrigin(origins= "",maxAge=3600)
@RestController
public class RefereeController {
	@Autowired
	private RefereeService refereeService;
	
	@PostMapping("/referee")
	public HttpStatus addReferee(@Valid @RequestBody Referee referee) {
		boolean test = refereeService.addReferee(referee);
		if (test) {
			return HttpStatus.CREATED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
	@GetMapping("/referee")
	public ResponseEntity<List<Referee>> GetReferee(){
		List<Referee> referee=refereeService.getAllReferee();
		ResponseEntity<List<Referee>> response=new ResponseEntity<>(referee,HttpStatus.OK);
		return response;
	}
	@PutMapping("/referee/{id}")
	public HttpStatus editReferee(@RequestBody Referee referee,@PathVariable("id") Integer id) {
		boolean test = refereeService.editReferee(referee,id);
		if (test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;

	}
	@DeleteMapping("/referee/{id}")
	public HttpStatus deleteReferee(@PathVariable("id") Integer Id) {
		boolean test = refereeService.deleteReferee(Id);
		if(test) {
			return HttpStatus.ACCEPTED;
		}
		return HttpStatus.BAD_REQUEST;
	}
	
}
