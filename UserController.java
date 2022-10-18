package com.bank.account.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bank.account.entity.User;
import com.bank.account.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService service;

//	To save the User record in DB
	@PostMapping("/save")
	public ResponseEntity<User> save(@RequestBody User user){
		User saveduser = service.saveUser(user);
		return new ResponseEntity<>(saveduser,HttpStatus.OK);
	}
	
//	To get user using its userId
	@GetMapping("/user_id/{id}")
	public ResponseEntity<User> getUser(@PathVariable ("id") Integer id){
		User getuser = service.getUserById(id);
		return new ResponseEntity<>(getuser,HttpStatus.OK);
	}
	
//	To get the list of all users from DB
	@GetMapping("/list")
	public ResponseEntity<List<User>> listOfUsers(){
		List<User> listofusers = service.getList();
		return new ResponseEntity<>(listofusers,HttpStatus.OK);
	}
	
}
