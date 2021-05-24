package com.cognizant.microservice.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.microservice.model.MenuItem;
import com.cognizant.microservice.repository.MenuItemRepo;

@Service
public class MenuItemService 
{
	@Autowired
	MenuItemRepo menuItemRepo;
	@Transactional
	public MenuItem addMenuIeItem(MenuItem menuItem)
	{
		return menuItemRepo.save(menuItem);
	}
	public MenuItem getMenuItem(Long menuItemId)
	{
		MenuItem menuItem=menuItemRepo.findById(menuItemId).orElse(null);	
				return menuItem;
	}
	
}
