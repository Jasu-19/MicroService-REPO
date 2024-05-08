package com.boa.crs.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boa.crs.app.entity.UserDetailsEntity;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Long>{

}
