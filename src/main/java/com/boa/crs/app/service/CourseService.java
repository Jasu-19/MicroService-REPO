package com.boa.crs.app.service;

import com.boa.crs.app.entity.CourseEntity;

public interface CourseService {
	
	public void addCourse(CourseEntity course);
	public void updateCourse(Long courseId, CourseEntity course);
	public void removeCourse(Long courseId);
	
}
