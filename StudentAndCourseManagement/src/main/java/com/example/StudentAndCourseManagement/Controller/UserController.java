/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Controller;

import com.example.StudentAndCourseManagement.Domain.User;
import com.example.StudentAndCourseManagement.Service.UserService;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author DELL
 */
@Controller
public class UserController {
   @Autowired
    private UserService userService;
 
                                   
    @GetMapping("/login")
           
    public ModelAndView login() {
    	ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new User());
        return mav;
    } 
    
    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user ) {
    	
    	User oauthUser = userService.login(user.getUsername(), user.getPassword());
    	
 
    	System.out.print(oauthUser);
    	if(Objects.nonNull(oauthUser)) 
    	{	
  
    		return "redirect:/home";
    	
    		
    	} else {
    		return "redirect:/login";
    		
    	
    	}
 
}
    
}
