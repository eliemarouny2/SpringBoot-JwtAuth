package com.project.spring.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.spring.models.User;
import com.project.spring.models.VisitModel;
import com.project.spring.repository.VisitRepository;


@Service
public class VisitService {
	
@Autowired
public
VisitRepository visitrepository;


public List<VisitModel> getAllVisits( ){
	return visitrepository.findAll();
}

public void addNewVisit(VisitModel model){
	 visitrepository.save(model);
}
public void DeleteVisit(VisitModel model){
	 visitrepository.delete(model);
}

}
