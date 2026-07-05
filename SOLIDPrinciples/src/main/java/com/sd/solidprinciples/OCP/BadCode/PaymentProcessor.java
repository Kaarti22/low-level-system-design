package com.sd.solidprinciples.OCP.BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount) {
        if(paymentMethod.equals("CreditCard")){
            // business logic
            System.out.println("Making payment via credit card: " + amount);
        } else if (paymentMethod.equals("DebitCard")){
            System.out.println("Making payment via debit card: " + amount);
        } else if (paymentMethod.equals("Paypal")){
            System.out.println("Making payment via Paypal: " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }
}
