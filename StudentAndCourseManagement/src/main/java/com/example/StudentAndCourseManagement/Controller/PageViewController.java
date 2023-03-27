/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Controller;

import com.example.StudentAndCourseManagement.Domain.Course;
import com.example.StudentAndCourseManagement.Domain.Student;
import com.example.StudentAndCourseManagement.Service.CourseService;
import com.example.StudentAndCourseManagement.Service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DELL
 */
@Controller
public class PageViewController {
    @Autowired
	  private CourseService service;
    @Autowired
    private StudentService sservice;
  
   
    @GetMapping(path = "/course")
    
    public String add(Model model, String keyword) {
        if(keyword != null){
             List<Course> listcourse = service.findByKeyword(keyword);
	        
              
               model.addAttribute("listcourse", listcourse);
	        
	    	
    }
        else{
       List<Course> listcourse = service.listAll();
	        model.addAttribute("listcourse", listcourse);
                
	         
        }
        
     
        return "course.html"; }
    @GetMapping(path = "/student")
    
    public String viewStudent(Model model, String keyword) {
        if(keyword != null){
             List<Student> liststudent = sservice.findByKeyword(keyword);
	      
               model.addAttribute("liststudent", liststudent);
	       model.addAttribute("student", new Student());
	    	
    }
        else{
       List<Student> liststudent = sservice.listAll();
       List<Course> listcourse = service.listAll();
	        model.addAttribute("liststudent", liststudent);
		    model.addAttribute("listcourse", listcourse);
	        
	         
        }
        
     
        return "student.html"; }
    
    
    
  
    
     @GetMapping("/addcourse")
	    public String add(Model model) {
	    	
	        model.addAttribute("course", new Course());
	        return "addcourse.html";
        
        
    }
    @GetMapping("/addstudent")
	    public String studentadd(Model model) {
	    	
	        model.addAttribute("student", new Student());
	        return "addstudent.html";
        
        
        
    }    
    
    
}
