package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.Referee;



public interface RefereeService {
	
	boolean addReferee(Referee referee);
	List<Referee> getAllReferee();
	boolean editReferee(Referee referee,int id);
	Optional<Referee> getRefereeById(int id);
	boolean deleteReferee(int id);

}
