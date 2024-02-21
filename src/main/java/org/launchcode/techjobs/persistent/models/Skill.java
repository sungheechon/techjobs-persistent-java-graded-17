package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {


    @NotNull
    @Size(min=2, max=500, message="Description must be at least 2 characters long")
    private String description;



    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();



    public Skill() {}

    public Skill(String description) {
        this.description = description;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public List<Job> getJobs() {
        return jobs;
    }

//    public void setJobs(List<Job> jobs) {
//        this.jobs = jobs;
//    }

}
