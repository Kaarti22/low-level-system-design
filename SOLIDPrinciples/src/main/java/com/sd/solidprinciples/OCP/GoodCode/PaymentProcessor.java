package com.sd.solidprinciples.OCP.GoodCode;

public class PaymentProcessor {

    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
