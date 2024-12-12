package com.personal_expense.backend.pexBackend.income;

import com.personal_expense.backend.pexBackend.models.Income.Income;
import com.personal_expense.backend.pexBackend.models.Income.IncomeDao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@CrossOrigin
public class IncomeController {

    @Autowired
    IncomeDao inc;

    @GetMapping("/get-incomes")
    public Collection<Income> getAll(){
        return inc.getAllIncomes();
    }

//    public List<Income> getAll(){
//        return inc.getAllIncomes();
//    }

    @DeleteMapping("/delete-income/{id}")
    public void deleteIncome(@PathVariable String id){
        inc.deleteIncome(id);
    }

    @PostMapping("/add-income")
    public Income addIncome(@RequestBody @Valid Income incm){
        return inc.addIncome(incm);
    }
}
