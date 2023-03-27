/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Repocitory;

import com.example.StudentAndCourseManagement.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
  	User findByUsernameAndPassword(String username, String password);  
}
