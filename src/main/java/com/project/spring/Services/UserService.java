package com.project.spring.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.spring.models.User;
import com.project.spring.repository.UserRepository;

@Service
public class UserService {
	
@Autowired
UserRepository userrepository;


public List<User> getAllUsers(){
	return userrepository.findAll();
}


}
