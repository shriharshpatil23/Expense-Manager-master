package com.Group_No_25.Expense_Manager.utils;

public class ExpenseList {

    String category;
    int amount;

    public ExpenseList(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
