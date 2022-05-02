package com.combs.savetravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.combs.savetravels.models.Expense;
import com.combs.savetravels.repositories.ExpenseRepository;

@Service

public class ExpensiveService {
	@Autowired
	private ExpenseRepository expenseRepo;
	
	public List<Expense> getAllexpense(){
	//Business logic
	return expenseRepo.findAll();
	}

//Create new Expense
	public void createExpense(Expense expense) {
		expenseRepo.save(expense);
		
	}
	
//Update Expense
	public void updateExpense(Expense expense) {
		expenseRepo.save(expense);
	}
	
//Delete Expense
	public void deleteExpense(Long id) {
		expenseRepo.deleteById(id);
	}
	
//Get Expense-Details
	public Expense expenseDetails(Long id) {
		return expenseRepo.findById(id).orElse(null);
	}
}

