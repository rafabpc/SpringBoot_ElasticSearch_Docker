package com.application.repository;

import com.application.model.Skill;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface SkillRepository extends ElasticsearchRepository<Skill, String> {

    List<Skill> findByName (String name);
    List<Skill> findByProficiency (String proficiency);

}
