package com.personal_expense.backend.pexBackend.expense;

import com.personal_expense.backend.pexBackend.models.Expense.Expense;
import com.personal_expense.backend.pexBackend.models.Expense.ExpenseDao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
public class ExpenseController {

    @Autowired
    ExpenseDao exp;

    @GetMapping("/get-expenses")
    public Collection<Expense> getAll(){
        return exp.getAllExpense();
    }

//    public List<Income> getAll(){
//        return inc.getAllIncomes();
//    }

    @DeleteMapping("/delete-expense/{id}")
    public void deleteIncome(@PathVariable String id){
        exp.deleteExpense(id);
    }

    @PostMapping("/add-expense")
    public Expense addIncome(@RequestBody @Valid Expense expn){
        return exp.addExpense(expn);
    }
}
