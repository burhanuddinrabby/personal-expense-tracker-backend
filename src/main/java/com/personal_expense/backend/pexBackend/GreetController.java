package com.personal_expense.backend.pexBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    @GetMapping("/")
    public String hello(){
        return "personal expense tracker api";
    }
}
