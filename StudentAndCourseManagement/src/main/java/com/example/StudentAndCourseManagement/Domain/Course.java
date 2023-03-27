/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */

@Entity
@Table(name="course")
public class Course implements Serializable {
    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String id;
	private String name;
        private String duration;
        private String status;
        private String description;

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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Course(String id, String name, String duration, String status, String description) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.status = status;
        this.description = description;
    }
    
    public Course() {
        
    }
        
        
}
