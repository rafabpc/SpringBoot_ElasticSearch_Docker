package com.application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "skill", type = "skills")
public class Skill {

    @Id
    private String id;
    private String name;
    private String description;
    private String proficiency;

    public Skill(){

    }

    public Skill(String id, String name, String description, String proficiency){
        this.id = id;
        this.name = name;
        this.description = description;
        this.proficiency = proficiency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", proficiency='" + proficiency + '\'' +
                '}';
    }
}
