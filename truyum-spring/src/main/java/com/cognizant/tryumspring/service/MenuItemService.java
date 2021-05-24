package com.cognizant.tryumspring.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.tryumspring.model.MenuItem;
import com.cognizant.tryumspring.repository.MenuItemRepository;

@Service
public class MenuItemService 
{
	@Autowired
	MenuItemRepository menuItemRepository;
	
	public List<MenuItem> getMenuItemListAdmin(){
		return menuItemRepository.findAll();
	}
	
	public List<MenuItem> getMenuItemListCustomer()
	{
		boolean active=true;
		LocalDate dateOfLaunch=LocalDate.of(2020, 12,25);
		List<MenuItem> menuItem=menuItemRepository.getMenuItemListCustomer(active, dateOfLaunch);
		return menuItem;
	}
	
	public void modifyMenuItem(MenuItem menuItem)
	{
		
		menuItemRepository.save(menuItem);
	}
	
	public MenuItem getMenuItem(long menuItemId)
	{
	MenuItem menuItem=menuItemRepository.findById(menuItemId).orElse(null);
	return menuItem;
	}	
}

