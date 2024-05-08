package com.boa.crs.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.boa.crs.app.entity.GradesEntity;
import com.boa.crs.app.repo.GradesRepository;

public class ReportsServiceImpl implements ReportsService {
	
	@Autowired
	GradesRepository gradesrepo;

	@Override
	public List<GradesEntity> generateReportForAll() {
		return gradesrepo.findAll();
		
		
	}

	@Override
	public GradesEntity viewgrade(Long StudentId) {
		return gradesrepo.findById(StudentId).get();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignGrade(Long StudentId, GradesEntity grade) {
		// TODO Auto-generated method stub
		Optional<GradesEntity> grades = gradesrepo.findById(StudentId);
		if(grades.isPresent())
		{
			gradesrepo.save(grade);
		}
		
	}

	
	// Generate Report // Admin
	// Assign Grade :-- Professor
	// View Grad  :-- Student 
}
