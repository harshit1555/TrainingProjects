package com.cognizant.restapi.controller;

import java.util.Date;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cognizant.restapi.dto.ErrorResponseDto;
import com.cognizant.restapi.exception.CountryNotFoundException;

@RestControllerAdvice
public class CountryErrorController 
{
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler({CountryNotFoundException.class,EntityNotFoundException.class})
	public ErrorResponseDto countryNotFoundException(Exception ex,HttpServletRequest request )
	{
		return new ErrorResponseDto(new Date(), HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), ex.getMessage(), request.getRequestURI());
	}
}
