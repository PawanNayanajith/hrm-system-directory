package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.AcademicQualification;

public interface AcademicQualificationService {
	boolean addAcademicQualification( AcademicQualification academicqualification);
	List<AcademicQualification> getAllAcademicQualification();
	boolean editAcademicQualification(AcademicQualification academicQualification, Integer id);
	boolean deleteAcademicQualification(Integer id);
	AcademicQualification getAcademicQualificationById(int id);
}
