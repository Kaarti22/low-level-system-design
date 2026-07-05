package com.sd.solidprinciples.GoodCode;

public class Invoice {
    public double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated & printed for amount " + amount);
    }
}
