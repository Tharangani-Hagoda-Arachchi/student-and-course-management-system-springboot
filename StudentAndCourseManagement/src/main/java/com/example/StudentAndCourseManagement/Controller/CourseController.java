/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Controller;

import com.example.StudentAndCourseManagement.Domain.Course;
import com.example.StudentAndCourseManagement.Repocitory.CourseRepository;
import com.example.StudentAndCourseManagement.Service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DELL
 */
@Controller
@RequestMapping("/Course")
public class CourseController {
    
  @Autowired
	  private CourseService service;
  @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveCourse(@ModelAttribute("course") Course cs) 
	    {
	        service.save(cs);
	        return "redirect:/course";
	    }
	    
    
 
            
            @RequestMapping("/edit/{id}")
	    public ModelAndView showEditCoursePage(@PathVariable(name  = "id") String id) {
	        ModelAndView mav = new ModelAndView("addcourse");
	        Course course = service.get(id);
	        mav.addObject("course", course);
	        return mav;
	        
	    }
	    @RequestMapping( value="/delete/{id}"  )
	    public String deleteCoursePage(@PathVariable(name = "id") String id) {
	        service.delete(id);
                
	        return "redirect:/course";
            }
            
             
}
