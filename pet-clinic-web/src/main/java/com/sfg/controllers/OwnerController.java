package com.sfg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfg.services.OwnerService;

@Controller
public class OwnerController {
	
	OwnerService ownerService;
	
	

	public OwnerController(OwnerService ownerService) {		
		this.ownerService = ownerService;
	}



	@RequestMapping({"/owners","/owners/index","/owners/index.html"})
	public String getOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		return "/owners/index";
	}
}
