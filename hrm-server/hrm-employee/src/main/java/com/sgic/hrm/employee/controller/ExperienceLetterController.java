package com.sgic.hrm.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.entity.ExperienceLetter;
import com.sgic.hrm.employee.service.ExperienceLetterService;

@RestController
public class ExperienceLetterController {

  @Autowired
  ExperienceLetterService experienceLetterService;
  
  @GetMapping("/exletter")
  public List<ExperienceLetter> getExperienceLetter(){
    return experienceLetterService.getExperienceLetter();
  }
}
