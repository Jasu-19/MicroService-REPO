package com.boa.crs.app.service;

import java.util.List;

import com.boa.crs.app.entity.GradesEntity;

public interface ReportsService {
	
	public List<GradesEntity> generateReportForAll();
	public GradesEntity viewgrade(Long StudentId);
	public void assignGrade(Long StudentId, GradesEntity grade);


}
