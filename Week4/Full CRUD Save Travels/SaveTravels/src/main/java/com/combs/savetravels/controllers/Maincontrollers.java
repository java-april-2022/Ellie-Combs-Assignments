package com.combs.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.combs.savetravels.models.Expense;
import com.combs.savetravels.services.ExpensiveService;


@Controller 
public class Maincontrollers {
	@RequestMapping 
	public String index() {
		return "index.jsp";
	}

	@Autowired
	private ExpensiveService Injection;

	//Show all 
	@GetMapping("/")
	public String index(@ModelAttribute("newExpense")Expense newExpense, Model saveModel) {
		List<Expense> expenses= Injection.getAllexpense();
		saveModel.addAttribute("allExpenses",expenses);
		return "index.jsp";
	}
	
	//Add Expense(get/post)
	@PostMapping("/create")
	public String createExpense(@Valid @ModelAttribute("newExpense")Expense newExpense, BindingResult results, Model saveModel) {
		if(results.hasErrors()) {
			List<Expense> expenses= Injection.getAllexpense();
			saveModel.addAttribute("allExpenses",expenses);
			return "index.jsp";
		}
		Injection.createExpense(newExpense);
		return "redirect:/";
	}

	//Delete Expense(delete)
    @DeleteMapping("/delete/{id}")
    public String deleteExpense(@PathVariable("id") Long id) {
        Injection.deleteExpense(id);
        return "redirect:/";
    }
    
    @GetMapping("expenseDetails/{id}")
    public String expenseDetails(@PathVariable Long id, Model model) {
    	Expense expense = Injection.expenseDetails(id);
    	model.addAttribute("expense",expense);
    	return "index.jsp";
    }

	//Update Expense(get/put)
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable Long id, Model model) {
		Expense editExpense=Injection.expenseDetails(id);
		model.addAttribute("editExpense", editExpense);
		return "edit.jsp";
	}
	
    @PutMapping("/update/{id}")
    public String updateExpense(@Valid @ModelAttribute("editExpense") Expense editExpense, @PathVariable Long id) {
    	Injection.updateExpense(editExpense);
        return "redirect:/";
    }
    
}
    
	
