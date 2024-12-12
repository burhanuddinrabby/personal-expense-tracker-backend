package com.personal_expense.backend.pexBackend.models.Expense;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;


@Component
public class ExpenseDao {
    private Map<String, Expense> db = new HashMap<>(){
//        {
//            Income inc = new Income("income3", "300", "date3", "cat3", "desc3");
//            inc.setId("1");
//            put(inc.getId(), inc);
//        }
    };


//    public List<Income> getAllIncomes(){
//        return list;
//    }

    public Collection<Expense> getAllExpense(){
        return db.values();
    }

    public void deleteExpense(String id){
        Expense expense = db.remove(id);
        if (expense == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public Expense addExpense(Expense exp){
        exp.setId(UUID.randomUUID().toString());
        db.put(exp.getId(), exp);
        return exp;
    }

}