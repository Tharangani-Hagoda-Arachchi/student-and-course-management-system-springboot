/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Repocitory;

import com.example.StudentAndCourseManagement.Domain.Student;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DELL
 */
@Repository
public interface StudentRepository  extends JpaRepository<Student, String>{
 @Query(value="select s.id,s.nic,s.sname, s.address, s.email,s.phone,s.fee c.name from student s Inner JOIN course c ON s.course=c.id", nativeQuery=true)
List<Object[]> findStudent();
 
@Query(value="select * from Student s where s.id like %:keyword% or s.sname like %:keyword% or s.nic like %:keyword% or s.course like %:keyword%",nativeQuery=true )
   List<Student> findByKeyword(@Param("keyword") String keyword);
}
