package com.cognizant.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.model.Account;
import com.cognizant.microservice.service.AccountService;

@RestController
@RequestMapping("/bank-account")
public class AccountController 
{
	@Autowired
	AccountService accountService;
	@PostMapping("/addaccount")
	public Account addAccount(@RequestBody Account account)
	{
		return accountService.addAccount(account);
	}
	@GetMapping("/account/{number}")
	public Account getAccount(@PathVariable String number)
	{
		return accountService.getAccount(Long.parseLong(number));
	}
	
}
