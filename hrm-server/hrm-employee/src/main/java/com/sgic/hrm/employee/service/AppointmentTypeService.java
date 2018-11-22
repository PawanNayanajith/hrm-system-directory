package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.AppointmentType;

public interface AppointmentTypeService {
	boolean addAppointmentType(AppointmentType appointmentType);
	List<AppointmentType> getAppointmentType();
//	boolean editDepartment(AppointmentType appointmentType,Integer id);
//	Optional<AppointmentType> getAppointmentTypeId(Integer id);
//	boolean deleteAppointmentType(Integer id);
}
