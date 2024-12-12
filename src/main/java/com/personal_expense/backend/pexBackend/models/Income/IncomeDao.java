package com.personal_expense.backend.pexBackend.models.Income;

import org.springframework.data.relational.core.sql.In;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Component
public class IncomeDao {
    static List<Income> list = new ArrayList<>();

    private Map<String, Income> db = new HashMap<>(){
//        {
//            Income inc = new Income("income3", "300", "date3", "cat3", "desc3");
//            inc.setId("1");
//            put(inc.getId(), inc);
//        }
    };

    static {
        list.add(new Income("income 1", "200", "date", "category", "description"));
        list.add(new Income("income 2", "100", "date2", "category2", "description2"));
    }

//    public List<Income> getAllIncomes(){
//        return list;
//    }

    public Collection<Income> getAllIncomes(){
        return db.values();
    }

    public void deleteIncome(String id){
        Income income = db.remove(id);
        if (income == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public Income addIncome(Income inc){
        inc.setId(UUID.randomUUID().toString());
        db.put(inc.getId(), inc);
        return inc;
    }

}
