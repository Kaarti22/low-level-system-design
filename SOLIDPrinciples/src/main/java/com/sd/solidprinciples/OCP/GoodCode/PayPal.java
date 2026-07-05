package com.sd.solidprinciples.OCP.GoodCode;

public class PayPal implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via PayPal " + amount);
    }
}
