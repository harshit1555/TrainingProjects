package com.cognizant.microservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.model.Account;
import com.cognizant.microservice.repository.AccountRepo;

@Service
public class AccountService 
{
	@Autowired
	AccountRepo accountRepo;
	@Transactional
	public Account addAccount(Account account)
	{
		return accountRepo.save(account);
	}
	public Account getAccount(Long accountNumber)
	{
		Account account=accountRepo.findById(accountNumber).orElse(null);
		return account;
	}
}
