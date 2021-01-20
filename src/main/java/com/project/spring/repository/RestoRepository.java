package com.project.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spring.models.RestoModel;


@Repository
public interface RestoRepository extends JpaRepository<RestoModel, Long>{
	

}
