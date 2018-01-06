package com.example.suchal.quiz.Model;

/**
 * Created by Hashim Ali Khan on 1/4/2018.
 */

public class Donation {
    float amount;
    String slip_path;
    bankAccount bank_account;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getSlip_path() {
        return slip_path;
    }

    public void setSlip_path(String slip_path) {
        this.slip_path = slip_path;
    }
}
