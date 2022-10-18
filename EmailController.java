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
import com.bank.account.entity.Email;
import com.bank.account.service.EmailService;

@RestController
@RequestMapping("/emails")
public class EmailController {

	@Autowired
	EmailService service;
	
	@PostMapping("/save")
	public ResponseEntity<Email> save(@RequestBody Email email){
		Email savedemail = service.saveEmail(email);
		return new ResponseEntity<>(savedemail,HttpStatus.OK);
	}
	
	@GetMapping("/user-id/{userid}")
	public ResponseEntity<List<Email>> getByUserId(@PathVariable("userid") Integer userid){
		List<Email> list = service.getListByUserId(userid);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
}
