package com.example.suchal.quiz.Model;

import java.util.Date;

/**
 * Created by Hashim Ali Khan on 1/4/2018.
 */

public class financialHistory {
    String name;
    float amount;
    Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
