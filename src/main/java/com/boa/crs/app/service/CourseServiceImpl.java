package com.boa.crs.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.crs.app.entity.CourseEntity;
import com.boa.crs.app.repo.CourseRepository;

public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public void addCourse(CourseEntity course) {
		courseRepository.save(course);
		
	}

	@Override
	public void updateCourse(Long courseId, CourseEntity course) {
		CourseEntity courseExists = courseRepository.findById(courseId).get();
		if(null != courseExists) {
			courseRepository.save(course);
		}
		
	}

	@Override
	public void removeCourse(Long courseId) {
		CourseEntity courseExists = courseRepository.findById(courseId).get();
		if(null != courseExists) {
			courseRepository.deleteById(courseId);
		}
		
	}

	//Admin Course operation 
	// Student Course Operation 
	
}
