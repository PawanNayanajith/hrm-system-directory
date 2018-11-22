package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="academic_qualification",schema="employee")
public class AcademicQualification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3461576400367891708L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
	
	@ManyToOne
	@JoinColumn(name = "exam_type_id")
	private ExamType examTypeId;
	
	private Integer periodYearFrom;
	private Integer periodYearTo;
	private String schoolName;
	private String result;
	private Integer examinationYear;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public ExamType getExamTypeId() {
		return examTypeId;
	}

	public void setExamTypeId(ExamType examTypeId) {
		this.examTypeId = examTypeId;
	}

	public Integer getPeriodYearFrom() {
		return periodYearFrom;
	}

	public void setPeriodYearFrom(Integer periodYearFrom) {
		this.periodYearFrom = periodYearFrom;
	}

	public Integer getPeriodYearTo() {
		return periodYearTo;
	}

	public void setPeriodYearTo(Integer periodYearTo) {
		this.periodYearTo = periodYearTo;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Integer getExaminationYear() {
		return examinationYear;
	}

	public void setExaminationYear(Integer examinationYear) {
		this.examinationYear = examinationYear;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
