package com.cognizant.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.microservice.model.MenuItem;
import com.cognizant.microservice.service.MenuItemService;

@RestController
public class MenuItemController 
{
	@Autowired
	MenuItemService menuItemService;
	@PostMapping("/addMenuItem")
	public MenuItem addMenuItem(@RequestBody MenuItem menuItem)
	{
		return menuItemService.addMenuIeItem(menuItem);
	}
	@GetMapping("/menuItem/{id}")
	public MenuItem getMenuItem(@PathVariable String id)
	{
		return menuItemService.getMenuItem(Long.parseLong(id));
	}
}
