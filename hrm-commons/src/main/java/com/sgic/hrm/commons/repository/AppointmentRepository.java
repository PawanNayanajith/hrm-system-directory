package com.sgic.hrm.commons.repository;

import java.sql.Date;import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sgic.hrm.commons.entity.Appointment;


public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

	@Query("select appoint from Appointment as appoint where appoint.appoinmentDate = ?1 ")
	List<Appointment> findByDate(Date date);

}
