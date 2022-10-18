package com.bank.account.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bank.account.entity.User;

@Service
public interface UserService {
	
	public User saveUser(User user);

	public List<User> getList();

	public User getUserById(Integer id);

	
}
