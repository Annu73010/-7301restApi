package com.bank.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.entity.CollegeEntity;
import com.bank.account.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email,Integer>{

	public List<Email> findByUserid(Integer userid);
	
}
