package com.combs.newdojos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.combs.newdojos.models.Dojo;
import com.combs.newdojos.models.Ninja;
import com.combs.newdojos.services.DojoService;
import com.combs.newdojos.services.NinjaService;

@Controller
public class Home {
	@Autowired
	private DojoService dojos;
	@Autowired
	private NinjaService ninjas;

	
	//ALL Rendering GET Routes
	
	@GetMapping("/")
	public String index(@ModelAttribute("newdojo") Dojo dojo, Model model) {
		model.addAttribute("allDojos", dojos.allDojos());
		return "index.jsp";
	}


	// New Ninja
	@GetMapping("/new/ninja")
	public String createninja(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result, Model model) {
		model.addAttribute("allDojos", dojos.allDojos());

		return "newninja.jsp";
	}
	
	//ALL process POST/ Redirect Routes
	
	// Add Dojo
	@PostMapping("/new/dojo")
	public String createDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult results) {
		if (results.hasErrors()) {
			return "index.jsp";
		} else {
			dojos.createDojo(dojo);
			return "redirect:/";
		}
	}

	//Add Ninja
	@PostMapping("/new/ninja")
	public String createninjas(@Valid @ModelAttribute("newninja") Ninja ninja, BindingResult result, Model model) {
		model.addAttribute("allDojos", dojos.allDojos());
		if (result.hasErrors()) {
			return "newninja.jsp";
		} else {
			ninjas.createNinja(ninja);
			return "redirect:/";
		}
	}

	//SHOW both by id
	@GetMapping("/show/dojo/{id}")
	public String showdojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("findDojo", dojos.findDojo(id));
		return "show.jsp";
	}

	@GetMapping("/show/ninja/{id}")
	public String showninja(@PathVariable("id") Long id, Model model) {
		model.addAttribute("findNinja", ninjas.findNinja(id));
		return "showninja.jsp";
	}
}
