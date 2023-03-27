/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.StudentAndCourseManagement.Repocitory;

import com.example.StudentAndCourseManagement.Domain.Course;
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
public interface CourseRepository extends JpaRepository<Course, String> {
    @Query(value="select * from Course c where c.id like %:keyword% or c.name like %:keyword% or c.duration like %:keyword% or c.status like %:keyword%",nativeQuery=true )
   List<Course> findByKeyword(@Param("keyword") String keyword);
}
