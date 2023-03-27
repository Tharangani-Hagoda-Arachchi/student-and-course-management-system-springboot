 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Service;

import com.example.StudentAndCourseManagement.Domain.Course;
import com.example.StudentAndCourseManagement.Repocitory.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class CourseService {
    @Autowired
    private CourseRepository repo;
       public void save(Course cs) {
        repo.save(cs);
    }
     
     
   
     public List<Course> listAll() {
        return repo.findAll();
    }
    
     public void delete(String id) {
        repo.deleteById(id);
    }
      public Course get(String id) {
        return repo.findById(id).get();
        
    }
       
       
       public List<Course> findByKeyword(String keyword){
       return repo.findByKeyword(keyword);
       }
 
}
