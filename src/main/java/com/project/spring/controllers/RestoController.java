package com.project.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.Services.RestoService;
import com.project.spring.Services.UserService;
import com.project.spring.Services.VisitService;
import com.project.spring.models.RestoModel;
import com.project.spring.models.User;
import com.project.spring.models.VisitModel;


@RestController
@CrossOrigin(origins="*")
public class RestoController {
	@Autowired
	private RestoService restoservice;
	@Autowired
	private VisitService visitservice;
	@Autowired
	private UserService userservice;
	
	@GetMapping("/Restaurants")
	public List<RestoModel> getAllRestos(){
		
		return restoservice.getAllRestos();
		
		
	}
	@GetMapping("/Visits")
	public List<VisitModel> getAllVisits(){
		return visitservice.getAllVisits();
		
		
	}

    @PostMapping("/addVisit")
    public void addNewVisit(@RequestBody VisitModel model){
        visitservice.addNewVisit(model);
        
    }
    @DeleteMapping("/Visits/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable long id ){
        visitservice.visitrepository.deleteById(id);
        return ResponseEntity.notFound().build();
    }
	@GetMapping("/Users")
	public List<User> getAllUsers(){
		
		return userservice.getAllUsers();
		
		
	}
}
