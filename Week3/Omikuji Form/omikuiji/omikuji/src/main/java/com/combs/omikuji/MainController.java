package com.combs.omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String mainpage() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String omikujjishow(HttpSession session, Model model) {
		String resultvariable = (String) session.getAttribute("connect");
		model.addAttribute("resultvariable",resultvariable);
		return "results.jsp";
	}
	
	@PostMapping("/processForm")
	public String processForm(
			@RequestParam("picknumber") int picknumber,
			@RequestParam("place") String place,
			@RequestParam("name") String name,
			@RequestParam("thingtodo") String thingtodo,
			@RequestParam("livingthing") String livingthing,
			@RequestParam("payitfwd") String payitfwd,
			HttpSession session
			) {
			
			String connect = String.format(
					"In %s, you will live in %s, with %s as your roommate, selling %s. The next time you see %s, you will have good luck. Also, %s ", picknumber,place,name,thingtodo,livingthing,payitfwd);
			session.setAttribute("connect", connect);
			 
			
			return "redirect:/omikuji/show";
		}
}


