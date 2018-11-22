package com.sgic.hrm.employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.ExperienceLetter;
import com.sgic.hrm.commons.repository.ExperienceLetterRepository;
import com.sgic.hrm.employee.service.ExperienceLetterService;
@Service
public class ExperienceLetterServiceImpl implements ExperienceLetterService{
  
  @Autowired
  ExperienceLetterRepository experienceLetterRepository;

  
  public List<ExperienceLetter> getExperienceLetter(){
    return experienceLetterRepository.findAll();
  }
}
