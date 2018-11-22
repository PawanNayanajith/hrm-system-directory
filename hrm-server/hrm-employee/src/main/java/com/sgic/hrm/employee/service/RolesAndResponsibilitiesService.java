package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.RolesAndResponsibilites;

public interface RolesAndResponsibilitiesService {
	boolean addRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites);
	List<RolesAndResponsibilites>getRolesAndResponsibilites();
	boolean editRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites,Integer id);
	Optional<RolesAndResponsibilites>getReloAndResponsibilities(Integer id);
	boolean deleteRolesAndResponsibilites(Integer id);
}
