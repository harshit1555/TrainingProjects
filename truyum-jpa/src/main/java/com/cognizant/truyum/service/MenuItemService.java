package com.cognizant.truyum.service;
import com.cognizant.truyum.repository.*;
import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cognizant.truyum.model.*;
@Service
public class MenuItemService 
{
	@Autowired
	MenuItemRepository menuItemRepository;
	
	@Transactional
	public List<MenuItem> getMenuItemListAdmin()
	{
		return menuItemRepository.findAll();
	}
	@Transactional
	public List<MenuItem> getMenuItemListCustomer()
	{
		boolean active=true;
		LocalDate dateOfLaunch=LocalDate.now();
		List<MenuItem> menuItem=menuItemRepository.getMenuItemListCustomer(active, dateOfLaunch);
		return menuItem;
	}
	@Transactional
	public void modifyMenuItem(MenuItem menuItem)
	{
		
		menuItemRepository.save(menuItem);
	}
	@Transactional
	public MenuItem getMenuItem(long menuItemId)
	{
	MenuItem menuItem=menuItemRepository.findById(menuItemId).orElse(null);
	return menuItem;
	}
	@Transactional
	public void addMenuItem()
	{
		MenuItem menuitem=new MenuItem("Cold Coffee",90,true,LocalDate.of(2018, 12, 21), "Drinks", true);
		menuItemRepository.save(menuitem);
		MenuItem menuitem2=new MenuItem("Brownie",80,false,LocalDate.of(2017, 12, 20), "Deserts", true);
		menuItemRepository.save(menuitem2);
		MenuItem menuitem3=new MenuItem("Burger",200,true,LocalDate.of(2019, 9, 11), "Starters", true);
		menuItemRepository.save(menuitem3);
		
	}
//	@Transactional
//	public void deleteMenuItem()
//	{
//		MenuItem menuItem=menuItemRepository.findById(0L).orElse(null);
//		menuItemRepository.delete(menuItem);
//	}
}

