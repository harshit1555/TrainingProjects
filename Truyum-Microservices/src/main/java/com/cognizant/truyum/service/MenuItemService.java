package com.cognizant.truyum.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepo;

@Service
public class MenuItemService 
{
	@Autowired
	MenuItemRepo menuItemRepo;
	
	public MenuItem getMenuItem(Long id)
	{
		return menuItemRepo.findById(id).orElse(null);
	}
	@Transactional
	public MenuItem addMenuItem(MenuItem menuItem)
	{
		return menuItemRepo.save(menuItem);
	}
	public List<MenuItem> getAllMenuItem()
	{
		List<MenuItem> menuItems=menuItemRepo.findAll();
		return menuItems;
	}
	
}
