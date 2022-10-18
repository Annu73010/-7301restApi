package com.bank.account.service;

import java.util.List;

import com.bank.account.entity.Email;

public interface EmailService {

	Email saveEmail(Email email);

	List<Email> getListByUserId(Integer userid);

}
