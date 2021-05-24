package com.cognizant.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.model.Loan;
import com.cognizant.microservice.service.LoanService;

@RestController
@RequestMapping("/bank-loan")
public class LoanController 
{
	@Autowired
	LoanService loanService;
	@PostMapping("/addLoan")
	public Loan addLoan(@RequestBody Loan loan)
	{
		return loanService.addLoan(loan);
	}
	@GetMapping("/loan/{number}")
	public Loan getLoan(@PathVariable String number)
	{
		return loanService.getLoan(Long.parseLong(number));
	}

}
