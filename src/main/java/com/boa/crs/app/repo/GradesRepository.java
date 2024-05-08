package com.boa.crs.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.crs.app.entity.GradesEntity;

public interface GradesRepository extends JpaRepository<GradesEntity, Long> {

}
