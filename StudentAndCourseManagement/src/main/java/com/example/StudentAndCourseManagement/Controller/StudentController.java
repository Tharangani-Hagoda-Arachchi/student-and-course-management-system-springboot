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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DELL
 */
@Controller
@RequestMapping("/Student")
public class StudentController {
    
     @Autowired
	    private StudentService service;
	 
	 
	    
	    
	    
	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveStudent(@ModelAttribute("student") Student std) 
	    {
	        service.save(std);
	        return "redirect:/student";
	    }
	    
 
	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditStudentPage(@PathVariable(name = "id") String id) {
	        ModelAndView mav = new ModelAndView("addstudent");
	        
		
	        Student std = service.get(id);
	        mav.addObject("student", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteStudentPage(@PathVariable(name = "id") String id) {
	        service.delete(id);
	        return "redirect:/student";
	    }
	
}
