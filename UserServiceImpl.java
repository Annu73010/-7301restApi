package com.bank.account.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bank.account.entity.User;
import com.bank.account.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo repo;

	@Override
	public User saveUser(User user) {
		return repo.save(user);
	}

	@Override
	public List<User> getList() {
		return repo.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return repo.findById(id).get();
	}
	
}
