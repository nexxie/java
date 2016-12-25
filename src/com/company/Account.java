package com.company;

import java.math.BigDecimal;

/**
 * Created by nexxie on 25.12.2016.
 */
public class Account {
//

    private double amount;
    private int id;
    private String name;
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(int id, String name, BigDecimal balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }
}

