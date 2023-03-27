/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Service;

import com.example.StudentAndCourseManagement.Domain.Student;
import com.example.StudentAndCourseManagement.Repocitory.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class StudentService {
   
    @Autowired
    private StudentRepository repo;
	
	public List<Student> listAll() 
	{
		 return repo.findAll();
    }
     
 
    public void save(Student std) {
        repo.save(std);
    }
     
    public Student get(String id) {
        return repo.findById(id).get();
    }
     
   public void delete(String id) {
        repo.deleteById(id);}
    /**
     *
     * @param keyword
     * @return
     */
    public List<Student> findByKeyword(String keyword){
       return repo.findByKeyword(keyword);
       }
    
}
