 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Service;

import com.example.StudentAndCourseManagement.Domain.User;
import com.example.StudentAndCourseManagement.Repocitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
public class UserService {
   @Autowired 
   private UserRepository repo;
  
  public User login(String username, String password) {
	  User user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }
  
}
