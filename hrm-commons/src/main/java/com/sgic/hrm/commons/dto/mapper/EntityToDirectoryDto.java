package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.entity.User;

import com.sgic.hrm.commons.dto.DirectoryDto;

public class EntityToDirectoryDto {
 
	public static DirectoryDto entityToUserDtoMapping(User user) {

		DirectoryDto userDto = new DirectoryDto();
		userDto.setFullName(user.getFullName());
		userDto.setEmail(user.getEmail());
		userDto.setContact(user.getTelephoneNumber());
		userDto.setPermenentAddress(user.getPermenentAddress());
		userDto.setDesignation(user.getAppointmentId().getDesignationId().getDesignationName());
		userDto.setAppointmentDate(user.getAppointmentId().getAppoinmentDate());
		userDto.setServicePeriod(user.getServicePeriod());
		return userDto;
	}
}
