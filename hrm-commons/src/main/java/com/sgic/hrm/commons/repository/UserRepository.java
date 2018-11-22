package com.sgic.hrm.commons.repository;

import java.sql.Date;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select usr from User as usr where usr.fullName = ?1 ")
	public List<User> findAllUsersByName(String name);

	@Query("select usr from User as usr where usr.appointmentId.appoinmentDate = ?1 ")
	public List<User> findUsersByAppointmentDate(Date date);

	@Query("select usr from User as usr where usr.appointmentId.designationId.designationName = ?1 ")
	public List<User> findAllUsersByDesignation(String designation);

	@Query("select usr from User as usr where usr.appointmentId.designationId.designationName = ?1 AND usr.fullName = ?2 ")
	public List<User> findAllUsersByDesignationAndName(String designation, String name);

	@Query("select usr from User as usr where usr.appointmentId.designationId.designationName = ?1 AND usr.appointmentId.appoinmentDate = ?2  ")
	public List<User> findAllUsersByDesignationAndAppointmentDate(String designation, Date date);

	@Query("select usr from User as usr where usr.appointmentId.appoinmentDate = ?1  AND usr.fullName = ?2 ")
	public List<User> findAllUsersByAppointmentDatenAndName(Date date, String name);
	
	@Query("select usr from User as usr where usr.appointmentId.appoinmentDate = ?1  AND usr.fullName = ?2  AND usr.appointmentId.designationId.designationName = ?3 ")
	public List<User> findAllUsersByAppointmentDatenAndNameAndDesignation(Date date, String name, String designation);
	
	

}