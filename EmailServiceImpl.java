package com.bank.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.entity.Email;
import com.bank.account.repository.EmailRepository;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	EmailRepository repo;
	
	@Override
	public Email saveEmail(Email email) {
		return repo.save(email);
	}

	@Override
	public List<Email> getListByUserId(Integer userid) {
		return repo.findByUserid(userid);
	}

}
