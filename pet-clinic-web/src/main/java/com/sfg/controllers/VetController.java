package com.sfg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sfg.services.VetService;

@Controller
public class VetController {
	private VetService vetService;
	
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}


	@RequestMapping({"/vets","vets/index","/vets/index.html"})
	public String getVets(Model model) {
		model.addAttribute("vets",vetService.findAll());
		return "/vets/Index";
	}

}
