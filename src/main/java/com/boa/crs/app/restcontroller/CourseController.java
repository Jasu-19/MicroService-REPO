package com.boa.crs.app.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.app.entity.CourseEntity;
import com.boa.crs.app.service.CourseService;

@RestController
@RequestMapping("/crs-services/api/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public String addCourse(CourseEntity course)
	{
		 courseService.addCourse(course);
		 return "Course Added Successfully";
		 
	}
	
	@DeleteMapping
	public String removeCourse(Long courseId)
	{
		courseService.removeCourse(courseId);
		return "Course Removed Successfully";
		
	}
	
	@PutMapping
	public String updateCourse(Long courseId, CourseEntity course) {
		courseService.updateCourse(courseId, course);
		return "Course Updated Successfully";
		
	}
	
	
	

}
