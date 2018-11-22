package com.sgic.hrm.employee.serviceimpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.Appointment;
import com.sgic.hrm.commons.repository.AppointmentRepository;
import com.sgic.hrm.employee.service.AppointmentService;
	@Service
	public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	
	@Override
	public boolean addAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
		return true;
	}

	@Override
	public List<Appointment> getAppointment() {
		return appointmentRepository.findAll();
	}

	@Override
	public List<Appointment> getAppointmentByAppoinmentDate(Date date) {
		return appointmentRepository.findByDate(date);
	}

}
