package com.cognizant.truyum.controller;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@RestController
@RequestMapping("/menu-item")
public class MenuItemController 
{
	@Autowired
	MenuItemService menuItemService;
	@PostConstruct
	public void init()
	{
		MenuItem menuitem=new MenuItem(1,"Cold Coffee",90,true,LocalDate.of(2018, 12, 21), "Drinks", true);
		menuItemService.addMenuItem(menuitem);
		MenuItem menuitem2=new MenuItem(2,"Brownie",80,false,LocalDate.of(2017, 12, 20), "Deserts", true);
		menuItemService.addMenuItem(menuitem2);
		MenuItem menuitem3=new MenuItem(3,"Burger",200,true,LocalDate.of(2019, 9, 11), "Starters", true);
		menuItemService.addMenuItem(menuitem3);
		MenuItem menuitem4=new MenuItem(4,"Sandwich",150,true,LocalDate.of(2020, 10, 27), "Starters", true);
		menuItemService.addMenuItem(menuitem4);
		MenuItem menuitem5=new MenuItem(5,"Pizza",250,true,LocalDate.of(2018, 9, 5), "Main Course", true);	
		menuItemService.addMenuItem(menuitem5);
		MenuItem menuitem6=new MenuItem(6,"Choco Lava Cake",150,false,LocalDate.of(2019, 9, 11), "Starters", true);
		menuItemService.addMenuItem(menuitem6);
		MenuItem menuitem7=new MenuItem(7,"Dosaa",100,true,LocalDate.of(2022, 9, 21), "Starters", true);
		menuItemService.addMenuItem(menuitem7);
	}
	@PostMapping("/addItem")
	public MenuItem addMenuItem(@RequestBody MenuItem menuItem)
	{
		return menuItemService.addMenuItem(menuItem);
	}
	@GetMapping("/menuitem/{id}")
	public MenuItem getMenuItem(@PathVariable String id)
	{
		return menuItemService.getMenuItem(Long.parseLong(id));
	}
	@GetMapping("/MenuItemList")
	public List<MenuItem> getListOfMenuItem()
	{
		return menuItemService.getAllMenuItem();
	}
}
