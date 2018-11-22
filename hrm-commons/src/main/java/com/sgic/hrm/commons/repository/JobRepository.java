package com.sgic.hrm.commons.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.hrm.commons.entity.Job;
public interface JobRepository extends JpaRepository<Job, Integer>{

}
