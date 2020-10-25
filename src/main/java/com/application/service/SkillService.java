package com.application.service;

import com.application.model.Skill;
import com.application.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    public Skill saveSkill(Skill skill){
        return skillRepository.save(skill);
    }

    public List<Skill> findByName(String name){
        return skillRepository.findByName(name);
    }

    public List<Skill> findByProficiency(String proficiency){
        return skillRepository.findByProficiency(proficiency);
    }

    public List<Skill> findAll(){
        return (List<Skill>) skillRepository.findAll();
    }

}
