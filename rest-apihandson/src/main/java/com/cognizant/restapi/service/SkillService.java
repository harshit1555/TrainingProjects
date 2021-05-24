package com.cognizant.restapi.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.restapi.model.Skill;
//import com.cognizant.ormlearn.OrmLearnApplication;
//import com.cognizant.ormlearn.model.Skill;
import com.cognizant.restapi.repository.SkillRepository;

@Service
public class SkillService
{
	@Autowired
	SkillRepository skillRepository;
//	private final Logger LOGGER=LoggerFactory.getLogger(OrmLearnApplication.class);
	@Transactional
	public Skill get(int id)
	{
//		LOGGER.info("Start");
		return skillRepository.findById(id).get();
	}
	@Transactional
	public void save(Skill skill) 
	{
//		LOGGER.info("Start");
		skillRepository.save(skill);
//		LOGGER.info("End");
	}
	
}
