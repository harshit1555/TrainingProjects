package com.cognizant.microservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.model.Loan;
import com.cognizant.microservice.repository.LoanRepo;

@Service
public class LoanService
{
	@Autowired
	LoanRepo loanRepo;
	@Transactional
	public Loan addLoan(Loan loan)
	{
		return loanRepo.save(loan);
	}
	public Loan getLoan(long number)
	{
		Loan loan=loanRepo.findById(number).orElse(null);
		return loan;
	}
}
