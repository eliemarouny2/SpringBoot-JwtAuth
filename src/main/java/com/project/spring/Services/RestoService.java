package com.project.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.spring.models.RestoModel;
import com.project.spring.repository.RestoRepository;


@Service
public class RestoService {
	
@Autowired
RestoRepository restorepository;


public List<RestoModel> getAllRestos(){
	return restorepository.findAll();
}


}
