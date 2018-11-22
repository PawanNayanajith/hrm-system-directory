package com.sgic.hrm.employee.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.entity.User;



public interface UserService {
	boolean addUser(User user);
	List<User> getUser();
	boolean editUser(User user,Integer id);
	Optional<User> getUserId(Integer id);
	boolean deleteUser(Integer id);
	
	
	List<User> getUsersByName(String name);
	List<User> getUsersByDesignation(String designation);
	List<User> getUsersByServicePeriod(String service);
	
}
