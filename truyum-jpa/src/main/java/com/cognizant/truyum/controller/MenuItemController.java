package com.cognizant.truyum.controller;

//import javax.validation.Valid;
import com.cognizant.truyum.service.*;
import com.cognizant.truyum.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class MenuItemController 
{
	@Autowired
	MenuItemService menuItemService;
private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);

	
//	@ResponseBody
	@GetMapping("/show-menu-list-admin")
	public String showMenuItemListAdmin(ModelMap model){
		LOGGER.info("Start");
//		menuItemService.addMenuItem();
		model.addAttribute("menuItemList", menuItemService.getMenuItemListAdmin());
		LOGGER.info("End");
		
		return "menu-item-list-admin";
//		return "HELLO";
	}
	
	@GetMapping("/show-menu-list-customer")
	public String showMenuItemListCustomer(ModelMap model){
		LOGGER.info("Start");
		model.addAttribute("menuItemList", menuItemService.getMenuItemListCustomer());
		LOGGER.info("End");
		return "menu-item-list-customer";
	}
	
	@GetMapping("/show-edit-menu-item")
	public String showEditMenuItem(@RequestParam long menuItemId, ModelMap model) {
		LOGGER.info("Start");
		model.addAttribute("menuItem",menuItemService.getMenuItem(menuItemId));
		LOGGER.info("End");
		return "edit-menu-item";
	}
	
	@PostMapping("/edit-menu-item")
	public String editMenuItem(@ModelAttribute("menuItem") @Validated MenuItem menuItem, BindingResult bindingResult) {
		LOGGER.info("Start");
		if(bindingResult.hasErrors()) {
			return "edit-menu-item";
		}
		menuItemService.modifyMenuItem(menuItem);
		LOGGER.info("End");
		return "edit-menu-item-status";
	}
}
