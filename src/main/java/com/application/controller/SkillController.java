package com.application.controller;

import com.application.model.Skill;
import com.application.service.SkillService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class SkillController {

    @Autowired
    private SkillService skillService;

    @RequestMapping(value = "/createSkill", method = RequestMethod.POST)
    public @ResponseBody
    Object createUser(@RequestBody Skill skill) throws Exception {
        skillService.saveSkill(skill);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/getSkills", method = RequestMethod.GET)
    public @ResponseBody
    String getSkills() throws JsonProcessingException {
        Collection skills = skillService.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(skills);
        return json;
    }

    @RequestMapping(value = "/getSkillsByName", method = RequestMethod.GET)
    public @ResponseBody
    String getSkillsByName(@RequestParam("name") String name) throws JsonProcessingException {
        Collection skills = skillService.findByName(name);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(skills);
        return json;
    }

    @RequestMapping(value = "/getSkillsByProficiency", method = RequestMethod.GET)
    public @ResponseBody
    String getSkillsByProficiency(@RequestParam("proficiency") String proficiency) throws JsonProcessingException {
        Collection skills = skillService.findByProficiency(proficiency);
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(skills);
        return json;
    }

}
