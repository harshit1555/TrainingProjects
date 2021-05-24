package com.cognizant.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.restapi.model.Skill;

//import com.cognizant.ormlearn.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer>
{

}
