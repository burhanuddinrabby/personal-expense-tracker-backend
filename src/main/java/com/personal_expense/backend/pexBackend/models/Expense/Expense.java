package com.personal_expense.backend.pexBackend.models.Expense;

import jakarta.validation.constraints.NotEmpty;

public class Expense {
    private String id, type;

    @NotEmpty
    private String title, amount, date, category, description;
    {
        this.type = "expense";
    }

    public Expense(String title, String amount, String date, String category, String description) {
        this.title = title;
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
