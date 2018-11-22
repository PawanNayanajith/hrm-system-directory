package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_professional_membership",schema="employee")
public class EmployeeProfessionalMembership implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 967358857731212374L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;
	
	@ManyToOne
	@JoinColumn(name="professional_membership_id")
	private ProfessionalMembership professionalMembershipId;

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

	public ProfessionalMembership getProfessionalMembershipId() {
		return professionalMembershipId;
	}

	public void setProfessionalMembershipId(ProfessionalMembership professionalMembershipId) {
		this.professionalMembershipId = professionalMembershipId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 
	
	

}
