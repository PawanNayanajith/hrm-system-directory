package com.sgic.hrm.employee.service;

import java.sql.Date;
import java.util.List;

import com.sgic.hrm.commons.entity.Appointment;


public interface AppointmentService {
	boolean addAppointment(Appointment appointment);
	List<Appointment> getAppointment();
	
	List<Appointment> getAppointmentByAppoinmentDate(Date date);
	
//	boolean editDepartment(Department department,Integer id);
//	Optional<Department> getDepartmentId(Integer id);
//	boolean deleteDepartment(Integer id);
}
