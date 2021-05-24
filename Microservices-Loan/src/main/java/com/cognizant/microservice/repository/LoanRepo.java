package com.cognizant.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.microservice.model.Loan;

public interface LoanRepo extends JpaRepository<Loan, Long> 
{

}
